package com.frogensource.mx.webapp.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.GetMapping


@Controller
class LoginController {

    @GetMapping("/login")
    fun loginPage(model: Model): String {

        return "login/loginPage"
    }

    @GetMapping("/resetPassword")
    fun resetPage(model: Model): String {

        return "login/resetPage"
    }

    @GetMapping("/signup")
    fun signupPage(model: Model): String {

        return "login/signupPage"
    }

}
