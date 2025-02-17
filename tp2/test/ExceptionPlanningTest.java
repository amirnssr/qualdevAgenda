package test;

import classes.ExceptionPlanning;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionPlanningTest {

    @Test
    void getCodeErreur() {
        // Créer une instance de ExceptionPlanning avec un code d'erreur spécifique (ex: 404)
        ExceptionPlanning exception = new ExceptionPlanning(404);

        // Vérifier que le code d'erreur retourné est bien 404
        assertEquals(404, exception.getCodeErreur());

        // Créer une autre instance avec un code d'erreur différent (ex: 500)
        ExceptionPlanning exception2 = new ExceptionPlanning(500);

        // Vérifier que le code d'erreur retourné est bien 500
        assertEquals(500, exception2.getCodeErreur());
    }

}