package kertesz;
public class KerteszProgram {
    public static void main(String[] args) {
        Kerteszet k1=new Kerteszet(50);
//        k1.raktarhozAd(new Fa("Nev", 10,Fa.Fajta.NYIR ));
        System.out.println("Feltoltes Elott");
        System.out.println(k1.getRaktar());
        System.out.println("Feltoltes Utan");
        k1.raktarhozAd(new Fa("Alma",5));
        System.out.println(k1.getRaktar());
        k1.elad("Virag");
        k1.elad("Alma");
        System.out.println(k1.getRaktar());
        System.out.println(k1.getEladott());
//        k1.leEg();
        System.out.println("Raktar: ");
        System.out.println(k1.getRaktar());
        System.out.println("Eladott: ");
        System.out.println(k1.getEladott());
        k1.elad("Bokor");
        k1.raktarhozAd(new Noveny("Tulipan"));
         k1.raktarhozAd(new Fa("Alma",5));
          k1.raktarhozAd(new Fa("Alma",10));
          k1.raktarhozAd(new Fa("Alma",51));
           k1.raktarhozAd(new Fa("Alma",56));
            k1.raktarhozAd(new Fa("Alma",54));
             k1.raktarhozAd(new Fa("Alma",5));
             
          
          
        System.out.println(k1.getRaktar());
//        k1.elad("Alma",51);
        System.out.println("Eladas utan: ");
        System.out.println(k1.getRaktar());
    }
    
}
