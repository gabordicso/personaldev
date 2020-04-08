package test

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/api/v1/test")
class TestChildService: TestBaseService<TestChildObject>() {
    // @Get(uri = "TestChildService-testMethodToBeOverridden")
    // override fun testMethodToBeOverridden() = super.testMethodToBeOverridden()
}