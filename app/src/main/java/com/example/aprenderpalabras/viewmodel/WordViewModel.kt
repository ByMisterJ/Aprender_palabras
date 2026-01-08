package com.example.aprenderpalabras.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.aprenderpalabras.data.model.Word
import com.example.aprenderpalabras.data.repository.WordRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class WordViewModel(
    private val repository: WordRepository = WordRepository()
) : ViewModel() {
    
    private val _currentWord = MutableStateFlow<Word?>(null)
    val currentWord: StateFlow<Word?> = _currentWord.asStateFlow()
    
    private val _isWordOfTheDay = MutableStateFlow(true)
    val isWordOfTheDay: StateFlow<Boolean> = _isWordOfTheDay.asStateFlow()
    
    init {
        loadWordOfTheDay()
    }
    
    /**
     * Carga la palabra del día
     */
    fun loadWordOfTheDay() {
        viewModelScope.launch {
            _currentWord.value = repository.getWordOfTheDay()
            _isWordOfTheDay.value = true
        }
    }
    
    /**
     * Obtiene una palabra aleatoria
     */
    fun loadRandomWord() {
        viewModelScope.launch {
            _currentWord.value = repository.getRandomWord(_currentWord.value)
            _isWordOfTheDay.value = false
        }
    }
}
