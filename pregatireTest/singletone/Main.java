package pregatireTest.singletone;

public class Main {
    public static void main(String[] args) {
        Magazin magazin= Magazin.getInstance("magazin1");
        Articol articol=new Articol("tricou",5);
        Articol articol2=new Articol("tricou",4);
        Articol articol3=new Articol("pantaloni",2);
        magazin.addArticol(articol);
        magazin.addArticol(articol2);
        System.out.println(magazin);
        Magazin magazin2= Magazin.getInstance("magazin2");
        magazin.addArticol(articol3);
        System.out.println(magazin2);


    }
}
