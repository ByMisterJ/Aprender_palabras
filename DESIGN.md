# Aprender Palabras - Guía Visual y de Funcionalidades

## Pantallas de la Aplicación

### 1. Pantalla Principal - Palabra del Día

```
┌────────────────────────────────────┐
│ ☰  Palabra del Día                │  <- Top App Bar
├────────────────────────────────────┤
│                                    │
│         Palabra del Día            │  <- Título
│                                    │
│    ┌──────────────────────┐       │
│    │                      │       │
│    │     Resiliente       │       │  <- Palabra destacada
│    │                      │       │
│    │  ──────────────      │       │
│    │                      │       │
│    │  Capacidad de        │       │  <- Definición
│    │  adaptarse y         │       │
│    │  recuperarse         │       │
│    │  rápidamente ante    │       │
│    │  situaciones         │       │
│    │  adversas...         │       │
│    │                      │       │
│    └──────────────────────┘       │
│                                    │
│  ┌──────────────────────────┐     │
│  │ Practicar nuevas palabras│     │  <- Botón principal
│  └──────────────────────────┘     │
│                                    │
└────────────────────────────────────┘
```

**Funcionalidades:**
- Muestra una palabra diferente cada día de la semana
- Al presionar "Practicar nuevas palabras", muestra una palabra aleatoria
- Cuando se muestra una palabra aleatoria, aparece botón "Volver a la palabra del día"
- Diseño limpio centrado con card elevado

### 2. Navigation Drawer (Menú Lateral)

```
┌─────────────────────┐
│ Aprender Palabras   │  <- Header
├─────────────────────┤
│ 🏠 Palabra del Día  │  <- Item seleccionado
│ 🔐 Iniciar Sesión   │
│ ➕ Registrarse      │
│ ⚙️ Configuración    │
└─────────────────────┘
```

**Funcionalidades:**
- Se abre deslizando desde la izquierda o presionando el ícono ☰
- Resalta el item de la pantalla actual
- Navegación rápida entre todas las secciones

### 3. Pantalla de Login

```
┌────────────────────────────────────┐
│ ☰  Iniciar Sesión                 │
├────────────────────────────────────┤
│                                    │
│       Iniciar Sesión               │  <- Título
│                                    │
│  ┌──────────────────────────┐     │
│  │ Email                    │     │  <- Campo email
│  └──────────────────────────┘     │
│                                    │
│  ┌──────────────────────────┐     │
│  │ Contraseña           👁  │     │  <- Campo contraseña
│  └──────────────────────────┘     │  (con botón mostrar/ocultar)
│                                    │
│  [Mensaje de error si existe]     │
│                                    │
│  ┌──────────────────────────┐     │
│  │   Iniciar Sesión         │     │  <- Botón
│  └──────────────────────────┘     │
│                                    │
│  ¿No tienes cuenta? Regístrate     │  <- Link a registro
│                                    │
└────────────────────────────────────┘
```

**Funcionalidades:**
- Validación de campos vacíos
- Botón para mostrar/ocultar contraseña
- Mensajes de error descriptivos
- Link a pantalla de registro
- Al login exitoso, navega a home

### 4. Pantalla de Registro

```
┌────────────────────────────────────┐
│ ☰  Registrarse                    │
├────────────────────────────────────┤
│                                    │
│        Crear Cuenta                │  <- Título
│                                    │
│  ┌──────────────────────────┐     │
│  │ Nombre                   │     │  <- Campo nombre
│  └──────────────────────────┘     │
│                                    │
│  ┌──────────────────────────┐     │
│  │ Email                    │     │  <- Campo email
│  └──────────────────────────┘     │
│                                    │
│  ┌──────────────────────────┐     │
│  │ Contraseña           👁  │     │  <- Campo contraseña
│  └──────────────────────────┘     │
│                                    │
│  [Mensaje de error si existe]     │
│                                    │
│  ┌──────────────────────────┐     │
│  │    Registrarse           │     │  <- Botón
│  └──────────────────────────┘     │
│                                    │
│  ¿Ya tienes cuenta? Inicia sesión  │  <- Link a login
│                                    │
└────────────────────────────────────┘
```

**Funcionalidades:**
- Validación de nombre, email y contraseña
- Contraseña mínima de 6 caracteres
- Validación de formato de email
- Verificación de email duplicado
- Al registro exitoso, navega a home

### 5. Pantalla de Configuración

