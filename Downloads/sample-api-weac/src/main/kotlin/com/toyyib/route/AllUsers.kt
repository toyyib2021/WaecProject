package com.toyyib.route

import com.toyyib.UserRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.allUsers(){
    val user = UserRepository()

    get(path = "/all-users"){
        try {
            call.respond(message = user.userList, status = HttpStatusCode.OK)
        } catch (e:IllegalArgumentException){
            call.respond(
                message = "user not found", status = HttpStatusCode.NotFound
            )
        }
    }
}