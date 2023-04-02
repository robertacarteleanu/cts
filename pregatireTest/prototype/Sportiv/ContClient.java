package pregatireTest.prototype.Sportiv;

public class ContClient implements IContPrototype{
    private String nume;
    private String email;

    @Override
    public void setNume(String nume) {
        this.nume=nume;
    }

    @Override
    public void setEmail(String email) {
        this.email=email;
    }

    @Override
    public String toString() {
        return "ContClient{" +
                "nume='" + nume + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public IContPrototype clone() {
        ContClient client=new ContClient();
        client.setEmail(email);
        client.setNume(nume);
        return client;
    }
}
