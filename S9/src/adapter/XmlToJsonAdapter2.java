package adapter;

public class XmlToJsonAdapter2 extends XmlParser implements JsonParser {
    public XmlToJsonAdapter2(String xml) {
        super(xml);
    }
    @Override
    public void parseJson(String json) {
        String xml=convertJsonToXml(json);
        super.parseXml(xml);

    }
    private String convertJsonToXml(String json){
        return json;
    }
}
