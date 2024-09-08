
# Caso Palíndromos - Pruebas Unitarias

## Paso 1:

```javascript
function esPalindromo(cadena) {
    let resultado = "";
    resultado = cadena.split('').reverse().join('');
    return cadena === resultado;
}
```

Este método recibe una cadena como parámetro y determina si es un palíndromo. Para ello, crea una variable llamada `resultado` de tipo `let`, a la cual se le asigna la cadena invertida utilizando los métodos `split`, `reverse` y `join`. Finalmente, retorna el resultado de comparar la variable `resultado` con la cadena original; si son iguales, devuelve `true`, de lo contrario, devuelve `false`.

Por ejemplo, si ingresamos la palabra "perro", el método devolverá `false`, ya que "perro" no es un palíndromo. En cambio, si ingresamos "ana", el resultado será `true`, ya que esta palabra es un palíndromo.

## Paso 2:

En el método `esPalindromo` tenemos 3 funciones principales:

1. `split`: Esta función toma un string y lo divide en caracteres, colocando cada uno en un array.
2. `reverse`: Invierte el orden del array creado por `split`.
3. `join`: Une los caracteres del array invertido en un nuevo string.

Una vez realizado esto, el retorno de la función compara si el string ingresado es igual al string resultante después de aplicar las funciones. Dependiendo de esta comparación, devuelve `true` si es un palíndromo, o `false` si no lo es.

### Versión Equivalente

```java
public static boolean esPalindromo(String cadena) {
    String invertida = new StringBuilder(cadena).reverse().toString();
    return cadena.equals(invertida);
}
```

En este caso, la variable `invertida` es equivalente a `resultado` en el método inicial. Aquí se utiliza un objeto de tipo `StringBuilder` para realizar el trabajo de `split`, el método `reverse()` cumple la misma función que `reverse`, y finalmente, el método `toString()` realiza el trabajo de `join`. Luego, mediante el método `equals()`, se compara la cadena original con la invertida para verificar si son iguales.

## Paso 3:

Las pruebas a realizar serán las siguientes:

1. Ingresar espacios vacíos.
2. Ingresar palabras que tengan mayúsculas.
3. Ingresar palabras con espacios.
4. Ingresar un carácter.
5. Ingresar caracteres especiales.

```java
@Test
void esPalindromo() {
    assertTrue(Palindromos.esPalindromo(""));
    assertTrue(Palindromos.esPalindromo("Ana"));
    assertTrue(Palindromos.esPalindromo("a n a"));
    assertTrue(Palindromos.esPalindromo("a"));
    assertTrue(Palindromos.esPalindromo("@@@"));
}
```

Al realizar las pruebas, la única que falló fue la prueba con mayúsculas en la cadena.

Continuando con las pruebas para las entradas "aca", "acas", "h":

```java
@Test
void esPalindromo() {
    assertTrue(Palindromos.esPalindromo("aca"));
    assertFalse(Palindromos.esPalindromo("acas"));
    assertTrue(Palindromos.esPalindromo("h"));
}
```

Al realizar las pruebas con estas entradas, no hubo ningún error.

## Paso 4:

Si analizamos los casos propuestos y los comparamos con los ya realizados, consideramos que los casos donde podrían presentarse problemas son el 1 y el 5. En el primer caso, se utiliza una entrada de tipo `int`, mientras que el método espera un `String`. Por otro lado, ya confirmamos que el programa no funciona correctamente cuando se ingresan mayúsculas.

### Nuevo Método

```java
public static <T> boolean esPalindromo(T entrada) {
    String texto = entrada.toString().replaceAll("\\s+", "").toLowerCase();
    StringBuilder salida = new StringBuilder(texto).reverse();
    return salida.toString().equals(texto);
}
```

El método `esPalindromo` recibe un parámetro de tipo genérico `<T>` y lo convierte en una cadena de texto utilizando `toString()`, elimina los espacios en blanco con `replaceAll("\\s+", "")` y lo convierte todo a minúsculas con `toLowerCase()`. Luego, invierte esta cadena utilizando `StringBuilder` y su método `reverse()`. Finalmente, compara la cadena invertida con el texto original (sin espacios y en minúsculas) y devuelve `true` si son iguales, lo que indica que es un palíndromo, o `false` en caso contrario.

### Nuevas Pruebas

```java
@Test
void esPalindromo() {
    assertTrue(Palindromos.esPalindromo("aca"));
    assertFalse(Palindromos.esPalindromo("acas"));
    assertTrue(Palindromos.esPalindromo("h"));
    assertFalse(Palindromos.esPalindromo(200));
    assertTrue(Palindromos.esPalindromo(""));
    assertTrue(Palindromos.esPalindromo("aaabccbaaa"));
    assertFalse(Palindromos.esPalindromo("ahabccbaaa"));
    assertTrue(Palindromos.esPalindromo("La tele letal"));

    System.out.println("Prueba aprobada correctamente...");
}
```

### Mejoras en el Método

Consideramos varios aspectos importantes al mejorar nuestro método. Identificamos problemas en nuestras pruebas iniciales, como la falta de manejo para valores enteros y diferencias en la capitalización. Además, aunque no detectamos fallos relacionados con el espaciado en las pruebas, tuvimos en cuenta que pueden existir diferentes tipos de espaciado, como espacios normales y tabulaciones.

Para abordar estos problemas, optimizamos el método utilizando genéricos, lo que permite que acepte diversos tipos de entrada. Convertimos la entrada a `String` usando `toString()` para asegurarnos de que el `StringBuilder` pueda procesarla. Para manejar los espacios y diferencias de mayúsculas, empleamos `replaceAll("\\s+", "")` para eliminar todos los tipos de espaciado y `toLowerCase()` para eliminar la capitalización. Así, la comparación se realiza entre el texto procesado y no directamente con la entrada original.

Las pruebas jugaron un papel crucial al ayudarnos a entender cómo Java y nuestro método interpretan diferentes casos. Nos permitieron identificar y corregir las limitaciones del método, asegurando que el código funcione correctamente con una variedad de entradas y condiciones.
