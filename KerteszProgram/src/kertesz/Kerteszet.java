package kertesz;

import java.util.ArrayList;

public class Kerteszet {

    private ArrayList<Noveny> raktar;
    private boolean mukodik;
    private ArrayList<Noveny> eladott;
    private int meret;

    public Kerteszet(int meret) {
        this.meret=meret;
        raktar = new ArrayList<>();
        eladott = new ArrayList<>();
        raktar.add(new Noveny("Bokor"));
        raktar.add(new Noveny("Virag"));
        raktar.add(new Fa("Alma",10));
        raktar.add(new Fa("Korte",10));
        mukodik = true;
    }
    
    public ArrayList<Noveny> getRaktar(){
        return this.raktar;
    }
    public ArrayList<Noveny> getEladott(){
        return this.eladott;
    }
    
    public void elad(String novenyNev) {
            if(mukodik==true){
            int i = 0;
            int N = raktar.size();
                for (int j = 0; j < raktar.size(); j++) {
                    if(raktar.get(j).getNev().equals(novenyNev)){
                        eladott.add(raktar.get(j));
                        raktar.remove(j);
                    }
                }
            }else{
            System.out.println("Nem mukodik");
    }
    }
//    public void elad(String novenyNev,int kor) {
//        if(novenyNev.getClass().equals(Fa.class)){
//            if(mukodik==true){
//            int i = 0;
//            int N = raktar.size();
//                for (int j = 0; j < raktar.size(); j++) {
//                    if(raktar.get(j).getNev().equals(novenyNev) && raktar.get(j).){
//                        eladott.add(raktar.get(j));
//                        raktar.remove(j);
//                    }
//                }
//            }else{
//            System.out.println("Nem mukodik");
//        }
//        
//    }
//    }
    public void leEg(){
        mukodik=false;
        raktar=new ArrayList<>();//lenullázuk a listát
        
    }
    public void raktarhozAd(Noveny nev) {
        if(raktar.size()<meret){
            raktar.add(nev);
        }
    }
    public void raktarhozAd(Noveny nev,int dbHozzaAd) {//nincs ellenorzott parameter megadas
        for (int i = 0; i < dbHozzaAd; i++) {
            if(raktar.size()<meret){
            raktar.add(nev);
        }
        }
    }
//    @Override
//    public String toString() {
//        return "Kerteszet{" + "raktar=" + raktar + ", mukodik=" + mukodik + '}';
//    }
    
}
