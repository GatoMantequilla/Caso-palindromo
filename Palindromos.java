public class Palindromos {
    public static <T> boolean esPalindromo(T entrada){
        String texto = entrada.toString().replaceAll("\\s+","").toLowerCase();
        StringBuilder salida = new StringBuilder(texto).reverse();
        return salida.toString().equals(texto);
    }
}
