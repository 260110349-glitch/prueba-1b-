# Problema 2 — Modulo Financiero-Logico

## Descripcion
Evalua la tasa de impuesto aplicable (0%, 8% o 16%) en la compra de equipo tecnologico mediante operadores logicos proposicionales, a partir de dos condiciones binarias (1 = Verdadero, 0 = Falso):
- p: El comprador es estudiante acreditado.
- q: El equipo pertenece al catalogo educativo.

## Reglas logicas aplicadas
- Exencion total (0%): p = 1 AND q = 1
- Tasa subvencionada / reducida (8%): (p = 1 AND q = 0) OR (p = 0 AND q = 1)
- Tasa general estandar (16%): p = 0 AND q = 0

## Compilacion y ejecucion
javac problemas/problema-2/src/ModuloFinancieroLogico.java
java -cp problemas/problema-2/src ModuloFinancieroLogico

## Ejemplo de uso
- Entrada p: 1
- Entrada q: 0
- Costo base: 15867
- Salida esperada: Impuesto 8% (1269.36), Importe final: 17136.36
