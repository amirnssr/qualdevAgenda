/**
 * L'interface ConstantesErreurs contient des constantes de messages d'erreur relatifs à la gestion du planning.
 */
public interface ConstantesErreurs {

    /**
     * Tableau des messages d'erreur possibles pour la gestion du planning.
     *
     * ERREURS_PLANNING contient des messages pour indiquer différents types d'erreurs dans la gestion des réservations.
     */
    public final String[] ERREURS_PLANNING = {
            "Réservation invalide",       // Erreur pour une réservation invalide
            "classes.Planning complet",    // Erreur lorsque le planning est complet
            "Réservation incompatible"     // Erreur lorsque deux réservations sont incompatibles
    };
}
