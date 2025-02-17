/*package com.leviplanelles.tema06.vicente;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProcesadorNumerosTest {
    private ProcesadorNumeros procesador;

    @BeforeEach
    void setUp() {
        procesador = new ProcesadorNumeros();
    }

    @Test
    void testEsPrimo() {
        assertTrue(procesador.esPrimo(2));
        assertTrue(procesador.esPrimo(3));
        assertFalse(procesador.esPrimo(4));
        assertTrue(procesador.esPrimo(5));
        assertFalse(procesador.esPrimo(1));
        assertFalse(procesador.esPrimo(0));
        assertFalse(procesador.esPrimo(-7));
    }

    @Test
    void testFactorial() {
        assertEquals(1, procesador.factorial(0));
        assertEquals(1, procesador.factorial(1));
        assertEquals(120, procesador.factorial(5));
        assertEquals(720, procesador.factorial(6));
        assertThrows(IllegalArgumentException.class, () -> procesador.factorial(-1));
    }

    @Test
    void testContarPares() {
        assertEquals(2, procesador.contarPares(new int[]{1, 2, 3, 4})); // ERROR: debe ser 2, pero el código suma 1 extra
        assertEquals(3, procesador.contarPares(new int[]{2, 4, 6}));
        assertEquals(0, procesador.contarPares(new int[]{1, 3, 5}));
        assertThrows(IllegalArgumentException.class, () -> procesador.contarPares(null));
    }

    @Test
    void testEncontrarMaximo() {
        assertEquals(5, procesador.encontrarMaximo(new int[]{1, 2, 3, 4, 5}));
        assertEquals(10, procesador.encontrarMaximo(new int[]{10, 2, 3, 4, 5}));
        assertEquals(-1, procesador.encontrarMaximo(new int[]{-5, -3, -1}));
        assertThrows(IllegalArgumentException.class, () -> procesador.encontrarMaximo(null));
        assertThrows(IllegalArgumentException.class, () -> procesador.encontrarMaximo(new int[]{}));
    }

    @Test
    void testEsPalindromo() {
        assertTrue(procesador.esPalindromo(121));
        assertTrue(procesador.esPalindromo(0));
        assertTrue(procesador.esPalindromo(1221));
        assertFalse(procesador.esPalindromo(123));
        assertFalse(procesador.esPalindromo(-121));
    }
}
*/