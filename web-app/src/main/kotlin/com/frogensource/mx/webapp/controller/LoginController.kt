package com.frogensource.mx.webapp.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.GetMapping


@Controller
class LoginController {

    @GetMapping("/login")
    fun loginPage(@RequestParam(name = "name", required = false, defaultValue = "World") name: String, model: Model): String {

        model.addAttribute("name", name)

        return "loginPage"
    }

}
