package pregatireTest.builder.Farmacie;

public class Main {
    public static void main(String[] args) {
        Factura factura= Factura.builder().setCotaTVA(true).build();
        System.out.println(factura);
    }
}
