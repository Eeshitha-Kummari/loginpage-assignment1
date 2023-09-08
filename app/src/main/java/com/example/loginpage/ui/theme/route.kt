package com.example.loginpage.ui.theme

sealed class Routes(val route: String) {
    object Login : Routes("Login")
}