package needlesilk.secondhand.foundagainmarket.di

import androidx.room.Room
import needlesilk.secondhand.foundagainmarket.data.database.YZCAOAppDatabase
import org.koin.dsl.module

private const val DB_NAME = "yzcao_db"

val databaseModule = module {
    single {
        Room.databaseBuilder(
            context = get(),
            klass = YZCAOAppDatabase::class.java,
            name = DB_NAME
        ).build()
    }

    single { get<YZCAOAppDatabase>().cartItemDao() }

    single { get<YZCAOAppDatabase>().orderDao() }
}