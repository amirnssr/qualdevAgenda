public class Date {
    protected int chJour;
    protected int chMois;
    protected int chAnnee;

    public Date(int parJ, int parM, int parA) {
        chJour = parJ;
        chMois = parM;
        chAnnee = parA;
    }
    public Date(int ann){
        chAnnee=ann;
        chMois=01;
        chJour=01;
    }

    public Date(){
        
    }


    public boolean estValide(){
        if (chAnnee>1582)
            if (chMois>=1 && chMois<=12 && chJour>=1 && chJour<=dernierjourdumois(chMois,chAnnee))
                    return true;
        return false;

    }

    public int dernierjourdumois(int parM,int parA){
        switch(parM){
            case 2: if (estBissextile(parA))
                        return 29;
                    return 28;
            case 4: case 6: case 9: case 11: return 30;
            default : return 31;

        }
    }

    public static boolean estBissextile(int parA) {
        return parA%4==0 && (parA%100!=0 || parA%400==0);
    }

    public String toString(){
        return chJour + "/" + chMois + "/" + chAnnee;
    }

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

    public Date dateDeLaVeille() {
        int jourHier = chJour;
        int moisHier = chMois;
        int anneeHier = chAnnee;
        
        if (!estValide()) {
            System.out.println("Date invalide");

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

