class PalindromomordnilaP {

    public static void main(String[] args) {
        String palabra = "Anita lava la tina";
        if (esPalindromo(palabra)) {
            System.out.println(palabra + " es un palíndromo.");
        } else {
            System.out.println(palabra + " no es un palíndromo.");
        }
    }

    public static boolean esPalindromo(String palabra) {
        String palabraLimpia = palabra.toLowerCase().replaceAll("[^a-z0-9]", "");
        String palabraInvertida = new StringBuilder(palabraLimpia).reverse().toString();
        return palabraLimpia.equals(palabraInvertida);
    }
}
