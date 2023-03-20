public class Server {
    private int portNo;
    private String name;
    private static  Server instance;

    private Server(int portNo, String name) {
        this.portNo = portNo;
        this.name = name;
    }


    public int getPortNo() {
        return portNo;
    }

    public void setPortNo(int portNo) {
        this.portNo = portNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String showStatus(){
        return "Serverul "+name+" ruleaza pe portul "+portNo;
    }
    public static synchronized Server getInstance(int portNo,String name) {
        /*
        verficare daca exista instanta -> a fost accesata anterior
        daca este prima accesare -> initializare cu constructorul privat
        daca nu returnare instanta
         */
        if(instance==null){
            instance=new Server(portNo,name);
        }
        return instance;
    }

}
