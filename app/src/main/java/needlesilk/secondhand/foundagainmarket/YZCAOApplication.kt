package needlesilk.secondhand.foundagainmarket

import android.app.Application
import needlesilk.secondhand.foundagainmarket.di.dataModule
import needlesilk.secondhand.foundagainmarket.di.dispatcherModule
import needlesilk.secondhand.foundagainmarket.di.viewModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class YZCAOApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        val appModules = dataModule + viewModule + dispatcherModule

        startKoin {
            androidLogger()
            androidContext(this@YZCAOApplication)
            modules(appModules)
        }
    }
}
