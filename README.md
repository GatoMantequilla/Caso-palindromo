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

