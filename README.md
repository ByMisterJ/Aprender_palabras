# Aprender Palabras - Vocabulario App

Una aplicación Android desarrollada con Jetpack Compose para mejorar tu vocabulario en español. Cada día aprende una nueva palabra con su definición, y practica con palabras adicionales.

## 🎯 Características

### 1. Palabra del Día
- Muestra una palabra diferente cada día de la semana (Lunes-Domingo)
- Botón "Practicar nuevas palabras" para obtener palabras aleatorias adicionales
- Interfaz visual limpia y fácil de leer

### 2. Autenticación
- **Pantalla de Login**: Inicia sesión con email y contraseña
- **Pantalla de Registro**: Crea una cuenta con nombre, email y contraseña
- Sistema de validación local con mensajes de error descriptivos

### 3. Personalización
- **Modo Día/Noche**: Cambia entre temas claro y oscuro
- Preferencias persistentes que se mantienen al reiniciar la app
- Aplicación del tema en toda la interfaz

### 4. Navegación
- **Top App Bar**: Barra superior con título dinámico y botón de menú
- **Navigation Drawer**: Menú lateral deslizable con acceso rápido a todas las secciones
- Navegación fluida entre pantallas con soporte para back stack

## 🛠️ Tecnologías Utilizadas

- **Jetpack Compose**: UI moderna y declarativa
- **Navigation Compose**: Manejo de navegación entre pantallas
- **Material 3**: Diseño siguiendo las guías de Material Design
- **ViewModel**: Arquitectura MVVM para separación de lógica y UI
- **DataStore**: Persistencia de preferencias del usuario
- **Kotlin Coroutines & Flow**: Programación asíncrona y reactiva

## 📂 Estructura del Proyecto

```
app/src/main/java/com/example/aprenderpalabras/
├── data/
│   ├── model/
│   │   ├── Word.kt                     # Modelo de palabra
│   │   └── User.kt                     # Modelo de usuario
│   └── repository/
│       ├── WordRepository.kt           # Gestión de palabras
│       ├── AuthRepository.kt           # Autenticación local
│       └── PreferencesRepository.kt    # Persistencia de preferencias
├── ui/
│   ├── screens/
│   │   ├── WordOfTheDayScreen.kt      # Pantalla principal
│   │   ├── LoginScreen.kt             # Pantalla de login
│   │   ├── RegisterScreen.kt          # Pantalla de registro
│   │   └── SettingsScreen.kt          # Pantalla de configuración
│   ├── navigation/
│   │   ├── Screen.kt                   # Definición de rutas
│   │   └── AppNavigation.kt            # Configuración de navegación
│   └── theme/
│       ├── Theme.kt                    # Tema Material 3
│       └── Type.kt                     # Tipografía
├── viewmodel/
│   ├── WordViewModel.kt                # Lógica de palabras
│   ├── AuthViewModel.kt                # Lógica de autenticación
│   └── SettingsViewModel.kt            # Lógica de configuración
└── MainActivity.kt                     # Activity principal
```

## 🚀 Instalación y Ejecución

### Prerrequisitos
- Android Studio Hedgehog o superior
- JDK 11 o superior
- Android SDK con API 24+ (Android 7.0+)

### Pasos

1. **Clonar el repositorio**
   ```bash
   git clone https://github.com/ByMisterJ/Aprender_palabras.git
   cd Aprender_palabras
   ```

2. **Abrir en Android Studio**
   - Abre Android Studio
   - Selecciona "Open an Existing Project"
   - Navega hasta la carpeta del proyecto

3. **Sincronizar Gradle**
   - Android Studio sincronizará automáticamente las dependencias
   - Si hay problemas, ejecuta: `File > Sync Project with Gradle Files`

4. **Ejecutar la aplicación**
   - Conecta un dispositivo Android o inicia un emulador
   - Click en el botón "Run" (▶️) o presiona `Shift + F10`

## 📱 Uso de la Aplicación

### Palabra del Día
1. Al abrir la app, verás la "Palabra del Día" correspondiente al día de la semana actual
2. Lee la definición para entender el significado
3. Presiona "Practicar nuevas palabras" para ver palabras adicionales aleatorias
4. Usa "Volver a la palabra del día" para regresar a la palabra asignada

