import java.time.Year;

public class Autousata extends autoBase {
   private int chilometri;
   private Year annoDiImmatricolazione;

    public Year getAnnoDiImmatricolazione() {
        return annoDiImmatricolazione;
    }

    public void setAnnoDiImmatricolazione(Year annoDiImmatricolazione) {
        this.annoDiImmatricolazione = annoDiImmatricolazione;
    }

   public int getChilometri(){
    return chilometri;
    }
    public void setChilometri(int chilometri){
        this.chilometri = chilometri;
    }

}
