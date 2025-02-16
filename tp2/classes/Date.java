/**
 * Classe representant une date avec jour, mois et annee.
 */
package classes;

public class Date {
    protected int chJour;
    protected int chMois;
    protected int chAnnee;

    /**
     * Constructeur avec jour, mois et annee.
     * @param parJ jour
     * @param parM mois
     * @param parA annee
     */
    public Date(int parJ, int parM, int parA) {
        chJour = parJ;
        chMois = parM;
        chAnnee = parA;
    }

    /**
     * Constructeur avec annee uniquement (par defaut 01/01 de l'annee donnee).
     * @param ann annee
     */
    public Date(int ann){
        chAnnee=ann;
        chMois=01;
        chJour=01;
    }

    /**
     * Constructeur par defaut.
     */
    public Date(){

    }

    /**
     * Verifie si la date est valide.
     * @return true si la date est valide, false sinon.
     */
    public boolean estValide(){
        if (chAnnee>1582)
            if (chMois>=1 && chMois<=12 && chJour>=1 && chJour<=dernierjourdumois(chMois,chAnnee))
                return true;
        return false;

    }

    /**
     * Retourne le dernier jour du mois donne.
     * @param parM mois
     * @param parA annee
     * @return dernier jour du mois
     */
    public int dernierjourdumois(int parM,int parA){
        switch(parM){
            case 2: if (estBissextile(parA))
                return 29;
                return 28;
            case 4: case 6: case 9: case 11: return 30;
            default : return 31;

        }
    }

    /**
     * Verifie si une annee est bissextile.
     * @param parA annee
     * @return true si l'annee est bissextile, false sinon.
     */
    public static boolean estBissextile(int parA) {
        return parA%4==0 && (parA%100!=0 || parA%400==0);
    }

    /**
     * Retourne la date sous forme de chaine de caracteres.
     * @return representation de la date (jour/mois/annee).
     */
    public String toString(){
        return chJour + "/" + chMois + "/" + chAnnee;
    }

    /**
     * Calcule et retourne la date du lendemain.
     * @return date du jour suivant.
     */
    public Date dateDuLendemain() {
        int jourSuivant = chJour;
        int moisSuivant = chMois;
        int anneeSuivante = chAnnee;
        if (!estValide()){
            System.out.println("date pas valable");
        }
        if (estValide()) {
            jourSuivant++;
            if (jourSuivant > dernierjourdumois(chMois, chAnnee)) {
                jourSuivant = 1;
                moisSuivant++;
                if (moisSuivant==12 && jourSuivant==31) {
                    moisSuivant = 1;
                    jourSuivant=1;
                    anneeSuivante++;
                }

            }


        }

        return new Date(jourSuivant, moisSuivant, anneeSuivante);
    }

    /**
     * Calcule et retourne la date de la veille.
     * @return date du jour precedent.
     */
    public Date dateDeLaVeille() {
        int jourHier = chJour;
        int moisHier = chMois;
        int anneeHier = chAnnee;

        if (!estValide()) {
            System.out.println("classes.Date invalide");

        }

        jourHier--;

        if (jourHier < 1) {
            moisHier--;
            if (moisHier < 1) {
                anneeHier--;
                moisHier = 12;
            }
            jourHier = dernierjourdumois(chMois-1,chAnnee);
        }

        return new Date(jourHier, moisHier, anneeHier);
    }

    /**
     * Compare cette date a une autre.
     * @param date la date a comparer
     * @return -1 si cette date est avant, 1 si apres, 0 si identique.
     */
    public int compareTo(Date date){
        if (date.chAnnee>chAnnee){
            return -1;

        }
        if(date.chAnnee<chAnnee){
            return 1;
        }
        if(date.chMois>chMois){
            return -1;

        }
        if(date.chMois<chMois){
            return 1;

        }
        if(date.chJour>chJour){
            return -1;

        }
        if(chJour>date.chJour){
            return 1;
        }
        return 0;
    }



}
