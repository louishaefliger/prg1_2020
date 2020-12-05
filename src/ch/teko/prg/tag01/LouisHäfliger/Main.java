package ch.teko.prg.tag01.LouisHäfliger;

public class Main {
    public static void main(String[] args) {

        PKW auto=new PKW("Subaru", "Legacy", 160);

        System.out.println("Louis alt");
        System.out.println(auto.GetMarke());
        System.out.println(auto.GetModell());
        System.out.println(auto.GetPS());

        auto.SetMarke("Ford");
        auto.SetModell("Kuga");
        auto.setPS(160);

        System.out.println("Louis neu");
        System.out.println(auto.GetMarke());
        System.out.println(auto.GetModell());
        System.out.println(auto.GetPS());


        PKW auto2=new PKW("Opel", "Corsa OPS", 210);

        System.out.println("Marco");
        System.out.println(auto2.GetMarke());
        System.out.println(auto2.GetModell());
        System.out.println(auto2.GetPS());

        PKW auto3=new PKW("Velo", "Keines", 300);

        System.out.println("Graf");
        System.out.println(auto3.GetMarke());
        System.out.println(auto3.GetModell());
        System.out.println(auto3.GetPS());
    }
}

