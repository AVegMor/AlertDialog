package com.example.alertdialog

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable

@Composable
fun MyDialog(show: Boolean, onDismiss:()->Unit, onConfirm:()->Unit) {
    if (show) {
        AlertDialog(onDismissRequest = {},
            title = { Text(text = "Titulo") },
            text = { Text(text = "esta es la descripción") },
            confirmButton = {
                TextButton(onClick = {onConfirm()}) {
                    Text(text = "SI")
                }
            },
            dismissButton = {
                TextButton(onClick = {onDismiss()}) {
                    Text(text = "NO")
                }
            }
        )
    }
}