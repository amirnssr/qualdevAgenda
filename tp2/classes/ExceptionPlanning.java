/**
 * Classe ExceptionPlanning représentant une exception spécifique pour le planning.
 */
package classes;

/**
 * ExceptionPlanning est une classe d'exception personnalisée qui contient un code d'erreur.
 */
public class ExceptionPlanning extends Exception {
    /**
     * Code d'erreur associé à l'exception.
     */
    public int chCodeErreur;

    /**
     * Constructeur de l'exception avec un code d'erreur.
     * @param parCodeErreur Code d'erreur de l'exception.
     */
    public ExceptionPlanning(int parCodeErreur) {
        super();
        this.chCodeErreur = parCodeErreur;
    }

    /**
     * Retourne le code d'erreur de l'exception.
     * @return Code d'erreur.
     */
    public int getCodeErreur() {
        return chCodeErreur;
    }
}
