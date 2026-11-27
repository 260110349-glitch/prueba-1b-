# Problema 1 — Modulo Geometrico-Vectorial

## Descripcion
Calcula la variacion de posicion (incrementos deltaX y deltaY), la pendiente (m) y la magnitud (d) del vector resultante entre dos puntos en el plano cartesiano 2D: P1(x1, y1) y P2(x2, y2).

## Formulas aplicadas
- deltaX = x2 - x1
- deltaY = y2 - y1
- m = deltaY / deltaX (validando deltaX != 0 para evitar division entre cero)
- d = raiz cuadrada de ((deltaX)^2 + (deltaY)^2)

## Compilacion y ejecucion
javac problemas/problema-1/src/ModuloGeometricoVectorial.java
java -cp problemas/problema-1/src ModuloGeometricoVectorial

## Ejemplo de uso
- Entrada P1: 0,0
- Entrada P2: 3,4
- Salida esperada: deltaX = 3.00, deltaY = 4.00, m = 1.33, Magnitud = 5.00 unidades
