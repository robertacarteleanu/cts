package pregatireTest.builder.Restaurant;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare= Rezervare.builder().build();
        System.out.println(rezervare);
    }
}
