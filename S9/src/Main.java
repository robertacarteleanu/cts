import adapter.JsonParser;
import adapter.XmlToJsonAdapter2;
import facade.ex1.ShapeMaker;
import facade.ex2.DealerAuto;

public class Main {
    public static void main(String[] args) {

//        adapter.XmlParser xmlParser=new adapter.XmlParser();
//        adapter.JsonParser jsonParser=new adapter.XmlToJsonAdapter(xmlParser);
//        jsonParser.parseJson("json xml parse");
        JsonParser jsonParser=new XmlToJsonAdapter2("json xml parse");
        jsonParser.parseJson("json xml parse adapter 2");
        ShapeMaker shapeMaker=new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawCircle();
        DealerAuto dealerAuto=new DealerAuto();
        System.out.println(dealerAuto.descrieMasinaFamilie());
    }
}