```
┌────────────────────────────────────┐
│ ☰  Configuración                  │
├────────────────────────────────────┤
│                                    │
│       Configuración                │  <- Título
│                                    │
│  ┌──────────────────────────┐     │
│  │ Apariencia               │     │
│  │                          │     │
│  │ 🌙 Modo Oscuro           │     │
│  │    Activado/Desactivado  │     │
│  │                     [🔘] │     │  <- Switch
│  └──────────────────────────┘     │
│                                    │
│  ┌──────────────────────────┐     │
│  │ Acerca de                │     │
│  │                          │     │
│  │ Aprender Palabras v1.0   │     │
│  │                          │     │
│  │ Mejora tu vocabulario    │     │
│  │ cada día con nuevas      │     │
│  │ palabras y definiciones. │     │
│  └──────────────────────────┘     │
│                                    │
└────────────────────────────────────┘
```

**Funcionalidades:**
- Switch para activar/desactivar modo oscuro
- Cambio inmediato del tema
- Persistencia de la preferencia
- Información de la app

## Flujo de Navegación

```
             ┌─────────────┐
             │   Drawer    │
             │   (Menú)    │
             └──────┬──────┘
                    │
        ┌───────────┼───────────┬───────────┐
        │           │           │           │
        ▼           ▼           ▼           ▼
    ┌───────┐  ┌───────┐  ┌────────┐  ┌──────────┐
    │ Home  │  │ Login │  │Register│  │ Settings │
    └───────┘  └───┬───┘  └───┬────┘  └──────────┘
                   │          │
                   └────┬─────┘
                        │
                   ┌────▼────┐
                   │  Home   │
                   │(Success)│
                   └─────────┘
```

## Temas (Modo Claro/Oscuro)

### Modo Claro
- **Primary**: Azul (#00639B)
- **Background**: Blanco (#FDFCFF)
- **Surface**: Blanco con elevación
- **OnPrimary**: Blanco
- **OnBackground**: Negro suave

### Modo Oscuro
- **Primary**: Azul claro (#90CAF9)
- **Background**: Gris oscuro (#1A1C1E)
- **Surface**: Gris oscuro con elevación
- **OnPrimary**: Azul oscuro
- **OnBackground**: Blanco suave

## Características Técnicas

### Arquitectura MVVM

```
┌──────────────────────────────────────┐
│              Views                   │
│  (Composable UI Components)          │
└────────────┬─────────────────────────┘
             │ observes StateFlow
             ▼
┌──────────────────────────────────────┐
│           ViewModels                 │
│  (Business Logic & State)            │
└────────────┬─────────────────────────┘
             │ interacts with
             ▼
┌──────────────────────────────────────┐
│          Repositories                │
│  (Data Management)                   │
└────────────┬─────────────────────────┘
             │ manages
             ▼
┌──────────────────────────────────────┐
│        Data Sources                  │
│  (DataStore, In-Memory DB)           │
└──────────────────────────────────────┘
```

### Gestión de Estado

1. **StateFlow en ViewModels**: Estado reactivo observable
2. **collectAsState() en Composables**: Conversión a State para recomposición
3. **remember/mutableStateOf**: Estado local de UI

### Palabras por Día de la Semana

| Día       | Palabra      | Día       | Palabra     |
|-----------|--------------|-----------|-------------|
| Lunes     | Resiliente   | Viernes   | Innovador   |
| Martes    | Efímero      | Sábado    | Empático    |
| Miércoles | Diligente    | Domingo   | Versátil    |
| Jueves    | Perspicaz    |           |             |

**Palabras adicionales para práctica:**
- Serendipity, Pragmático, Tenaz, Meticuloso, Elocuente, Asertivo, Proactivo, Introspectivo

## Validaciones

### Login
- ✓ Email y contraseña requeridos
- ✓ Email debe estar registrado
- ✓ Contraseña debe coincidir

### Registro
- ✓ Nombre no puede estar vacío
- ✓ Email debe contener @
- ✓ Email no debe estar registrado
- ✓ Contraseña mínimo 6 caracteres

## Persistencia

### DataStore (Preferences)
- `dark_mode`: Boolean - Estado del modo oscuro

### In-Memory (Simulación)
- Lista de usuarios registrados
- Usuario actual en sesión

## Animaciones y Transiciones

- **Navegación**: Transiciones suaves entre pantallas
- **Drawer**: Animación de deslizamiento
- **Botones**: Ripple effect de Material Design
- **Switches**: Animación de toggle suave

## Accesibilidad

- Descripciones de contenido para lectores de pantalla
- Contraste de colores WCAG AAA
- Tamaños de fuente escalables
- Áreas táctiles >= 48dp

---

Esta documentación describe la estructura completa y funcionalidades de la aplicación Aprender Palabras.
