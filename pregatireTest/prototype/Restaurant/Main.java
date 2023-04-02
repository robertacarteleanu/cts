package pregatireTest.prototype.Restaurant;

public class Main {
    public static void main(String[] args) {
        ConClientGenerator generator=new ConClientGenerator();
        Client client=generator.generareContClient("Ana Maria",20);
        client.generareCont();
    }
}
