import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlanningTest {

    @Test
    void ajout() throws ExceptionPlanning {
        Planning planning = new Planning(8);

        // Test: Ajouter une réservation quand le tableau est plein
        fillPlanning(planning);
        Reservation r1 = new Reservation(new Date(5, 2, 2025), new PlageHoraire(new Horaire(14, 0), new Horaire(15, 0)), "Réunion");
        Planning finalPlanning = planning;
        assertThrows(ExceptionPlanning.class, () -> finalPlanning.ajout(r1));

        // Test: Ajouter une réservation avec une date non valide
        planning = new Planning(8);
        Reservation r2 = new Reservation(new Date(0, 2, 2025), new PlageHoraire(new Horaire(10, 0), new Horaire(11, 0)), "RDV");
        Planning finalPlanning1 = planning;
        assertThrows(ExceptionPlanning.class, () -> finalPlanning1.ajout(r2));

        // Test: Ajouter une réservation valide
        planning = new Planning(8);
        Reservation r3 = new Reservation(new Date(3, 2, 2025), new PlageHoraire(new Horaire(9, 0), new Horaire(10, 0)), "Cours");
        Planning finalPlanning2 = planning;
        assertDoesNotThrow(() -> finalPlanning2.ajout(r3));

        // Test: Ajouter une réservation déjà existante
        Planning finalPlanning3 = planning;
        assertThrows(ExceptionPlanning.class, () -> finalPlanning3.ajout(r3));
    }

    @Test
    void getReservation() throws ExceptionPlanning {
        Planning planning = new Planning(8);
        Reservation r1 = new Reservation(new Date(10, 2, 2025), new PlageHoraire(new Horaire(8, 0), new Horaire(9, 0)), "Sport");
        planning.ajout(r1);
        assertEquals(r1, planning.getReservation(new Date(10, 2, 2025)));

        assertNull(planning.getReservation(new Date(1, 1, 2025)));
    }


    private void fillPlanning(Planning planning) throws ExceptionPlanning {
        for (int i = 0; i < planning.getTaille(); i++) {
            planning.ajout(new Reservation(new Date(i + 1, 2, 2025), new PlageHoraire(new Horaire(9, 0), new Horaire(10, 0)), "Test" + i));
        }
    }
}
