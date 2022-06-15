package com.toyyib.plugins

import com.toyyib.route.allUsers
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {
    

    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        allUsers()
        // Static plugin. Try to access `/static/index.html`
        static("/image") {
            resources("static")
        }
    }
}
