import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    //Creazione del catalogo (lista)
    static void Creacatalogo(){
        List<autoBase> Catalogo = new ArrayList<>();
        autoBase Lanciay =new autoBase();
        Lanciay.setMarca("Lancia");
        Lanciay.setModello("Y");
        Lanciay.setAlimentazione("Benzina");
        Lanciay.setColore("Giallo");
        Lanciay.setCavalli(70);
        Catalogo.add(Lanciay);

        autoBase Yaris =new autoBase();
        Yaris.setMarca("Toyota");
        Yaris.setModello("Yaris");
        Yaris.setAlimentazione("Full Hybrid");
        Yaris.setColore("Grigio");
        Yaris.setCavalli(80);
        Catalogo.add(Yaris);
        
        Yaris =new autoBase();
        Yaris.setMarca("Fiat");
        Yaris.setModello("Punto");
        Yaris.setAlimentazione("Diesel");
        Yaris.setColore("Grigio");
        Yaris.setCavalli(80);
        Catalogo.add(Yaris);
        for (autoBase a : Catalogo) {
            System.out.println(a.getMarca() +" "+ a.getModello() +" "+a.getAlimentazione()+" "+a.getColore()+" "+a.getCavalli());
        }
       
        }
        
    
        
}
