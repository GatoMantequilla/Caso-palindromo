import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromomordnilaPTest {

    @Test
    void esPalindromo() {

        assertTrue(PalindromomordnilaP.esPalindromo("aca"));
        assertFalse(PalindromomordnilaP.esPalindromo("acas"));
        assertTrue(PalindromomordnilaP.esPalindromo("h"));
        assertFalse(PalindromomordnilaP.esPalindromo(String.valueOf(200)));
        assertTrue(PalindromomordnilaP.esPalindromo(""));
        assertTrue(PalindromomordnilaP.esPalindromo( "aaabccbaaa"));
        assertFalse(PalindromomordnilaP.esPalindromo("ahabccbaaa"));
        assertTrue(PalindromomordnilaP.esPalindromo("La tele letal"));

        System.out.println("Pruebas unitarias finalizadas");
    }
}