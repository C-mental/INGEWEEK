INGEWEEK – Aplicación Android
IngeWeek es una aplicación móvil desarrollada en Android Studio usando Kotlin. Su propósito es informar de forma clara y rápida sobre las actividades que se realizarán durante la Semana de Ingeniería de la Universidad Nacional del Santa (UNS), incluyendo la agenda diaria, los seminarios académicos y las ubicaciones donde se desarrollan los eventos.

FUNCIONALIDADES PRINCIPALES
Agenda: muestra una lista con todos los eventos oficiales por día, incluyendo hora y lugar.
Seminarios: muestra una lista con ponencias detalladas, nombre del seminario, ponente, fecha, hora y ubicación.
Ubicación: permite ver los lugares donde se desarrollan actividades. Cuenta con un filtro interactivo por tipo de lugar (Auditorio, Plazuela, Complejo).
Barra de navegación inferior (BottomNavigationView) para cambiar entre secciones de forma intuitiva.
Interfaz limpia y moderna, usando los colores institucionales del evento (rojo Pantone DS 98-1 C).
Adaptado a Material Design 3, usando ChipGroup, RecyclerView, CardView y MaterialToolbar.

TECNOLOGÍAS USADAS
Kotlin como lenguaje principal
Android Studio Electric Eel
Material Design 3 (Material3)
RecyclerView + Adapter para listas dinámicas
CardView para mostrar seminarios y ubicaciones
ViewBinding para acceso seguro a las vistas
Navigation Component para navegación entre fragments
Glide para carga de imágenes (si se usan en el futuro)
Gradle Kotlin DSL para la configuración del proyecto

ESTRUCTURA INTERNA DEL PROYECTO
El proyecto está organizado por carpetas:
ui/agenda → contiene el fragment y layout de la sección de Agenda.
ui/seminarios → contiene el fragment, adapter y layout para la lista de seminarios.
ui/ubicaciones → incluye el fragment, adapter y lógica de filtrado con chips.
model → contiene clases de datos (Seminario, Ubicacion, Evento).
adapter → contiene los adapters de RecyclerView.
res/layout → contiene los archivos XML de la interfaz.
res/drawable → contiene imágenes como íconos o fotos de ubicaciones.
res/values → estilos, colores y textos.
res/navigation/nav_graph.xml → gestiona las rutas entre fragments.

DESCRIPCIÓN DE LAS SECCIONES Y PANTALLAS
1. Agenda 
Se muestra una lista de eventos con su nombre, hora y lugar. Cada evento está contenido dentro de una tarjeta (CardView). Es ideal para revisar la programación diaria.

2. Seminarios 
Lista de conferencias con:
Título del seminario
Nombre del ponente
Fecha y hora
Lugar del evento
Está implementada con un RecyclerView y se alimenta con datos simulados (puede conectarse a una base de datos en el futuro).

3. Ubicaciones 
Permite ver los lugares disponibles. Al usar los chips de la parte superior se puede filtrar por:
Plazuela
Auditorio
Complejo
Cada ubicación muestra una imagen, nombre y dirección. Todo está contenido en tarjetas con bordes redondeados.
