package pregatireTest.prototype.Sportiv;

import java.util.HashMap;
import java.util.Map;

public class ContGenerator {
    private Map<String ,IContPrototype> conturi=new HashMap<>();
    public ContGenerator(){
        ContClient client=new ContClient();
        client.setNume("Ana");
        client.setEmail("email1");
        conturi.put("Ana",client);
        ContClient client2=new ContClient();
        client2.setNume("Geo");
        client2.setEmail("email2");
        conturi.put("Geo",client2);
    }
    public IContPrototype contGenerator(String nume,String email){
        if(conturi.get(nume)!=null){
            IContPrototype client=conturi.get(nume).clone();
            client.setEmail(email);
            client.setNume(nume);
            return client;
        }
        return null;
    }
}
