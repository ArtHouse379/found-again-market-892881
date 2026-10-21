package needlesilk.secondhand.foundagainmarket.di

import needlesilk.secondhand.foundagainmarket.ui.viewmodel.AppViewModel
import needlesilk.secondhand.foundagainmarket.ui.viewmodel.CartViewModel
import needlesilk.secondhand.foundagainmarket.ui.viewmodel.CheckoutViewModel
import needlesilk.secondhand.foundagainmarket.ui.viewmodel.OnboardingViewModel
import needlesilk.secondhand.foundagainmarket.ui.viewmodel.OrderViewModel
import needlesilk.secondhand.foundagainmarket.ui.viewmodel.ProductDetailsViewModel
import needlesilk.secondhand.foundagainmarket.ui.viewmodel.ProductViewModel
import needlesilk.secondhand.foundagainmarket.ui.viewmodel.SplashViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModule = module {
    viewModel {
        AppViewModel(
            cartRepository = get()
        )
    }

    viewModel {
        SplashViewModel(
            onboardingRepository = get()
        )
    }

    viewModel {
        OnboardingViewModel(
            onboardingRepository = get()
        )
    }

    viewModel {
        ProductViewModel(
            productRepository = get(),
            cartRepository = get(),
        )
    }

    viewModel {
        ProductDetailsViewModel(
            productRepository = get(),
            cartRepository = get(),
        )
    }

    viewModel {
        CheckoutViewModel(
            cartRepository = get(),
            productRepository = get(),
            orderRepository = get(),
        )
    }

    viewModel {
        CartViewModel(
            cartRepository = get(),
            productRepository = get(),
        )
    }

    viewModel {
        OrderViewModel(
            orderRepository = get(),
        )
    }
}