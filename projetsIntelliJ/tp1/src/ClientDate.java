public class ClientDate {
    public static void main (String [ ] args){
        Date dateTest= new Date(2005);
        //Date dateTest=new Date();
        System.out.println(dateTest.toString());
        Date tryD= new Date(31 ,4,2022);
        System.out.println(tryD.estValide());

        Date date = new Date(2, 4, 2023);

        System.out.println("Lendemain : " + date.dateDuLendemain().toString());

        Date hier = new Date(1,1,2022);
        System.out.println("hier:"+ hier.dateDeLaVeille().toString());


    }
}
