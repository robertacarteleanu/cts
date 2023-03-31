package S6_activitate;

public class Main {
    public static void main(String[] args) {
        Burger burger=Burger.builder()
                .setCarne("pui")
                .setChifla("seminte")
                .setCondimente("chilly")
                .setLegume("varza")
                .setSos("maioneza")
                .build();
        System.out.println(burger);
    }
}
