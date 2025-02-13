public class Reservation  implements Comparable<Reservation>{
    public Date chDate;
    private PlageHoraire chPlageHoraire;
    private String chTitre;

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

    public String getIntitule(){
        return chTitre;
    }

    public Date getDate(){
        return chDate;
    }
}
