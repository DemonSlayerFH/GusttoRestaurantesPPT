GUSTTO - DEMOSTRACION RECYCLERVIEW + CARDVIEW

Proyecto de ejemplo en Java y XML adaptado desde CardRecyclerDemo.
Los restaurantes son ficticios y se cargan en MainActivity (sin base de datos ni API).

CLASES
- Restaurante.java: modelo de datos (nombre, descripcion, categoria).
- RestauranteAdapter.java: conecta datos con las tarjetas de item_card.xml.
- MainActivity.java: crea la lista y configura el RecyclerView.

COMO ABRIR
1. Descomprimir el ZIP.
2. Android Studio > File > Open > seleccionar la carpeta GusttoRestaurantes.
3. Sincronizar Gradle y ejecutar.
4. JDK 17 y Android SDK 35. AndroidX habilitado en gradle.properties.

IMPORTANTE
El ZIP de origen no contenia Gradle Wrapper (faltan gradle-wrapper.jar y gradle-wrapper.properties).
Si Android Studio solicita configurar Gradle, configurar Gradle 8.9 con JDK 17,
o generar el Wrapper desde una instalacion existente de Gradle compatible.
No se ha compilado este proyecto en este entorno.
