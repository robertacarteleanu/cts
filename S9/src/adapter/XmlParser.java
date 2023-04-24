package adapter;

public class XmlParser {
    String xml;
    public XmlParser(String xml){
        this.xml=xml;
    }
    public void parseXml(String xml){
        System.out.println(xml);
    }
}
