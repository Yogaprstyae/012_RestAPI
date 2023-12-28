package com.example.connectapi

import android.app.Application
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.connectapi.repository.AppContainer
import com.example.connectapi.repository.KontakContainer

class KontakAplication : Application() {
    /** AppControler instance used by the rest of classes to obtain dependencies */
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = KontakContainer()
    }
}
