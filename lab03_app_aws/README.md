# LAB 03 - Experimento Cloud

## Contenido

- Fichero Dcokerfile para construir una imagen entorno ELK preparada para este taller
- Fichero de configuración de logstash para contruir la imagen.
- Aplicación web Java (Spring Boot) configurada para loguear directamente contra Logstash

## Lanzar aplicación

Ir a la carpeta raíz de la aplicación

```
$ cd forouvigo
```

Lanzar aplicación con Gradle

```
$ ./gradlew bootRun
```

Lanzar una petición HTTP contra la aplicación

```
http://localhost:8080/?name=MiNombre
```