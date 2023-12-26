package com.example.connectapi.ui

import android.text.Spannable.Factory
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.connectapi.KontakAplication
import com.example.connectapi.ui.kontak.viewmodel.HomeViewModel
import com.example.connectapi.ui.kontak.viewmodel.InsertViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(aplikasiMars().container.kontakRepository)
        }
        initializer {
            InsertViewModel(aplikasiMars().container.kontakRepository)
        }
    }
}

fun CreationExtras.aplikasiMars(): KontakAplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as KontakAplication)