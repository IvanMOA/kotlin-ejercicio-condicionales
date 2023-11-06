/*
|--------------------------------------------------------------------------
| Ejercicio 1 - Estructura condicional if
|--------------------------------------------------------------------------
| Escribe un programa que le pida al usuario ingresar su edad y que imprima en la consola
| si tiene edad para votar o no, de acuerdo a la edad ingresada, asumiendo que la edad mínima
| para votar es de 18 años.
|
| Recuerda que nunca se sabe lo que el usuario ingresará en nuestros programas, por lo que en caso
| de que el usuario ingrese algo que no sea convertible a un entero, como "hola", deberemos hacerle
| saber que lo que ingresó no es válido
| 
| Nota: Puedes revisar si una variable es null o no de la siguiente manera:
|
|  if (variable == null) {
|      // La variable es null
|  }
|  
|  o al revés
|
|  if(variable != null) {
|      // La variable no es null
|  }
|
*/
fun main() {
    println("Por favor, ingresa tu edad: ")
    // El método readLine() permite leer una línea de texto desde la consola. Esperará
    // en esa línea hasta que el usuario ingrese algo y presione la tecla Enter. Esto nos
    // regresa lo que el usuario escribió en forma de String
    val entrada = readLine()
    // Se trata de convertir lo que el usuario ingresó a un número entero. Si no se puede
    // convertir porque lo que el usuario ingresó no es convertible a un número, se asigna null
    // a la variable edad. El uso de ? se explicará más adelante.
    val edad = entrada?.toIntOrNull()
    
    // Tu código aquí
}
