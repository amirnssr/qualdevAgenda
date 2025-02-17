package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import classes.Date;

class DateTest {

    @Test
    void estValide() {
        assertTrue(new Date(29, 2, 2020).estValide()); // Année bissextile
        assertFalse(new Date(29, 2, 2019).estValide()); // Non bissextile
        assertTrue(new Date(31, 1, 2021).estValide()); // Date valide
        assertFalse(new Date(31, 4, 2021).estValide()); // Avril n'a que 30 jours
        assertFalse(new Date(0, 5, 2021).estValide()); // Jour invalide
        assertFalse(new Date(15, 13, 2021).estValide()); // Mois invalide
    }

    @Test
    void dernierjourdumois() {
        Date date = new Date();
        assertEquals(29, date.dernierjourdumois(2, 2020)); // Bissextile
        assertEquals(28, date.dernierjourdumois(2, 2019)); // Non bissextile
        assertEquals(31, date.dernierjourdumois(1, 2021)); // Janvier
        assertEquals(30, date.dernierjourdumois(4, 2021)); // Avril
    }

    @Test
    void estBissextile() {
        assertTrue(Date.estBissextile(2020));
        assertFalse(Date.estBissextile(2019));
        assertTrue(Date.estBissextile(2000));
        assertFalse(Date.estBissextile(1900));
    }

    @Test
    void dateDuLendemain() {
        Date date1 = new Date(28, 2, 2020); // Bissextile
        assertEquals("29/2/2020", date1.dateDuLendemain().toString());
        Date date2 = new Date(31, 12, 2021); // Fin d'année
        assertEquals("1/1/2022", date2.dateDuLendemain().toString());
        Date date3 = new Date(30, 4, 2021); // Mois avec 30 jours
        assertEquals("1/5/2021", date3.dateDuLendemain().toString());
    }

    @Test
    void dateDeLaVeille() {
        Date date1 = new Date(1, 3, 2020); // Bissextile
        assertEquals("29/2/2020", date1.dateDeLaVeille().toString());
        Date date2 = new Date(1, 1, 2022); // Début d'année
        assertEquals("31/12/2021", date2.dateDeLaVeille().toString());
        Date date3 = new Date(1, 5, 2021); // Mois avec 30 jours
        assertEquals("30/4/2021", date3.dateDeLaVeille().toString());
    }
}
