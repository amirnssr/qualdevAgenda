package classes;

/**
 * La classe Reservation représente une réservation avec une date, une plage horaire et un titre.
 */
public class Reservation {
    public Date chDate;
    public PlageHoraire chPlageHoraire;
    public String chTitre;

    /**
     * Constructeur pour initialiser une réservation avec une date, une plage horaire et un titre.
     *
     * @param parDate La date de la réservation.
     * @param parPlageHoraire La plage horaire de la réservation.
     * @param parTitre Le titre de la réservation.
     */
    public Reservation(Date parDate, PlageHoraire parPlageHoraire, String parTitre) {
        chDate = parDate;
        chPlageHoraire = parPlageHoraire;
        chTitre = parTitre;
    }

    /**
     * Retourne une chaîne représentant la réservation sous la forme suivante : titre, date, plage horaire.
     *
     * @return La chaîne représentant la réservation.
     */
    public String toString() {
        return chTitre + "," + chDate.toString() + "," + chPlageHoraire.toString();
    }

    /**
     * Compare cette réservation avec une autre réservation en fonction de la date et de la plage horaire.
     *
     * @param parReservation La réservation à comparer avec celle-ci.
     * @return Un entier indiquant si cette réservation est avant, après ou à la même date/heure que l'autre réservation.
     *         Retourne un nombre négatif si cette réservation est avant, un nombre positif si elle est après,
     *         ou 0 si elles sont identiques.
     */
    public int compareTo(Reservation parReservation) {
        if (this.chDate.compareTo(parReservation.chDate) == 0)
            return this.chPlageHoraire.compareTo(parReservation.chPlageHoraire);
        return this.chDate.compareTo(parReservation.chDate);
    }

    /**
     * Vérifie si la réservation est valide en vérifiant la validité de la date.
     *
     * @return true si la réservation est valide, sinon false.
     */
    public boolean estValide() {
        return chDate.estValide();
    }
}
