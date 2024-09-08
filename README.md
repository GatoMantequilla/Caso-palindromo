Caso Palíndromos - Pruebas Unitarias

# Paso 1:
    
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

# Paso 3:

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

# Paso 4:

Si analizamos los casos propuestos y comparamos con los ya realizados
creemos que los casos en que se puedan presentar problemas son el 1 y el 5,
ya que en el caso se usa una entrada int y el metodo recibe string, y por otro
lado ya confirmamos que al utilizar mayusculas el programa no funciona 
correctamente.

nuevo metodo:

    public static <T> boolean esPalindromo(T entrada){
    String texto = entrada.toString().replaceAll("\\s+","").toLowerCase();
    StringBuilder salida = new StringBuilder(texto).reverse();
    return salida.toString().equals(texto);
    }
nuevas pruebas:

    @Test
    void esPalindromo() {

        assertTrue(Palindromos.esPalindromo("aca"));
        assertFalse(Palindromos.esPalindromo("acas"));
        assertTrue(Palindromos.esPalindromo("h"));
        assertFalse(Palindromos.esPalindromo(200));
        assertTrue(Palindromos.esPalindromo(""));
        assertTrue(Palindromos.esPalindromo( "aaabccbaaa"));
        assertFalse(Palindromos.esPalindromo("ahabccbaaa"));
        assertTrue(Palindromos.esPalindromo("La tele letal"));

        System.out.println("Prueba aprobada correctamente...");

Tomamos en consideracion los problemas que se nos presentaron en 
nuestras pruebas, como el uso de los int y las mayusculas, pero ademas
preevimos que a pesar que no se presento en nuestras pruebas fallos de 
espaciado hay que considerar que hay distintos tipos, como el espaciado
normal y el tabulado.

Es por eso que mejoramos las entradas del metodo con el uso de genericos,
lo cual permite que el metodo reciba distintas entradas, en consecuencia 
dentro del mismo se tuvo que usar la funcion toString para poder usar el 
stringBuilder, tambien para prevenir el espaciado y el problema de las 
mayusculas usamos replaceAll con \\s+ que toma todos los tipos de espaciado
a lo largo del string y los reemplazamos con cadenas vacias, y luego 
lowerCase para no tener mayusculas a coomparacion, ademas que ahora la
comparacion se realiza con el texto formalizado y no con la entrada directa.

Las pruebas nos ayudaron a entender mejor la manera en que java y nuestra 
funcion de interpreta los distintos casos que se presentan y adaptar nuestro 
metodo en funcion de eso. 