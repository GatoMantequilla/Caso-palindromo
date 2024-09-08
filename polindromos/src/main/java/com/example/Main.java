package com.example;

public class Main {
    public static void main(String[] args) {
        
    }

    public static boolean esPalindromo(String cadena) {
    String invertida = new StringBuilder(cadena).reverse().toString();
    return cadena.equals(invertida);
    }

    public static <T> boolean esPalindromo2(T entrada) {
        String texto = entrada.toString().replaceAll("\\s+", "").toLowerCase();
        StringBuilder salida = new StringBuilder(texto).reverse();
        return salida.toString().equals(texto);
    }

    
}