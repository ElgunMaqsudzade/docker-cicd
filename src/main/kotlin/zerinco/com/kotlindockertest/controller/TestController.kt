package zerinco.com.kotlindockertest.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import zerinco.com.kotlindockertest.service.TestService

@RestController
class TestController(private val testService: TestService) {

    @GetMapping("/test")
    fun test() = testService.testFun()

}