package classes;

/**
 * La classe Planning gère un tableau de réservations et permet de gérer des opérations sur ces réservations.
 */
public class Planning {
    private Reservation[] chTabReservations;
    private final int TAILLE;

    /**
     * Constructeur qui initialise le planning avec une taille donnée.
     *
     * @param parTaille La taille du tableau de réservations.
     */
    public Planning(int parTaille) {
        TAILLE = parTaille;
        chTabReservations = new Reservation[TAILLE];
    }

    /**
     * Retourne la taille du planning.
     *
     * @return La taille du planning.
     */
    public int getTaille(){
        return TAILLE;
    }

    /**
     * Remplit le planning avec des réservations de test.
     *
     * @param planning Le planning à remplir avec des réservations.
     * @throws ExceptionPlanning Si une erreur de planning survient.
     */
    private void fillPlanning(Planning planning) throws ExceptionPlanning {
        for (int i = 0; i < planning.getTaille(); i++) {
            planning.ajout(new Reservation(new Date(i + 1, 2, 2025), new PlageHoraire(new Horaire(9, 0), new Horaire(10, 0)), "Test" + i));
        }
    }

    /**
     * Ajoute une réservation dans le planning.
     *
     * @param reservation La réservation à ajouter.
     * @throws ExceptionPlanning Si une erreur de planning survient.
     */
    public void ajout(Reservation reservation) throws ExceptionPlanning {
        if (chTabReservations[TAILLE - 1] != null) {
            System.out.println("tableau plein");
            throw new ExceptionPlanning(1);
        }
        if (!reservation.estValide()) {
            System.out.println("reservation non valide");
            throw new ExceptionPlanning(0);
        }
        for (int i = 0; i < chTabReservations.length; i++) {
            if (chTabReservations[i] == null) {
                chTabReservations[i] = reservation;
                break;
            }
            if (chTabReservations[i].compareTo(reservation) == 0) {
                System.out.println("reservations non compatibles");
                throw new ExceptionPlanning(2);
            }
        }
    }

    /**
     * Affiche les réservations présentes dans le planning.
     *
     * @return Une chaîne vide.
     */
    public String toString(){
        for(int i = 0; i < chTabReservations.length; i++){
            if (chTabReservations[i] != null ){
                System.out.println(chTabReservations[i].toString());
            }
            else{
                System.out.println(" ---- pas de réservation -----");
            }
        }
        return "";
    }

    /**
     * Recherche une réservation par date dans le planning.
     *
     * @param date La date de la réservation à rechercher.
     * @return La réservation trouvée, ou null si aucune réservation n'est trouvée pour la date.
     */
    public Reservation getReservation(Date date){
        for (int i = 0; i < chTabReservations.length; i++){
            if (chTabReservations[i] != null && chTabReservations[i].chDate.compareTo(date) == 0){ // Utilisation de compareTo
                System.out.println("trouvé");
                return chTabReservations[i];
            }
        }
        return null;
    }
}
