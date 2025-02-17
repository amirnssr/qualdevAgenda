package test;

import classes.Horaire;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HoraireTest {

    @Test
    void toMinutes() {
        // Exemple 1: Heure 8h30 (8h et quart)
        Horaire horaire1 = new Horaire(8, 30);
        assertEquals(510, horaire1.toMinutes());  // 8h * 60 + 30 = 510 minutes

        // Exemple 2: Heure 9h15 (9h et quart)
        Horaire horaire2 = new Horaire(9, 15);
        assertEquals(555, horaire2.toMinutes());  // 9h * 60 + 15 = 555 minutes

        // Exemple 3: Heure 0h00 (minuit)
        Horaire horaire3 = new Horaire(0, 0);
        assertEquals(0, horaire3.toMinutes());  // 0h * 60 + 0 = 0 minutes

        // Exemple 4: Heure 23h45 (23h et trois quarts)
        Horaire horaire4 = new Horaire(23, 45);
        assertEquals(1425, horaire4.toMinutes());  // 23h * 60 + 45 = 1425 minutes
    }


    @Test
    void getHeure() {
        Horaire horaire = new Horaire(10, 15);
        assertEquals(10, horaire.getHeure());
    }


    @Test
    void getQuartHeure() {
        Horaire horaire = new Horaire(10, 15);
        assertEquals(15, horaire.getQuartHeure());
    }


    @Test
    void setHeure() {
        Horaire horaire = new Horaire(10, 15);
        horaire.setHeure(12);  // Changer l'heure en 12h
        assertEquals(12, horaire.getHeure());
    }


    @Test
    void setQuartHeure() {
        Horaire horaire = new Horaire(10, 15);
        horaire.setQuartHeure(45);  // Changer le quart d'heure en 45
        assertEquals(45, horaire.getQuartHeure());
    }

}