package com.example.aprenderpalabras.data.repository

import com.example.aprenderpalabras.data.model.Word
import java.util.Calendar
import kotlin.random.Random

class WordRepository {
    
    // Lista de palabras para los 7 días de la semana
    private val weeklyWords = listOf(
        Word(
            word = "Resiliente",
            definition = "Capacidad de adaptarse y recuperarse rápidamente ante situaciones adversas o cambios difíciles."
        ),
        Word(
            word = "Efímero",
            definition = "Que tiene una duración muy breve, pasajero o de corta duración."
        ),
        Word(
            word = "Diligente",
            definition = "Que actúa con cuidado, rapidez y eficacia en lo que hace."
        ),
        Word(
            word = "Perspicaz",
            definition = "Que tiene agudeza mental para comprender y percibir las cosas con claridad."
        ),
        Word(
            word = "Innovador",
            definition = "Que introduce novedades, cambios o métodos nuevos y originales."
        ),
        Word(
            word = "Empático",
            definition = "Capacidad de comprender y compartir los sentimientos de otra persona."
        ),
        Word(
            word = "Versátil",
            definition = "Que se adapta con facilidad a diferentes funciones o situaciones."
        )
    )
    
    // Palabras adicionales para rotación aleatoria
    private val additionalWords = listOf(
        Word(
            word = "Serendipity",
            definition = "Descubrimiento o hallazgo valioso que se produce de manera accidental o casual."
        ),
        Word(
            word = "Pragmático",
            definition = "Que se basa en la práctica y en los resultados más que en teorías o principios."
        ),
        Word(
            word = "Tenaz",
            definition = "Que es firme, constante y persistente en sus propósitos o acciones."
        ),
        Word(
            word = "Meticuloso",
            definition = "Que presta atención excesiva a los detalles, cuidadoso y minucioso."
        ),
        Word(
            word = "Elocuente",
            definition = "Que se expresa con facilidad y persuasión, usando un lenguaje fluido y expresivo."
        ),
        Word(
            word = "Asertivo",
            definition = "Que expresa sus opiniones y defiende sus derechos respetando a los demás."
        ),
        Word(
            word = "Proactivo",
            definition = "Que toma la iniciativa y actúa de manera anticipada ante situaciones futuras."
        ),
        Word(
            word = "Introspectivo",
            definition = "Que reflexiona profundamente sobre sus propios pensamientos y sentimientos."
        )
    )
    
    /**
     * Obtiene la palabra del día según el día de la semana
     * Domingo = 1, Lunes = 2, ..., Sábado = 7
     */
    fun getWordOfTheDay(): Word {
        val calendar = Calendar.getInstance()
        val dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK)
        // Calendar.DAY_OF_WEEK: Sunday=1, Monday=2, ..., Saturday=7
        // Convertimos para usar como índice (0-6)
        val index = (dayOfWeek - 1) % weeklyWords.size
        return weeklyWords[index]
    }
    
    /**
     * Obtiene una palabra aleatoria diferente a la actual
     */
    fun getRandomWord(currentWord: Word? = null): Word {
        val allWords = weeklyWords + additionalWords
        val availableWords = if (currentWord != null) {
            allWords.filter { it.word != currentWord.word }
        } else {
            allWords
        }
        
        return if (availableWords.isNotEmpty()) {
            availableWords[Random.nextInt(availableWords.size)]
        } else {
            weeklyWords[0]
        }
    }
}
