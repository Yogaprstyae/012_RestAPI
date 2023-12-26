package com.example.connectapi.ui.kontak.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.connectapi.ui.kontak.viewmodel.InsertUiEvent

@Composable
fun FormInputSiswa(
  insertUiEvent: InsertUiEvent,
  modifier: Modifier = Modifier,
  onValueChange: (InsertUiEvent) -> Unit = {},
  enabled: Boolean = true
){}