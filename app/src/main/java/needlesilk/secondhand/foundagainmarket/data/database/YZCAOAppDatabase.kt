package needlesilk.secondhand.foundagainmarket.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import needlesilk.secondhand.foundagainmarket.data.database.dao.CartItemDao
import needlesilk.secondhand.foundagainmarket.data.database.dao.OrderDao
import needlesilk.secondhand.foundagainmarket.data.database.converter.Converters
import needlesilk.secondhand.foundagainmarket.data.entity.CartItemEntity
import needlesilk.secondhand.foundagainmarket.data.entity.OrderEntity

@Database(
    entities = [CartItemEntity::class, OrderEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class YZCAOAppDatabase : RoomDatabase() {

    abstract fun cartItemDao(): CartItemDao

    abstract fun orderDao(): OrderDao
}