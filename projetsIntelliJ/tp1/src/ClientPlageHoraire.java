public class ClientPlageHoraire {
   public static void main (String [] Args){
       Horaire heure_debut = new Horaire(2,30);
       Horaire heure_fin = new Horaire(5,57);

       PlageHoraire plage1 = new PlageHoraire(heure_debut,heure_fin);
       System.out.println((plage1.duree()));

       PlageHoraire plageh = new PlageHoraire(heure_debut,heure_fin);
       System.out.println(plageh.convert());

      
     
   }

}
