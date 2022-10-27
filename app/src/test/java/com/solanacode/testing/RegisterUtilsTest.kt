package com.solanacode.testing

import org.junit.Assert.*
import org.junit.Test

class RegisterUtilsTest{
    @Test
    fun validUsernameAndCorrectlyRepeatedPassword_return_true() {
        val result = RegisterUtils.validateRegistrationInput(
            "Tokyo",
            "12345",
            "12345"
        )
        assertEquals("oke",result,true)
    }

    @Test
    fun usernameEmpty(){
        val user = "Aptos"
        val result = RegisterUtils.validateRegistrationInput(user,"123456","123456")
        assertEquals("Succes",result,true)
    }

    @Test
    fun existingUsername(){
        val user= "micassa"
        val result = RegisterUtils.validateRegistrationInput(user,"123456","123456")
        assertEquals("username telah tersedia", result,true)
    }
}