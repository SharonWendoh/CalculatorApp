package com.example.calculatorapplication

import androidx.lifecycle.viewmodel.compose.viewModel
import io.mockk.every
import io.mockk.spyk
import org.junit.Assert
import org.junit.Test

class CalculatorViewModelTest {
    // 1 . init ViewModel
    private val calculatorViewModel: CalculatorViewModel = spyk(CalculatorViewModel())

    @Test
    fun checkSumIsWorkingCorrectly(){
        // 2. Set state
        /*every { calculatorViewModel.state.number1 } returns "3"
        every { calculatorViewModel.state.number2 } returns "2"
        every { calculatorViewModel.state.operation } returns CalculatorOperation("+")*/
        calculatorViewModel.onAction(CalculatorAction.Number(3))
        calculatorViewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Add))
        calculatorViewModel.onAction(CalculatorAction.Number(5))

        // 3. Perform calculation
        calculatorViewModel.performCalculation()
        // 4. Assert value is correct
        Assert.assertEquals("8.0", calculatorViewModel.state.number1)
    }

    @Test
    fun checkSubtractIsWorkingCorrectly(){
        calculatorViewModel.onAction(CalculatorAction.Number(3))
        calculatorViewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Subtract))
        calculatorViewModel.onAction(CalculatorAction.Number(5))

        calculatorViewModel.performCalculation()

        Assert.assertEquals("-2.0",calculatorViewModel.state.number1)
    }

    @Test
    fun checkMultiplyIsWorkingCorrectly(){
        calculatorViewModel.onAction(CalculatorAction.Number(3))
        calculatorViewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))
        calculatorViewModel.onAction(CalculatorAction.Number(5))

        calculatorViewModel.performCalculation()

        Assert.assertEquals("15.0",calculatorViewModel.state.number1)
    }

    @Test
    fun checkDivideIsWorkingCorrectly(){
        calculatorViewModel.onAction(CalculatorAction.Number(3))
        calculatorViewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
        calculatorViewModel.onAction(CalculatorAction.Number(5))

        calculatorViewModel.performCalculation()

        Assert.assertEquals("0.6",calculatorViewModel.state.number1)
    }
/*
//    @Test
//    fun checkOperationIsEnteredCorrectly(){
//        val calculatorViewModel = mockk<CalculatorViewModel>(relaxed = true)
//        val operation = calculatorViewModel.enterOperation(CalculatorOperation.Add)
//        assertEquals('+',operation)
//    }

 */
}