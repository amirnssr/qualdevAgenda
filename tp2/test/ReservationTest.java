package test;

import classes.Date;
import classes.Horaire;
import classes.PlageHoraire;
import classes.Reservation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReservationTest {

    @Test
    void compareTo() {
        Date date1 = new Date(10, 3, 2022);
        Date date2 = new Date(11, 3, 2022);
        Horaire h1 = new Horaire(9, 0);
        Horaire h2 = new Horaire(11, 0);
        Horaire h3 = new Horaire(14, 0);
        Horaire h4 = new Horaire(16, 0);

        PlageHoraire ph1 = new PlageHoraire(h1, h2);
        PlageHoraire ph2 = new PlageHoraire(h3, h4);

        Reservation res1 = new Reservation(date1, ph1, "Réunion A");
        Reservation res2 = new Reservation(date2, ph2, "Réunion B");
        Reservation res3 = new Reservation(date1, ph2, "Réunion C");

        assertTrue(res1.compareTo(res2) < 0, "res1 devrait être avant res2");
        assertTrue(res2.compareTo(res1) > 0, "res2 devrait être après res1");
        assertTrue(res1.compareTo(res3) < 0, "res1 devrait être avant res3 à cause de la plage horaire");
        assertEquals(0, res1.compareTo(new Reservation(date1, ph1, "Réunion D")), "Les réservations identiques devraient être égales");
    }

    @Test
    void estValide() {
        Date dateValide = new Date(15, 8, 2023);
        Horaire h5 = new Horaire(10, 0);
        Horaire h6 = new Horaire(12, 0);
        PlageHoraire ph = new PlageHoraire(h5, h6);
        Reservation resValide = new Reservation(dateValide, ph, "Séminaire");

        assertTrue(resValide.estValide(), "La réservation devrait être valide.");

        Date dateInvalide = new Date(31, 4, 2023);
        Reservation resInvalide = new Reservation(dateInvalide, ph, "Conférence");

        assertFalse(resInvalide.estValide(), "La réservation avec une date invalide ne devrait pas être valide.");
    }
}