### Login y Registro
1. Desde el menú lateral, accede a "Registrarse" si es tu primera vez
2. Completa el formulario con tu nombre, email y contraseña
3. En futuras sesiones, usa "Iniciar Sesión" con tus credenciales
4. Las validaciones te guiarán si hay algún error

### Configuración
1. Abre el menú lateral y selecciona "Configuración"
2. Activa o desactiva el "Modo Oscuro" según tu preferencia
3. Los cambios se aplican inmediatamente y se guardan automáticamente

## 🎨 Capturas de Pantalla

### Pantalla Principal (Palabra del Día)
Muestra la palabra del día con su definición en un diseño centrado y elegante.

### Modo Claro y Oscuro
La aplicación soporta ambos temas con colores optimizados para cada modo.

### Navegación
El drawer lateral proporciona acceso rápido a todas las secciones de la app.

## 🗓️ Palabras de la Semana

La aplicación incluye 7 palabras base (una por cada día):
1. **Lunes**: Resiliente
2. **Martes**: Efímero
3. **Miércoles**: Diligente
4. **Jueves**: Perspicaz
5. **Viernes**: Innovador
6. **Sábado**: Empático
7. **Domingo**: Versátil

Además, hay palabras adicionales disponibles para practicar: Serendipity, Pragmático, Tenaz, Meticuloso, Elocuente, Asertivo, Proactivo, Introspectivo.

## 🏗️ Arquitectura

La aplicación sigue el patrón **MVVM (Model-View-ViewModel)**:

- **Model**: Data classes y repositorios (`data/`)
- **View**: Composables de UI (`ui/screens/`)
- **ViewModel**: Lógica de negocio y manejo de estado (`viewmodel/`)

### Flujo de Datos
1. Las Views observan StateFlows del ViewModel
2. Los ViewModels interactúan con los Repositorios
3. Los Repositorios gestionan datos locales (en memoria o DataStore)

## 🔄 Gestión de Estado

- **StateFlow**: Para estados reactivos en ViewModels
- **collectAsState()**: Para observar flows desde Composables
- **remember/mutableStateOf**: Para estados locales de UI

## 💾 Persistencia

- **DataStore Preferences**: Almacenamiento del modo oscuro
- **In-Memory Repository**: Simulación de base de datos para usuarios

## 🌐 Funcionalidades Futuras

- [ ] Base de datos real con Room
- [ ] Sincronización con backend
- [ ] Más categorías de palabras (tecnología, negocios, etc.)
- [ ] Sistema de favoritos
- [ ] Historial de palabras vistas
- [ ] Notificaciones diarias
- [ ] Quiz/examen de palabras aprendidas
- [ ] Compartir palabras en redes sociales

## 📝 Notas de Desarrollo

### Configuración de Build
- **Min SDK**: 24 (Android 7.0)
- **Target SDK**: 36
- **Compile SDK**: 36
- **JVM Target**: 11

### Dependencias Principales
```gradle
// Compose
implementation(platform("androidx.compose:compose-bom:2024.12.01"))
implementation("androidx.compose.material3:material3")

// Navigation
implementation("androidx.navigation:navigation-compose:2.8.5")

// DataStore
implementation("androidx.datastore:datastore-preferences:1.1.1")
```

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Por favor:
1. Fork el repositorio
2. Crea una rama para tu feature (`git checkout -b feature/AmazingFeature`)
3. Commit tus cambios (`git commit -m 'Add some AmazingFeature'`)
4. Push a la rama (`git push origin feature/AmazingFeature`)
5. Abre un Pull Request

## 📄 Licencia

Este proyecto es de código abierto y está disponible bajo la licencia MIT.

## 👤 Autor

**ByMisterJ**
- GitHub: [@ByMisterJ](https://github.com/ByMisterJ)

## 📞 Soporte

Si encuentras algún problema o tienes sugerencias, por favor abre un issue en el repositorio de GitHub.

---

¡Disfruta aprendiendo nuevas palabras cada día! 📚✨
