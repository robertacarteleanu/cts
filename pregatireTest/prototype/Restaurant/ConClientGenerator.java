package pregatireTest.prototype.Restaurant;

import java.util.HashMap;
import java.util.Map;

public class ConClientGenerator {
    Map<String,Client> clients=new HashMap<>();
    public ConClientGenerator(){
        clients.put("Felix Daniel",new ContClient());
    }
    public Client generareContClient(String nume, int nrRezervare){
        if(clients.get(nume)!=null){
            Client client=clients.get(nume).clone();
            client.setRezevare(nrRezervare);
            client.setNume(nume);
            return client;
        }
        else{
            Client client=new ContClient();
            client.setNume(nume);
            client.setRezevare(nrRezervare);
            clients.put(nume,client);
            return client;
        }



    }
}
