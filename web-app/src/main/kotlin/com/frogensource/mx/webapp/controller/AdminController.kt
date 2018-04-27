package com.frogensource.mx.webapp.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/admin")
class AdminController {

    @GetMapping("/calendar")
    fun calendarPage(@RequestParam(name = "name", required = false, defaultValue = "World") name: String, model: Model): String {

        model.addAttribute("name", name)

        return "admin/calendarPage"
    }

}