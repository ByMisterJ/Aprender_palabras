package com.example.aprenderpalabras.data.repository

import com.example.aprenderpalabras.data.model.User

class AuthRepository {
    
    // Simulación de base de datos en memoria
    private val users = mutableListOf<User>()
    private var currentUser: User? = null
    
    /**
     * Registra un nuevo usuario
     */
    fun register(name: String, email: String, password: String): Result<User> {
        // Validaciones básicas
        if (name.isBlank()) {
            return Result.failure(Exception("El nombre no puede estar vacío"))
        }
        
        if (email.isBlank() || !email.contains("@")) {
            return Result.failure(Exception("Email inválido"))
        }
        
        if (password.length < 6) {
            return Result.failure(Exception("La contraseña debe tener al menos 6 caracteres"))
        }
        
        // Verificar si el email ya existe
        if (users.any { it.email == email }) {
            return Result.failure(Exception("El email ya está registrado"))
        }
        
        val newUser = User(name, email, password)
        users.add(newUser)
        currentUser = newUser
        
        return Result.success(newUser)
    }
    
    /**
     * Inicia sesión con credenciales
     */
    fun login(email: String, password: String): Result<User> {
        if (email.isBlank() || password.isBlank()) {
            return Result.failure(Exception("Email y contraseña son requeridos"))
        }
        
        val user = users.find { it.email == email && it.password == password }
        
        return if (user != null) {
            currentUser = user
            Result.success(user)
        } else {
            Result.failure(Exception("Credenciales incorrectas"))
        }
    }
    
    /**
     * Cierra la sesión actual
     */
    fun logout() {
        currentUser = null
    }
    
    /**
     * Obtiene el usuario actual
     */
    fun getCurrentUser(): User? = currentUser
    
    /**
     * Verifica si hay una sesión activa
     */
    fun isLoggedIn(): Boolean = currentUser != null
}
