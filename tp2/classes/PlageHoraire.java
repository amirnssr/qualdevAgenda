/**
 * Classe PlageHoraire représentant une plage horaire avec une heure de début et une heure de fin.
 */
package classes;

/**
 * PlageHoraire est une classe permettant de manipuler des plages horaires définies par une heure de début et une heure de fin.
 */
public class PlageHoraire {
    /** Durée minimale d'une plage horaire en minutes. */
    final static int chDUREEMIN = 60;

    /** Heure de début de la plage horaire. */
    private Horaire chHeureDebut;

    /** Heure de fin de la plage horaire. */
    private Horaire chHeureFin;

    /**
     * Constructeur de la classe PlageHoraire.
     * @param HeureDebut Heure de début de la plage.
     * @param HeureFin Heure de fin de la plage.
     */
    public PlageHoraire(Horaire HeureDebut, Horaire HeureFin) {
        chHeureDebut = HeureDebut;
        chHeureFin = HeureFin;
    }

    /**
     * Retourne une représentation sous forme de chaîne de la plage horaire.
     * @return Chaîne représentant la plage horaire.
     */
    public String toString() {
        return chHeureDebut.getHeure() + "h" + chHeureDebut.getQuartHeure() + "-" + chHeureFin.getHeure() + "h"
                + chHeureFin.getQuartHeure();
    }

    /**
     * Calcule la durée totale de la plage horaire en minutes.
     * @return Durée en minutes.
     */
    public int duree() {
        return chHeureFin.toMinutes() - chHeureDebut.toMinutes();
    }

    /**
     * Convertit la durée de la plage horaire en format heures et minutes.
     * @return Chaîne représentant la durée (ex: 2h15).
     */
    public String convert() {
        int h = duree() / 60;
        int min = duree() % 60;
        if (min < 10 && min >= 0)
            return h + "h0" + min;
        else
            return h + "h" + min;
    }

    /**
     * Compare deux plages horaires en fonction de leur heure de début.
     * @param PH PlageHoraire à comparer.
     * @return 1 si cette plage est après PH, -1 si avant, 0 si identique.
     */
    public int compareTo(PlageHoraire PH) {
        if (this.chHeureDebut.toMinutes() > PH.chHeureDebut.toMinutes())
            return 1;
        if (this.chHeureDebut.toMinutes() < PH.chHeureDebut.toMinutes())
            return -1;
        else
            return 0;
    }
}
