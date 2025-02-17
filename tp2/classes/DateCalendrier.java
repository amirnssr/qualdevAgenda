/**
 * Classe DateCalendrier qui étend la classe Date et implémente les interfaces ConstantesCalendrier et Comparable.
 * Elle représente une date avec le jour de la semaine inclus.
 */
package classes;

import interfaces.ConstantesCalendrier;

import java.util.Calendar;

public class DateCalendrier extends Date implements ConstantesCalendrier, Comparable<Date> {
    /**
     * Attribut représentant le jour de la semaine (1 = Lundi, ..., 7 = Dimanche).
     */
    public int chJourSemaine;

    /**
     * Constructeur par défaut initialisant la date au jour courant et calculant le jour de la semaine.
     */
    public DateCalendrier() {
        Calendar today = Calendar.getInstance();
        chAnnee = today.get(Calendar.YEAR);
        chMois = today.get(Calendar.MONTH) + 1;
        chJour = today.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = today.get(Calendar.DAY_OF_WEEK);
        chJourSemaine = (dayOfWeek == 1) ? 7 : dayOfWeek - 1;
    }

    /**
     * Constructeur avec paramètres initialisant la date et calculant le jour de la semaine.
     * @param chJour Jour du mois.
     * @param chMois Mois de l'année.
     * @param chAnnee Année.
     */
    public DateCalendrier(int chJour, int chMois, int chAnnee) {
        super(chJour, chMois, chAnnee);
        Calendar today = Calendar.getInstance();
        today.set(this.chAnnee, this.chMois - 1, this.chJour);
        this.chAnnee = today.get(Calendar.YEAR);
        this.chMois = today.get(Calendar.MONTH) + 1;
        this.chJour = today.get(Calendar.DAY_OF_MONTH);
        this.chJourSemaine = (today.get(Calendar.DAY_OF_WEEK) == 1) ? 7 : today.get(Calendar.DAY_OF_WEEK) - 1;
    }

    /**
     * Retourne la date de la veille sous forme d'objet DateCalendrier.
     * @return DateCalendrier correspondant à la veille.
     */
    public DateCalendrier dateDeLaVeille() {
        Date d = super.dateDeLaVeille();
        return new DateCalendrier(d.chJour, d.chMois, d.chAnnee);
    }

    /**
     * Retourne la date du lendemain sous forme d'objet DateCalendrier.
     * @return DateCalendrier correspondant au lendemain.
     */
    public DateCalendrier dateDuLendemain() {
        Date d = super.dateDuLendemain();
        return new DateCalendrier(d.chJour, d.chMois, d.chAnnee);
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de l'objet DateCalendrier.
     * @return Chaîne représentant la date avec le jour de la semaine.
     */
    public String toString() {
        return ConstantesCalendrier.JOURS_SEMAINE[chJourSemaine - 1] + " " + chJour + " " + ConstantesCalendrier.MOIS[chMois - 1];
    }

    /**
     * Compare deux objets Date.
     * @param date La date à comparer.
     * @return Un entier négatif, zéro ou positif selon que cette date est antérieure, égale ou postérieure à l'autre.
     */
    public int compareTo(Date date) {
        if (date.chAnnee > chAnnee) return -1;
        if (date.chAnnee < chAnnee) return 1;
        if (date.chMois > chMois) return -1;
        if (date.chMois < chMois) return 1;
        if (date.chJour > chJour) return -1;
        if (chJour > date.chJour) return 1;
        return 0;
    }
}
