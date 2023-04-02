package pregatireTest.prototype.Sportiv;


public class Main {

    public static void main(String[] args) {
        ContGenerator generator=new ContGenerator();
        IContPrototype contPrototype=generator.contGenerator("Ana","email3");
        System.out.println(contPrototype);
    }
}
