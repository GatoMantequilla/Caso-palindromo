import static org.junit.jupiter.api.Assertions.*;

class PalindromosTest {

    @org.junit.jupiter.api.Test
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
    }
}