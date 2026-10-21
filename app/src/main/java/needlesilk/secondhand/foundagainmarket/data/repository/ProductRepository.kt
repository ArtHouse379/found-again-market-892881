package needlesilk.secondhand.foundagainmarket.data.repository

import needlesilk.secondhand.foundagainmarket.data.model.Product
import needlesilk.secondhand.foundagainmarket.data.model.ProductCategory
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class ProductRepository {
    private val products = listOf<Product>(
        Product(
            id = 1,
            title = "Cotton T-Shirt",
            description = "A pre-owned white cotton T-shirt in very good condition. The fabric is soft, breathable, and free from visible marks. Its simple crew-neck cut works well for layering or everyday wear.",
            category = ProductCategory.CLOTHING,
            price = 8.50,
            imageUrl = "https://images.unsplash.com/photo-1521572163474-6864f9cf17ab",
        ),
        Product(
            id = 2,
            title = "Nike Running Shoes",
            description = "A lightly worn pair of Nike running shoes with clean red knit uppers. The soles retain good tread and the cushioning still feels supportive. They are a practical choice for casual runs, gym sessions, or daily errands.",
            category = ProductCategory.CLOTHING,
            price = 38.00,
            imageUrl = "https://images.unsplash.com/photo-1542291026-7eec264c27ff",
        ),
        Product(
            id = 3,
            title = "Velvet Sofa",
            description = "A pre-owned green velvet sofa with a neat mid-century profile. The upholstery is clean with only gentle signs of use, and the cushions remain firm. Its compact proportions suit a flat, study, or smaller living room.",
            category = ProductCategory.FURNITURE,
            price = 245.00,
            imageUrl = "https://images.unsplash.com/photo-1555041469-a586c61ea9bc",
        ),
        Product(
            id = 4,
            title = "Upholstered Armchair",
            description = "A cream upholstered armchair with a supportive buttoned back. It has been checked for stability and shows minor wear consistent with careful use. The neutral finish makes it easy to place in a bedroom or reading corner.",
            category = ProductCategory.FURNITURE,
            price = 95.00,
            imageUrl = "https://images.unsplash.com/photo-1567538096630-e0c55bd6374c",
        ),
        Product(
            id = 5,
            title = "Sony Mirrorless Camera",
            description = "A used Sony mirrorless camera supplied in working order. The body has light cosmetic wear, while the controls, screen, and lens mount have been checked. It is a capable option for learning photography or keeping as a compact travel camera.",
            category = ProductCategory.ELECTRONICS,
            price = 285.00,
            imageUrl = "https://images.unsplash.com/photo-1516035069371-29a1b244cc32",
        ),
        Product(
            id = 6,
            title = "MacBook Air",
            description = "A pre-owned MacBook Air that has been tested for everyday use. The display, keyboard, trackpad, and charging port work correctly, with modest marks on the casing. It is well suited to web browsing, study, and light office tasks.",
            category = ProductCategory.ELECTRONICS,
            price = 349.00,
            imageUrl = "https://images.unsplash.com/photo-1496181133206-80ce9b88a853",
        ),
        Product(
            id = 7,
            title = "Hardback Novel",
            description = "A gently read hardback novel with a clean cover and intact binding. The pages are complete, unmarked, and lightly aged at the edges. It is ready for another reader or a place on a favourite shelf.",
            category = ProductCategory.BOOKS_GAMES,
            price = 6.00,
            imageUrl = "https://images.unsplash.com/photo-1544947950-fa07a98d237f",
        ),
        Product(
            id = 8,
            title = "Strategy Board Game",
            description = "A pre-owned strategy board game with its board, cards, dice, and playing pieces included. The components have been counted and remain in good playable condition. It offers a thoughtful challenge for family evenings or small groups.",
            category = ProductCategory.BOOKS_GAMES,
            price = 18.00,
            imageUrl = "https://images.unsplash.com/photo-1610890716171-6b1bb98ffd09",
        ),
        Product(
            id = 9,
            title = "Adjustable Desk Lamp",
            description = "A second-hand metal desk lamp with an adjustable arm and shade. The switch and cable have been checked, and the dark finish shows only light handling marks. It provides focused light for a bedside table, desk, or craft space.",
            category = ProductCategory.HOME_DECOR,
            price = 22.00,
            imageUrl = "https://images.unsplash.com/photo-1534105615256-13940a56ff44",
        ),
        Product(
            id = 10,
            title = "Ceramic Vase",
            description = "A handmade ceramic vase in a rich burgundy glaze. This pre-owned piece is clean and free from chips or cracks, with textured details around the body. It works as a small flower vase or a decorative shelf accent.",
            category = ProductCategory.HOME_DECOR,
            price = 16.50,
            imageUrl = "https://images.pexels.com/photos/11889155/pexels-photo-11889155.jpeg",
        ),
    )

    fun observeById(id: Int): Flow<Product?> {
        val item = products.find { it.id == id }
        return flowOf(item)
    }

    fun getById(id: Int): Product? {
        return products.find { it.id == id }
    }

    fun observeAll(): Flow<List<Product>> {
        return flowOf(products)
    }
}
