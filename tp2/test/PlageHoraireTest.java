package test;

import classes.Horaire;
import classes.PlageHoraire;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlageHoraireTest {

    @Test
    void duree() {
        // Heure de début: 8h00, Heure de fin: 10h30
        Horaire debut = new Horaire(8, 0); // Supposons que l'objet Horaire fonctionne avec heure et minute.
        Horaire fin = new Horaire(10, 30);
        PlageHoraire plage = new PlageHoraire(debut, fin);

        // Vérifier que la durée est de 150 minutes (2h30)
        assertEquals(150, plage.duree());
    }


    @Test
    void convert() {
        // Exemple 1: Heure de début: 8h00, Heure de fin: 10h30
        Horaire debut1 = new Horaire(8, 0);
        Horaire fin1 = new Horaire(10, 30);
        PlageHoraire plage1 = new PlageHoraire(debut1, fin1);

        // Vérifier la conversion: 2h30
        assertEquals("2h30", plage1.convert());

        // Exemple 2: Heure de début: 9h45, Heure de fin: 12h00
        Horaire debut2 = new Horaire(9, 45);
        Horaire fin2 = new Horaire(12, 0);
        PlageHoraire plage2 = new PlageHoraire(debut2, fin2);

        // Vérifier la conversion: 2h15
        assertEquals("2h15", plage2.convert());

        // Exemple 3: Heure de début: 8h00, Heure de fin: 9h05
        Horaire debut3 = new Horaire(8, 0);
        Horaire fin3 = new Horaire(9, 5);
        PlageHoraire plage3 = new PlageHoraire(debut3, fin3);

        // Vérifier la conversion: 1h05
        assertEquals("1h05", plage3.convert());
    }

}