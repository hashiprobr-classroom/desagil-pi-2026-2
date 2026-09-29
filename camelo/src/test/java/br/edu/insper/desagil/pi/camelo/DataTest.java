package br.edu.insper.desagil.pi.camelo;

import org.junit.jupiter.api.Test;

public class DataTest {
    @Test
    void diaAcima() {
        d = new Data(2026, 1, 32);
        assertEquals(31, d.getDia());

        d = new Data(2024, 2, 32); // bissexto
        assertEquals(29, d.getDia());

        d = new Data(2026, 2, 32); // normal
        assertEquals(28, d.getDia());

        d = new Data(2026, 3, 32);
        assertEquals(31, d.getDia());

        d = new Data(2026, 4, 32);
        assertEquals(30, d.getDia());

        d = new Data(2026, 5, 32);
        assertEquals(31, d.getDia());

        d = new Data(2026, 6, 32);
        assertEquals(30, d.getDia());

        d = new Data(2026, 7, 32);
        assertEquals(31, d.getDia());

        d = new Data(2026, 8, 32);
        assertEquals(31, d.getDia());

        d = new Data(2026, 9, 32);
        assertEquals(30, d.getDia());

        d = new Data(2026, 10, 32);
        assertEquals(31, d.getDia());

        d = new Data(2026, 11, 32);
        assertEquals(30, d.getDia());

        d = new Data(2026, 12, 32);
        assertEquals(31, d.getDia());
    }
}
