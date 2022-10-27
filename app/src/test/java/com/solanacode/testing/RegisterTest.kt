package com.solanacode.testing

import org.junit.Assert.*

import org.junit.Before
import org.junit.Test

class RegisterTest {

    lateinit var register: Register
    @Before
    fun setUp() {
        register = Register()
    }

    @Test
    fun passwordKosong_false(){
        val result = register.validateRegistrationInput("solana","","12345")
        assertEquals("password anda kosong", result, false)
    }
}