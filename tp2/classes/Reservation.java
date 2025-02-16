package classes;

public class Reservation {
    public Date chDate;
    public PlageHoraire chPlageHoraire;
    public String chTitre;

    public Reservation(Date parDate, PlageHoraire parPlageHoraire, String parTitre) {
        chDate = parDate;
        chPlageHoraire = parPlageHoraire;
        chTitre = parTitre;
    }

    public String toString() {
        return chTitre + "," + chDate.toString() + "," + chPlageHoraire.toString();
    }

    public int compareTo(Reservation parReservation) {
        if (this.chDate.compareTo(parReservation.chDate) == 0)
            return this.chPlageHoraire.compareTo(parReservation.chPlageHoraire);
        return this.chDate.compareTo(parReservation.chDate);
    }
    
    public boolean estValide() {
        return chDate.estValide();
    }
}
