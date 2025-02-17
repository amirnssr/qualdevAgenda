package test;

import classes.DateCalendrier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateCalendrierTest {

    @Test
    void dateDeLaVeille() {
        DateCalendrier date = new DateCalendrier(1, 1, 2022);
        DateCalendrier veille = date.dateDeLaVeille();
        assertEquals("vendredi 31 décembre", veille.toString(), "La date de la veille est incorrecte.");
    }

    @Test
    void dateDuLendemain() {
        DateCalendrier date = new DateCalendrier(31, 12, 2021);
        DateCalendrier lendemain = date.dateDuLendemain();
        assertEquals("samedi 1 janvier", lendemain.toString(), "La date du lendemain est incorrecte.");
    }

}