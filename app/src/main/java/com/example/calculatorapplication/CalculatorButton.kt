package com.example.calculatorapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.calculatorapplication.ui.theme.CalculatorApplicationTheme

@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier,
    onClick: () -> Unit
){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(CircleShape)
            .clickable { onClick() }
            .then(modifier)
    ){
        Text(
            text = symbol,
            fontSize = 36.sp,
            textAlign = TextAlign.Center,
            color = MaterialTheme.colors.secondaryVariant,
            modifier = Modifier
                .clip(CircleShape)

        )
    }

}
@Preview
@Composable
fun PreviewButton(){
    CalculatorApplicationTheme{
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
}