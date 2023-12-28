package com.example.connectapi.ui.kontak.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.connectapi.model.Kontak
import com.example.connectapi.repository.KontakRepository
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.io.IOException

sealed class KontakUIState{
    data class Success(val kontak: List<Kontak>): KontakUIState()
    object Error: KontakUIState()
    object Loading : KontakUIState()
}

class HomeViewModel (private val kontakRepositori: KontakRepository) : ViewModel(){
    var kontakUIState: KontakUIState by mutableStateOf(KontakUIState.Loading)
        private set

    init {
        getKontak()
    }
    fun getKontak(){
        viewModelScope.launch {
            kontakUIState = KontakUIState.Loading
            kontakUIState = try {
                KontakUIState.Success(kontakRepositori.getKontak())
            }catch (e: IOException){
                KontakUIState.Error
            }catch (e: HttpException){
                KontakUIState.Error
            }
        }
    }
    fun deleteKontak(id: Int){
        viewModelScope.launch{
            try {
                kontakRepositori.deleteKontak(id)
            }catch (e:IOException){
                KontakUIState.Error
            }catch (e:HttpException){
                KontakUIState.Error
            }
        }
    }
}