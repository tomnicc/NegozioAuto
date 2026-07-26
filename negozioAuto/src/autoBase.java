public class autoBase {
    String marca, modello,colore,alimentazione;
    int cavalli;

    //metodi setter
    public void setNome(String marca){
        this.marca=marca;
    }
    public void setModello(String modello){
        this.modello=modello;
    }
    public void setColore(String colore){
        this.colore=colore;
    }
    public void setAlimentazione( String alimentazione){
        this.alimentazione=alimentazione;
    } 
    public void setCavalli(int cavalli){
        this.cavalli=cavalli;
    }
    //metodi getter
    public String getMarca(){
        return marca;
    }
}
