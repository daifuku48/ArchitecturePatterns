package com.danilkharytonov.architecturepatterns.factory

class UserFactory {
    fun createUser(): User {
        return User(-1, "", "")
    }

    fun createUserWithId(id: Int): User {
        return User(
            id, "user $id", "description $id"
        )
    }

    fun createUserWithName(id: Int, name: String): User {
        return User(
            id, name, "description $id"
        )
    }
}