package kertesz;

public class Fa extends Noveny{

    private int kor;

    public Fa(String nev,int kor) {
        super(nev);
        this.kor = kor;
    }

    public int getKor() {
        return kor;
    }
    
    @Override
    public String toString() {
        String noveny=super.toString();
        return noveny + "\t"+
            "Fa{" + "kor=" + kor+'}'+ "\n";
    }
    
    

}
