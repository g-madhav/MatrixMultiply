package com.example.matrixmultiply

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.matrixmultiply.ui.theme.MatrixMultiplyTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MatrixMultiplyTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.LightGray
                ) {
                    var so11 by remember { mutableStateOf(0) }
                    var so12 by remember { mutableStateOf(0) }
                    var so13 by remember { mutableStateOf(0) }
                    var so21 by remember { mutableStateOf(0) }
                    var so22 by remember { mutableStateOf(0) }
                    var so23 by remember { mutableStateOf(0) }
                    var so31 by remember { mutableStateOf(0) }
                    var so32 by remember { mutableStateOf(0) }
                    var so33 by remember { mutableStateOf(0) }
                    var to11 by remember { mutableStateOf(0) }
                    var to12 by remember { mutableStateOf(0) }
                    var to13 by remember { mutableStateOf(0) }
                    var to31 by remember { mutableStateOf(0) }
                    var to32 by remember { mutableStateOf(0) }
                    var to33 by remember { mutableStateOf(0) }
                    var to21 by remember { mutableStateOf(0) }
                    var to22 by remember { mutableStateOf(0) }
                    var to23 by remember { mutableStateOf(0) }
                    var po11 by remember { mutableStateOf(0) }
                    var po12 by remember { mutableStateOf(0) }
                    var po13 by remember { mutableStateOf(0) }
                    var po31 by remember { mutableStateOf(0) }
                    var po32 by remember { mutableStateOf(0) }
                    var po33 by remember { mutableStateOf(0) }
                    var po21 by remember { mutableStateOf(0) }
                    var po22 by remember { mutableStateOf(0) }
                    var po23 by remember { mutableStateOf(0) }
                    var s11 by remember { mutableStateOf(0) }
                    var s12 by remember { mutableStateOf(0) }

                    var s21 by remember { mutableStateOf(0) }
                    var s22 by remember { mutableStateOf(0) }

                    var t11 by remember { mutableStateOf(0) }
                    var t12 by remember { mutableStateOf(0) }

                    var t21 by remember { mutableStateOf(0) }
                    var t22 by remember { mutableStateOf(0) }

                    var p11 by remember { mutableStateOf(0) }
                    var p12 by remember { mutableStateOf(0) }

                    var p21 by remember { mutableStateOf(0) }
                    var p22 by remember { mutableStateOf(0) }


                    Column(
                        modifier = Modifier.fillMaxWidth().fillMaxSize().verticalScroll(rememberScrollState()),
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {
                        Text(
                            "Matrix Multiplier",
                            modifier = Modifier.padding(10.dp),
                            fontSize = 20.sp,
                            color = Color.Black
                        )

                        Column(
                            modifier = Modifier.height(120.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            // Matrix S
                            Row(modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(0.5f)) {
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                        .clickable { s11 = (s11 + 1) % 10 }) {
                                    Text(
                                        text = s11.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                        .clickable { s12 = (s12 + 1) % 10 }) {
                                    Text(
                                        text = s12.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                            }

                            Row(modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(1f)) {
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                        .clickable { s21 = (s21 + 1) % 10 }) {
                                    Text(
                                        text = s21.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                        .clickable { s22 = (s22 + 1) % 10 }) {
                                    Text(
                                        text = s22.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(10.dp))
                        Text("x", fontSize = 30.sp)
                        Spacer(modifier = Modifier.height(10.dp))

                        Column(
                            modifier = Modifier.height(120.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            // Matrix T
                            Row(modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(0.5f)) {
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                        .clickable { t11 = (t11 + 1) % 10 }) {
                                    Text(
                                        text = t11.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                        .clickable { t12 = (t12 + 1) % 10 }) {
                                    Text(
                                        text = t12.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                            }

                            Row(modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(1f)) {
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                        .clickable { t21 = (t21 + 1) % 10 }) {
                                    Text(
                                        text = t21.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                        .clickable { t22 = (t22 + 1) % 10 }) {
                                    Text(
                                        text = t22.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(30.dp))
                        Text("=", fontSize = 30.sp)
                        Spacer(modifier = Modifier.height(30.dp))

                        Column(
                            modifier = Modifier.height(120.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            // Matrix P
                            Row(modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(0.5f)) {
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                ) {
                                    Text(
                                        text = p11.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                ) {
                                    Text(
                                        text = p12.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                            }

                            Row(modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(1f)) {
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                ) {
                                    Text(
                                        text = p21.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                ) {
                                    Text(
                                        text = p22.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(50.dp))

                        MyButton(
                            s11 = s11,
                            s12 = s12,
                            s21 = s21,
                            s22 = s22,
                            t11 = t11,
                            t12 = t12,
                            t21 = t21,
                            t22 = t22,
                            p11 = p11,
                            p12 = p12,
                            p21 = p21,
                            p22 = p22,
                            onClick = {
                                // Update P matrix values
                                p11 = (s11 * t11 + s12 * t21) % 10
                                p12 = (s11 * t12 + s12 * t22) % 10
                                p21 = (s21 * t11 + s22 * t21) % 10
                                p22 = (s21 * t12 + s22 * t22) % 10
                            }
                        )
                        //******************************************************************************************************************************Column(modifier = Modifier.height(120.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                        // Matrix S
                        Row(modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(0.5f)) {
                            Box(
                                modifier = Modifier.weight(1f).fillMaxHeight()
                                    .background(Color.DarkGray).border(1.dp, Color.Blue)
                                    .clickable { so11 = (so11 + 1) % 10 }) {
                                Text(
                                    text = so11.toString(),
                                    modifier = Modifier.align(Alignment.Center),
                                    fontSize = 20.sp,
                                    color = Color.White
                                )
                            }
                            Box(
                                modifier = Modifier.weight(1f).fillMaxHeight()
                                    .background(Color.DarkGray).border(1.dp, Color.Blue)
                                    .clickable { so12 = (so12 + 1) % 10 }) {
                                Text(
                                    text = so12.toString(),
                                    modifier = Modifier.align(Alignment.Center),
                                    fontSize = 20.sp,
                                    color = Color.White
                                )
                            }
                            Box(
                                modifier = Modifier.weight(1f).fillMaxHeight()
                                    .background(Color.DarkGray).border(1.dp, Color.Blue)
                                    .clickable { so13 = (so13 + 1) % 10 }) {
                                Text(
                                    text = so13.toString(),
                                    modifier = Modifier.align(Alignment.Center),
                                    fontSize = 20.sp,
                                    color = Color.White
                                )
                            }
                        }

                        Row(modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(0.5f)) {
                            Box(
                                modifier = Modifier.weight(1f).fillMaxHeight()
                                    .background(Color.DarkGray).border(1.dp, Color.Blue)
                                    .clickable { so21 = (so21 + 1) % 10 }) {
                                Text(
                                    text = so21.toString(),
                                    modifier = Modifier.align(Alignment.Center),
                                    fontSize = 20.sp,
                                    color = Color.White
                                )
                            }
                            Box(
                                modifier = Modifier.weight(1f).fillMaxHeight()
                                    .background(Color.DarkGray).border(1.dp, Color.Blue)
                                    .clickable { so22 = (so22 + 1) % 10 }) {
                                Text(
                                    text = so22.toString(),
                                    modifier = Modifier.align(Alignment.Center),
                                    fontSize = 20.sp,
                                    color = Color.White
                                )
                            }
                            Box(
                                modifier = Modifier.weight(1f).fillMaxHeight()
                                    .background(Color.DarkGray).border(1.dp, Color.Blue)
                                    .clickable { so23 = (so23 + 1) % 10 }) {
                                Text(
                                    text = so23.toString(),
                                    modifier = Modifier.align(Alignment.Center),
                                    fontSize = 20.sp,
                                    color = Color.White
                                )
                            }
                        }
                        Row(modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(0.5f)) {
                            Box(
                                modifier = Modifier.weight(1f).fillMaxHeight()
                                    .background(Color.DarkGray).border(1.dp, Color.Blue)
                                    .clickable { so31 = (so31 + 1) % 10 }) {
                                Text(
                                    text = so31.toString(),
                                    modifier = Modifier.align(Alignment.Center),
                                    fontSize = 20.sp,
                                    color = Color.White
                                )
                            }
                            Box(
                                modifier = Modifier.weight(1f).fillMaxHeight()
                                    .background(Color.DarkGray).border(1.dp, Color.Blue)
                                    .clickable { so32 = (so32 + 1) % 10 }) {
                                Text(
                                    text = so32.toString(),
                                    modifier = Modifier.align(Alignment.Center),
                                    fontSize = 20.sp,
                                    color = Color.White
                                )
                            }
                            Box(
                                modifier = Modifier.weight(1f).fillMaxHeight()
                                    .background(Color.DarkGray).border(1.dp, Color.Blue)
                                    .clickable { so33 = (so33 + 1) % 10 }) {
                                Text(
                                    text = so33.toString(),
                                    modifier = Modifier.align(Alignment.Center),
                                    fontSize = 20.sp,
                                    color = Color.White
                                )
                            }
                        }


                        Spacer(modifier = Modifier.height(10.dp))
                        Text("x", fontSize = 30.sp)
                        Spacer(modifier = Modifier.height(10.dp))

                        Column(
                            modifier = Modifier.height(150.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            // Matrix T
                            Row(modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(0.33f)) {
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                        .clickable { to11 = (to11 + 1) % 10 }) {
                                    Text(
                                        text = to11.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                        .clickable { to12 = (to12 + 1) % 10 }) {
                                    Text(
                                        text = to12.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                        .clickable { to13 = (to13 + 1) % 10 }) {
                                    Text(
                                        text = to13.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                            }

                            Row(modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(0.33f)) {
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                        .clickable { to21 = (to21 + 1) % 10 }) {
                                    Text(
                                        text = to21.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                        .clickable { to22 = (to22 + 1) % 10 }) {
                                    Text(
                                        text = to22.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                        .clickable { to23 = (to23 + 1) % 10 }) {
                                    Text(
                                        text = to23.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                            }
                            Row(modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(0.5f)) {
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                        .clickable { to31 = (to31 + 1) % 10 }) {
                                    Text(
                                        text = to31.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                        .clickable { to32 = (to32 + 1) % 10 }) {
                                    Text(
                                        text = to32.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                        .clickable { to33 = (to33 + 1) % 10 }) {
                                    Text(
                                        text = to33.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(30.dp))
                        Text("=", fontSize = 30.sp)
                        Spacer(modifier = Modifier.height(30.dp))

                        Column(
                            modifier = Modifier.height(150.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            // Matrix P
                            Row(modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(0.34f)) {
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                ) {
                                    Text(
                                        text = po11.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                ) {
                                    Text(
                                        text = po12.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                ) {
                                    Text(
                                        text = po13.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                            }

                            Row(modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(0.33f)) {
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                ) {
                                    Text(
                                        text = po21.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                ) {
                                    Text(
                                        text = po22.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                ) {
                                    Text(
                                        text = po23.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                            }
                            Row(modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(0.5f)) {
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                ) {
                                    Text(
                                        text = po31.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                ) {
                                    Text(
                                        text = po32.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                                Box(
                                    modifier = Modifier.weight(1f).fillMaxHeight()
                                        .background(Color.DarkGray).border(1.dp, Color.Blue)
                                ) {
                                    Text(
                                        text = po33.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                            }

                        }

                        Spacer(modifier = Modifier.height(50.dp))

                        MyButton2(
                            so11 = so11,
                            so12 = so12, so13 = so13,
                            so31 = so31,
                            so32 = so32, so33 = so33,
                            so21 = so21,
                            so22 = so22, so23 = so23,
                            to11 = to11,
                            to12 = to12, to13 = to13,
                            to31 = to31,
                            to32 = to32, to33 = to33,
                            to21 = to21,
                            to22 = to22, to23 = to23,
                            po11 = po11,
                            po12 = po12, po13 = po13,
                            po21 = po21,
                            po22 = po22, po23 = po23,
                            po31 = po31,
                            po32 = po32, po33 = po33,
                            onClick = {
                                // Update P matrix values
                                po11 = (so11 * to11 + so12 * to21 + so13 * to31) % 10
                                po12 = (so11 * to12 + so12 * to22 + so13 * to32) % 10
                                po13 = (so11 * to13 + so12 * to23 + so13 * to33) % 10

                                po21 = (so21 * to11 + so22 * to21 + so23 * to31) % 10
                                po22 = (so21 * to12 + so22 * to22 + so23 * to32) % 10
                                po23 = (so21 * to13 + so22 * to23 + so23 * to33) % 10

                                po31 = (so31 * to11 + so32 * to21 + so33 * to31) % 10
                                po32 = (so31 * to12 + so32 * to22 + so33 * to32) % 10
                                po33 = (so31 * to13 + so32 * to23 + so33 * to33) % 10
                            }

                        )
                        //******************************************************************************************************************************
                    }
                }
                }
            }
        }
    }

    @Composable
    fun MyButton(
        s12: Int,
        s11: Int,
        s21: Int,
        s22: Int,
        t11: Int,
        t12: Int,
        t21: Int,
        t22: Int,
        p11: Int,
        p12: Int,
        p21: Int,
        p22: Int,
        onClick: () -> Unit,
    ) {
        Button(
            onClick = onClick,
            modifier = Modifier.padding(all = Dp(10F)),
            enabled = true,
            border = BorderStroke(width = 1.dp, brush = SolidColor(Color.Blue)),
            shape = MaterialTheme.shapes.medium,
        ) {
            Text(text = "MULTIPLY", color = Color.White)
        }
    }
@Composable
    fun MyButton2(
        so12: Int,
        so11: Int,
        so13: Int,
        so21: Int,
        so22: Int,
        so23: Int,
        so31: Int,
        so32: Int,
        so33: Int,
        to11: Int,
        to12: Int,
        to13: Int,
        to21: Int,
        to22: Int,
        to23: Int,
        to31: Int,
        to32: Int,
        to33: Int,
        po11: Int,
        po12: Int,
        po13: Int,
        po21: Int,
        po22: Int,
        po23: Int,
        po31: Int,
        po32: Int,po33: Int,
        onClick: () -> Unit

    ) {
        Button(
            onClick = onClick,
            modifier = Modifier.padding(all = Dp(10F))
                ,
            enabled = true,
            border = BorderStroke(width = 1.dp, brush = SolidColor(Color.Blue)),
            shape = MaterialTheme.shapes.medium,
        ) {
            Text(text = "MULTIPLY(3x3)", color = Color.White)
        }
    }

    @Composable
    @Preview(showBackground = true)
    fun DefaultPreview() {
        MyButton(s12 = 0, s11 = 0, s21 = 0, s22 = 0, t11 = 0, t12 = 0, t21 = 0, t22 = 0, p11 = 0, p12 = 0, p21 = 0, p22 = 0) {}
    }
    @Composable
    @Preview(showBackground = true)
    fun DefaultPreview2() {
        MyButton2(
            so12 = 0,
            so11 = 0,
            so13 = 0,
            so21 = 0,
            so22 = 0,
            so23 = 0,
            so31 = 0,
            so32 = 0,
            so33 = 0,
            to11 = 0,
            to12 = 0,
            to13 = 0,
            to21 = 0,
            to22 = 0,
            to23 = 0,
            to31 = 0,
            to32 = 0,
            to33 = 0,
            po11 = 0,
            po12 = 0,
            po13 = 0,
            po21 = 0,
            po22 = 0,
            po23 = 0,
            po31 = 0,
            po32 = 0,
            po33 = 0
        ) {}
    }


