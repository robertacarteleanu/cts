package pregatireTest.builder.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient=Pacient.builder().setMicDejunInclus(true).setHasHalatInterior(false).setHasPapuciAfara(true).build();
        System.out.println(pacient);
    }

}
