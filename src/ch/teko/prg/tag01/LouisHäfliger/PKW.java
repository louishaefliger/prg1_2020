package ch.teko.prg.tag01.LouisHäfliger;

public class PKW {
    private String Marke;
    private String Modell;
    private int PS;

    public PKW(String marke, String modell, int ps) {
        Marke=marke;
        Modell=modell;
        PS=ps;

    }

    public String GetMarke () {
        return Marke;
    }

    public void SetMarke (String marke) {
        Marke=marke;
    }

    public String GetModell () {
        return Modell;
    }

    public void SetModell (String modell) {
        Modell=modell;
    }

    public int GetPS () {
        return PS;
    }

    public void setPS(int ps){
        PS=ps;
    }

}
