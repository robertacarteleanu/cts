package pregatireTest.prototype.Restaurant;

public class ContClient implements Client{
    private int nrRezervare;
    private String nume;

    public int getNrRezervare() {
        return nrRezervare;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void setRezevare(int nrRezervare) {
        this.nrRezervare=nrRezervare;

    }
    @Override
    public void setNume(String nume) {
        this.nume=nume;
    }

    @Override
    public void generareCont() {
        System.out.println("ContClient{" +
                "nrRezervare=" + nrRezervare +
                ", nume='" + nume + '\'' +
                '}');
    }

    @Override
    public Client clone() {
        ContClient client=new ContClient();
        client.setRezevare(this.getNrRezervare());
        client.setNume(this.getNume());
        return client;
    }
}
