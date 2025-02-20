package classes;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * La classe PlanningCollections gère un planning utilisant à la fois une ArrayList et un TreeSet pour stocker des réservations.
 * Elle permet d'afficher des informations sur les collections de réservations.
 */
public class PlanningCollections {

    // Les collections de réservations
    private ArrayList<Reservation> chStockResArrayList;
    private TreeSet<Reservation> chStockResTreeSet;

    /**
     * Constructeur pour initialiser les collections de réservations avec une ArrayList et un TreeSet.
     *
     * @param parArrayList La liste de réservations sous forme d'ArrayList.
     * @param parTreeset La liste de réservations sous forme de TreeSet.
     */
    public PlanningCollections(ArrayList<Reservation> parArrayList, TreeSet<Reservation> parTreeset) {
        this.chStockResArrayList = parArrayList;
        this.chStockResTreeSet = parTreeset;
    }

    /**
     * Retourne une chaîne représentant les informations des collections de réservations, incluant la taille de chaque collection
     * et leurs contenus sous forme de chaîne.
     *
     * @return Une chaîne décrivant la taille et les contenus de l'ArrayList et du TreeSet.
     */
    public String toString() {
        return "taille array list:  " + chStockResArrayList.size() + " " + chStockResArrayList.toString() + "," +
                "taille treeset:" + chStockResTreeSet.size() + " " + chStockResTreeSet.toString();
    }
}
