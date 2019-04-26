package proj2

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.views.View

@Controller("/views")
class ViewsController {

    @View("home")
    @Get("/")
    fun index() = HttpResponse.ok(
            mapOf("loggedIn" to true,
                    "username" to "afonso")
    )
}