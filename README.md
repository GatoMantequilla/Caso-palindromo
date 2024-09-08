Caso Palíndromos - Pruebas Unitarias

Paso 1:
    
    function esPalindromo(cadena) {
    
    let resultado = "";
    
    resultado = cadena.split('').reverse().join('');
    
    return cadena === resultado;*

    }
El metodo presentado toma una variable de entrada y decide si esta es un palindromo, esto lo hace tomando una variable llamada
resultado que es del tipo let, luego a resultado se le asigna el valor de cadena luego de que esta pasara por los metodos
split,reverse y join, por ultimo retorna la comparacion entre la variable resultado con la variable cadena sin procesar, si es igual
este retorna true, en caso contrario false.

Por ejemplo: si le ingresaramos la palabra perro esta nos devuelve False, ya que perro no es un palindromo, en cambio con ana
el resultado seria True, ya que esta palabra si es un palindromo.

Paso 2:
    
En el metodo tenemos 3 funciones principales:

split: Esta funcion toma un string y lo separa en caracteres para ponerlos en un array.

reverse: Toma el array creado con el split y lo invierte.

join: Una vez se invierte el array une los caracteres en un nuevo string

Con eso realizado en el retorno de la funcion compara si es igual el string
ingresado con el string creado mediante las funciones, dependiendo del resultado devuelve True o False.

    public static boolean esPalindromo(String cadena) {
    String invertida = new StringBuilder(cadena).reverse().toString();
    return cadena.equals(invertida);
    }
En este caso invertida equivale a resultado se usa un objeto tipo StringBuilder
para hacer el trabajo de split, reverse equivale a reverse y por ultimo toString hace el trabajo de join.
luego mediante el metodo equals se compara cadena con invertida.

Paso 3:

Las pruebas a realizar seran las siguientes:

ingresar espacios vacios.

ingresar palabras que tengan mayusculas.

ingresar palabras con espacios.

ingresar un caracter.

ingresar caracteres especiales.

     @Test
    void esPalindromo() {
        assertTrue(Palindromos.esPalindromo(""));
        assertTrue(Palindromos.esPalindromo("Ana"));
        assertTrue(Palindromos.esPalindromo("a n a"));
        assertTrue(Palindromos.esPalindromo("a"));
        assertTrue(Palindromos.esPalindromo("@@@"));
    }

Al realizar las pruebas la unica que fallo fue la prueba con mayusculas.


Continuando con las pruebas para las entradas "aca","acas","h"
    
    @Test
    void esPalindromo() {
    assertTrue(Palindromos.esPalindromo("aca"));
    assertFalse(Palindromos.esPalindromo("acas"));
    assertTrue(Palindromos.esPalindromo("h"));
    }
Al realizar las pruebas con estas entradas, no hubo ningun error.

