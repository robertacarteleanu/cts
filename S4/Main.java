public class Main {
    public static void main(String[] args) {


        /*
        O fabrica de masinni care implementeaza un sistem centralizat de monitorizare a productiei.
        Sistemul trebuie sa asigure adaugarea si modificarea datelor despre masinile fabricate la nivelul sediului central,
        intr-un  mediu securizat (sistemul va exista sub forma unui server dispus in datacenter-ul din HQ).
        Programatorii trebuie sa se asigure ca sistemul nu va putea fi replicat si ca toate datele vor fi
        manageriate prin intermediul singurului server mentionat anterior.
         */

        Server server=Server.getInstance(8080,"server1");
        Server server2=Server.getInstance(8081,"server2");

//        Server server2=new Server(8081,"Server2");

        System.out.println(server.getName());
        System.out.println(server.showStatus());

        System.out.println(server2.getName());
        System.out.println(server2.showStatus());


        SistemServer sistemServer= SistemServer.getInstance(1,"sistem server 1");
        sistemServer.addMasina(new Masina(1,"masina1"));
        sistemServer.addMasina(new Masina(2,"masina2"));
        sistemServer.addMasina(new Masina(2,"masina3"));
        System.out.println(sistemServer.getMasina(2));
        System.out.println(sistemServer.getMasina(3));
        SistemServer sistemServer2= SistemServer.getInstance(2,"sistem server 2");
        sistemServer2.addMasina(new Masina(3,"masina3"));

        System.out.println(sistemServer2.getMasina(2));
        System.out.println(sistemServer.getMasina(3));


    }
}