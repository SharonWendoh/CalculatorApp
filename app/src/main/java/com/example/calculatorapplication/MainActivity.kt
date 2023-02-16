package com.example.calculatorapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.calculatorapplication.ui.theme.CalculatorApplicationTheme
import com.example.calculatorapplication.ui.theme.MediumGray
import com.example.calculatorapplication.ui.theme.Orange


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorApplicationTheme {
                val viewModel = viewModel<CalculatorViewModel>()
                val state = viewModel.state
                val buttonSpacing = 8.dp
                Box(modifier = Modifier) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.BottomCenter)
                            .background(color = Color.Black),
                    ) {
                        Text(
                            text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                            textAlign = TextAlign.End,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 32.dp),
                            fontWeight = FontWeight.Light,
                            fontSize = 80.sp,
                            color = Color.White,
                            maxLines = 2
                        )
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ) {
                            CalculatorButton(
                                symbol = "AC",
                                modifier = Modifier
                                    .background(Color.LightGray)
                                    .aspectRatio(2f)
                                    .weight(2f),
                            ) {
                                viewModel.onAction(CalculatorAction.Clear)
                            }
                            CalculatorButton(
                                symbol = "Del",
                                modifier = Modifier
                                    .background(Color.LightGray)
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Delete)
                            }
                            CalculatorButton(
                                symbol = "/",
                                modifier = Modifier
                                    .background(Orange)
                                    .aspectRatio(1f)
                                    .weight(1f),
                            ) {
                                viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
                            }
                        }
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ) {
                            CalculatorButton(
                                symbol = "7",
                                modifier = Modifier
                                    .background(Color.DarkGray)
                                    .aspectRatio(1f)
                                    .weight(1f),
                            ) {
                                viewModel.onAction(CalculatorAction.Number(7))
                            }
                            CalculatorButton(
                                symbol = "8",
                                modifier = Modifier
                                    .background(Color.DarkGray)
                                    .aspectRatio(1f)
                                    .weight(1f),
                            ) {
                                viewModel.onAction(CalculatorAction.Number(8))
                            }
                            CalculatorButton(
                                symbol = "9",
                                modifier = Modifier
                                    .background(Color.DarkGray)
                                    .aspectRatio(1f)
                                    .weight(1f),
                            ) {
                                viewModel.onAction(CalculatorAction.Number(9))
                            }
                            CalculatorButton(
                                symbol = "*",
                                modifier = Modifier
                                    .background(Orange)
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))
                            }
                        }
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ) {
                            CalculatorButton(
                                symbol = "4",
                                modifier = Modifier
                                    .background(Color.DarkGray)
                                    .aspectRatio(1f)
                                    .weight(1f),
                            ) {
                                viewModel.onAction(CalculatorAction.Number(4))
                            }
                            CalculatorButton(
                                symbol = "5",
                                modifier = Modifier
                                    .background(Color.DarkGray)
                                    .aspectRatio(1f)
                                    .weight(1f),
                            ) {
                                viewModel.onAction(CalculatorAction.Number(5))
                            }
                            CalculatorButton(
                                symbol = "6",
                                modifier = Modifier
                                    .background(Color.DarkGray)
                                    .aspectRatio(1f)
                                    .weight(1f),
                            ) {
                                viewModel.onAction(CalculatorAction.Number(6))
                            }
                            CalculatorButton(
                                symbol = "-",
                                modifier = Modifier
                                    .background(Orange)
                                    .aspectRatio(1f)
                                    .weight(1f),
                            ) {
                                viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Subtract))
                            }
                        }
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ) {
                            CalculatorButton(
                                symbol = "3",
                                modifier = Modifier
                                    .background(Color.DarkGray)
                                    .aspectRatio(1f)
                                    .weight(1f),
                            ) {
                                viewModel.onAction(CalculatorAction.Number(3))
                            }
                            CalculatorButton(
                                symbol = "2",
                                modifier = Modifier
                                    .background(Color.DarkGray)
                                    .aspectRatio(1f)
                                    .weight(1f),
                            ) {
                                viewModel.onAction(CalculatorAction.Number(2))
                            }
                            CalculatorButton(
                                symbol = "1",
                                modifier = Modifier
                                    .background(Color.DarkGray)
                                    .aspectRatio(1f)
                                    .weight(1f),
                            ) {
                                viewModel.onAction(CalculatorAction.Number(1))
                            }
                            CalculatorButton(
                                symbol = "+",
                                modifier = Modifier
                                    .background(Orange)
                                    .aspectRatio(1f)
                                    .weight(1f),
                            ) {
                                viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Add))
                            }
                        }
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ) {
                            CalculatorButton(
                                symbol = "0",
                                modifier = Modifier
                                    .background(Color.DarkGray)
                                    .aspectRatio(2f)
                                    .weight(2f),
                            ) {
                                viewModel.onAction(CalculatorAction.Number(0))
                            }
                            CalculatorButton(
                                symbol = ".",
                                modifier = Modifier
                                    .background(Color.DarkGray)
                                    .aspectRatio(1f)
                                    .weight(1f),
                            ) {
                                viewModel.onAction(CalculatorAction.Decimal)
                            }
                            CalculatorButton(
                                symbol = "=",
                                modifier = Modifier
                                    .background(Orange)
                                    .aspectRatio(1f)
                                    .weight(1f),
                            ) {
                                viewModel.onAction(CalculatorAction.Calculate)
                            }
                        }
                    }

                }
            }
        }
    }
}


/*@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CalculatorApplicationTheme {
        Greeting("Android")
    }
}*/