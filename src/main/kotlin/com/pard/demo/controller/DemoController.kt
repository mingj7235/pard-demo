package com.pard.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {
    @GetMapping("/demo/{name}")
    fun demo(
        @PathVariable name: String,
    ): String = "hello $name"
}
