public class ExceptionPlanning extends Exception {
    public int chCodeErreur;
    
    public ExceptionPlanning(int parCodeErreur){
        super();
        this.chCodeErreur=parCodeErreur;
    }

    public int getCodeErreur(){
        return  chCodeErreur;
    }
}
