package classes;

/**
 * La classe Date représente une date avec un jour, un mois et une année.
 */
public class Date {
    protected int chJour; ///< Jour de la date
    protected int chMois; ///< Mois de la date
    protected int chAnnee; ///< Année de la date

    /**
     * Constructeur de la classe Date.
     * @param parJ Le jour
     * @param parM Le mois
     * @param parA L'année
     */
    public Date(int parJ, int parM, int parA) {
        chJour = parJ;
        chMois = parM;
        chAnnee = parA;
    }

    /**
     * Constructeur initialisant la date au 1er janvier de l'année spécifiée.
     * @param ann L'année
     */
    public Date(int ann){
        chAnnee=ann;
        chMois=01;
        chJour=01;
    }

    /**
     * Constructeur par défaut.
     */
    public Date(){ }

    /**
     * Vérifie si la date est valide selon le calendrier grégorien.
     * @return true si la date est valide, sinon false.
     */
    public boolean estValide(){
        if (chAnnee>1582 && chMois>=1 && chMois<=12 && chJour>=1 && chJour<=dernierjourdumois(chMois,chAnnee))
            return true;
        return false;
    }

    /**
     * Retourne le dernier jour du mois pour une année donnée.
     * @param parM Le mois
     * @param parA L'année
     * @return Le dernier jour du mois
     */
    public int dernierjourdumois(int parM,int parA){
        switch(parM){
            case 2: if (estBissextile(parA)) return 29; return 28;
            case 4: case 6: case 9: case 11: return 30;
            default : return 31;
        }
    }

    /**
     * Vérifie si une année est bissextile.
     * @param parA L'année
     * @return true si l'année est bissextile, sinon false.
     */
    public static boolean estBissextile(int parA) {
        return parA%4==0 && (parA%100!=0 || parA%400==0);
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de la date.
     */
    public String toString(){
        return chJour + "/" + chMois + "/" + chAnnee;
    }

    /**
     * Calcule la date du lendemain.
     * @return Une nouvelle instance de Date correspondant au jour suivant.
     */
    public Date dateDuLendemain() { /* ... */ }

    /**
     * Calcule la date de la veille.
     * @return Une nouvelle instance de Date correspondant au jour précédent.
     */
    public Date dateDeLaVeille() { /* ... */ }

    /**
     * Compare la date actuelle avec une autre date.
     * @param date La date à comparer
     * @return -1 si la date actuelle est antérieure, 1 si postérieure, 0 si égale.
     */
    public int compareTo(Date date){ /* ... */ }
}
