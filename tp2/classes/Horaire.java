/**
 * Classe Horaire représentant une heure et un quart d'heure dans une journée.
 */
package classes;

/**
 * Horaire est une classe pour manipuler des horaires précis avec heures et quarts d'heure.
 */
public class Horaire {
    /**
     * Heure de l'horaire.
     */
    private int chHeure;

    /**
     * Quart d'heure de l'horaire.
     */
    private int chQuartHeure;

    /**
     * Constructeur de la classe Horaire.
     * @param parHeure Heure spécifiée.
     * @param parQuartHeure Quart d'heure spécifié.
     */
    public Horaire(int parHeure, int parQuartHeure){
        chHeure = parHeure;
        chQuartHeure = parQuartHeure;
    }

    /**
     * Convertit l'horaire en minutes totales depuis minuit.
     * @return Nombre total de minutes.
     */
    public int toMinutes(){
        return chHeure * 60 + chQuartHeure;
    }

    /**
     * Retourne l'heure de l'horaire.
     * @return Heure.
     */
    public int getHeure(){
        return chHeure;
    }

    /**
     * Retourne le quart d'heure de l'horaire.
     * @return Quart d'heure.
     */
    public int getQuartHeure(){
        return chQuartHeure;
    }

    /**
     * Modifie l'heure de l'horaire.
     * @param parHeure Nouvelle heure.
     */
    public void setHeure(int parHeure){
        chHeure = parHeure;
    }

    /**
     * Modifie le quart d'heure de l'horaire.
     * @param parQuartHeure Nouveau quart d'heure.
     */
    public void setQuartHeure (int parQuartHeure){
        chQuartHeure = parQuartHeure;
    }

    /**
     * Retourne une représentation sous forme de chaîne de l'horaire.
     * @return Chaîne représentant l'horaire.
     */
    public String toString(){
        return chHeure + "h" + chQuartHeure;
    }
}
