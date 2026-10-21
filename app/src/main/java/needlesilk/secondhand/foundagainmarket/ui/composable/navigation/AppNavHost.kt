package needlesilk.secondhand.foundagainmarket.ui.composable.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import needlesilk.secondhand.foundagainmarket.ui.composable.screen.cart.YZCAOCartScreen
import needlesilk.secondhand.foundagainmarket.ui.composable.screen.checkout.YZCAOCheckoutScreen
import needlesilk.secondhand.foundagainmarket.ui.composable.screen.home.YZCAOHomeScreen
import needlesilk.secondhand.foundagainmarket.ui.composable.screen.onboarding.YZCAOOnboardingScreen
import needlesilk.secondhand.foundagainmarket.ui.composable.screen.order.YZCAOOrdersScreen
import needlesilk.secondhand.foundagainmarket.ui.composable.screen.productdetails.YZCAOProductDetailsScreen
import needlesilk.secondhand.foundagainmarket.ui.composable.screen.settings.YZCAOSettingsScreen
import needlesilk.secondhand.foundagainmarket.ui.composable.screen.splash.YZCAOSplashScreen

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = NavRoute.Splash,
        modifier = modifier,
    ) {
        composable<NavRoute.Splash> {
            YZCAOSplashScreen(
                onNavigateToHomeScreen = {
                    navController.navigate(route = NavRoute.Home) {
                        popUpTo(navController.graph.startDestinationId) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                },
                onNavigateToOnboarding = {
                    navController.navigate(route = NavRoute.Onboarding) {
                        popUpTo(navController.graph.startDestinationId) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                }
            )
        }

        composable<NavRoute.Onboarding> {
            YZCAOOnboardingScreen(
                onNavigateToHomeScreen = {
                    navController.navigate(NavRoute.Home) {
                        popUpTo(NavRoute.Onboarding) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                }
            )
        }

        composable<NavRoute.Home> {
            YZCAOHomeScreen(
                onNavigateToProductDetails = { id: Int ->
                    navController.navigate(
                        route = NavRoute.ProductDetails(id = id)
                    )
                }
            )
        }

        composable<NavRoute.ProductDetails> { backStackEntry ->
            val productDetails: NavRoute.ProductDetails = backStackEntry.toRoute()
            YZCAOProductDetailsScreen(
                productId = productDetails.id,
            )
        }

        composable<NavRoute.Cart> {
            YZCAOCartScreen(
                onNavigateToCheckoutScreen = {
                    navController.navigate(NavRoute.Checkout)
                }
            )
        }

        composable<NavRoute.Checkout> {
            YZCAOCheckoutScreen(
                onNavigateToOrdersScreen = {
                    navController.navigate(NavRoute.Orders) {
                        popUpTo(NavRoute.Home) { inclusive = false }
                    }
                }
            )
        }

        composable<NavRoute.Orders> {
            YZCAOOrdersScreen()
        }

        composable<NavRoute.Settings> {
            YZCAOSettingsScreen()
        }
    }
}