package needlesilk.secondhand.foundagainmarket.data.model

import androidx.annotation.StringRes
import needlesilk.secondhand.foundagainmarket.R

enum class ProductCategory(@field:StringRes val titleRes: Int) {
    CLOTHING(R.string.product_category_clothing_title),
    FURNITURE(R.string.product_category_furniture_title),
    ELECTRONICS(R.string.product_category_electronics_title),
    BOOKS_GAMES(R.string.product_category_books_games_title),
    HOME_DECOR(R.string.product_category_home_decor_title),
}
