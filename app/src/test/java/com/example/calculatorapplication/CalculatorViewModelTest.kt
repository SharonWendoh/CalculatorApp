package com.example.calculatorapplication

import io.mockk.mockk
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class CalculatorViewmodelTest {

    @Test
    fun checkSumIsWorkingCorrectly(){
        val calculatorViewModel = mockk<CalculatorViewModel>(relaxed = true)
        val sum = calculatorViewModel.performCalculation()
        val number1 = 10
        val number2 = 10
        val expectedResult = 10
        val result = CalculatorOperation.Add
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    fun checkOperationIsEnteredCorrectly(){
        val calculatorViewModel = mockk<CalculatorViewModel>(relaxed = true)
        val operation = calculatorViewModel.enterOperation(CalculatorOperation.Add)
        assertEquals('+',operation)
    }

}