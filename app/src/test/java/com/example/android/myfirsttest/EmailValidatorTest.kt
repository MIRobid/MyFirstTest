package com.example.android.myfirsttest

import org.junit.Assert
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun emailValidator_CorrectEmailSimple_ReturnsTrue() {
        Assert.assertTrue(EmailValidator.isValidEmail("name@email.com"))
    }

    @Test
    fun emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        Assert.assertTrue(EmailValidator.isValidEmail("name@email.co.uk"))
    }

    @Test
    fun emailValidator_InvalidEmailNoTld_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("name@email"))
    }

    @Test
    fun emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("name@email..com"))
    }

    @Test
    fun emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("@email.com"))
    }

    @Test
    fun emailValidator_EmptyString_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun emailValidator_NullEmail_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail(null))
    }

    @Test
    fun emailValidator_InvalidEmailDoubleEmailSign_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("@@email.com"))
    }

    @Test
    fun emailValidator_InvalidEmailNotLatinChars_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("тест@мейл.ру"))
    }

    @Test
    fun emailValidator_AssertEquals() {
        Assert.assertEquals("test@mail.ru","test@mail.ru");
    }

    @Test
    fun emailValidator_AssertNotEquals() {
        Assert.assertNotEquals("test@mail.ru","test@mail.ru");
    }

    @Test
    fun emailValidator_AssertArrayEquals() {
        val x : IntArray= intArrayOf(1,2,3)
        val y : IntArray= intArrayOf(1,2,3)
        Assert.assertArrayEquals(x,y);
    }

    @Test
    fun emailValidator_AssertNull() {
        Assert.assertNull(EmailValidator);
    }

    @Test
    fun emailValidator_AssertNotNull() {
        Assert.assertNotNull(EmailValidator);
    }

    @Test
    fun emailValidator_AssertSame() {
        Assert.assertSame(EmailValidator,EmailValidator);
    }
}