# LAB 01 - Taller de bash

## Contenido

Fichero log de ejemplo (sobre 500k líneas) para practicar extracciones de datos.

Los distintos ejercicios son de bash scripting, por lo que se requiere un entorno POSIX (ej. GNY/Linux, Mac OS, Cygwin, Git Bash...)

## Retos

A continuación se presentan distintos retos. Se propone modificar este fichero en un branch con el nombre del participante y subir al repositorioa las soluciones. 

### Reto 1: Errores HTTP 50x por hora


```sh
grep "HTTP/1.1\" 50" sample.log | awk -F':' '{print $2}' | uniq -c | awk '{print $2,$1}'
```
 
```
03 2
06 1
09 2
10 6
11 6
12 1
14 5
15 7
16 4
17 16
18 1
19 2
20 5
21 4
22 1
```

### Reto 2: Peticiones por hora

```sh
cat sample.log | awk -F':' '{print $2}' | uniq -c | awk '{print $2,$1}'
```

```
00 2436
01 1294
02 41771
03 38127
04 7490
05 2574
06 744
07 1815
08 15775
09 29750
10 28856
11 33722
12 34387
13 28635
14 30823
15 23016
16 26650
17 23452
18 21454
19 14586
20 9853
21 4024
22 2702
23 505
```

### Reto 3: Tiempo medio peticiones 

Extra: Por hora

### Reto 4: Top 10 operaciones más invocadas

### Reto 5: Top HTTP Method (GET, POST, PUT, PATCH, DELETE)

### Reto 6:  Porcentajes OK (HTPP 200..399) y KO

