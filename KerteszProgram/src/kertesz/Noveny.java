package kertesz;

public class Noveny {

    private String nev;

    public Noveny(String nev) {
        this.nev = nev;
    }
    
    public String getNev() {
        return nev;
        
    }

    @Override
    public String toString() {
        return "Noveny{" + "nev=" + nev + '}';
    }
    
}
