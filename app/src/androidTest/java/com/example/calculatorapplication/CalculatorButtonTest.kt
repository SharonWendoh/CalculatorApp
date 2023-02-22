package com.example.calculatorapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class CalculatorButtonTest {
    @get: Rule
    val composeRule = createComposeRule()


    @Test
    fun CalculatorButtonIsDisplayedCorrectly(){
        composeRule.setContent {
            Row(

            ){
                CalculatorButton(
                    symbol ="AC",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {})
            }
        }
        composeRule
            .onNodeWithText("AC")
            .assertExists()
            .assertIsDisplayed()
            .performClick()
    }
}
