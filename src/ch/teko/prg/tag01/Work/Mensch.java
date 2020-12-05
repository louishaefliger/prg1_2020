package ch.teko.prg.tag01.Work;

public class Mensch {

    //Attribute
    public String name;
    public String vorname;
    public int alter;
    public int lohn;

    public Mensch(String name, String vorname, int alter, int lohn) {
        this.name = name;
        this.vorname = vorname;
        this.alter = alter;
        this.lohn = lohn;
    }

    //Methode
    public String getName() {
        return name;
    }

    public void setLohn(int lohnParameter){
        this.lohn=lohnParameter;
    }

    public static void main(String[] args) {

        Mensch Louis= new Mensch("Häfliger", "Louis", "25");

        System.out.println ("Louis");
        System.out.println (Mensch.getName());
    }
}

