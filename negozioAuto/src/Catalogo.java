import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    static List<autoBase> Catalogo;
    //Creazione del catalogo (lista)
    static void Creacatalogo(){
        Catalogo= new ArrayList<>();
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
       
        Autousata usato =new Autousata();
        usato.setMarca("Autobianchi");
        usato.setModello("Y10");
        usato.setAlimentazione("Benzina super");
        usato.setColore("nero");
        usato.setCavalli(45);
        usato.setAnnoDiImmatricolazione(Year.of(1993));
        usato.setChilometri(100000);
        Catalogo.add(usato);



        }
        
    static void StampaCatalogo(){
        for (autoBase a : Catalogo) {
            if(a instanceof Autousata)
                System.out.println(a.getMarca() +" "+ a.getModello() +" "+a.getAlimentazione()+" "+a.getColore()+" "+a.getCavalli()+" "+((Autousata) a).getAnnoDiImmatricolazione()+" "+((Autousata) a).getChilometri());
            else
            System.out.println(a.getMarca() +" "+ a.getModello() +" "+a.getAlimentazione()+" "+a.getColore()+" "+a.getCavalli());
        }
    }
    
        
}
