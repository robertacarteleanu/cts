package adapter;

public class XmlToJsonAdapter implements JsonParser {
    XmlParser xmlParser;

    public XmlToJsonAdapter(XmlParser xmlParser) {
        this.xmlParser = xmlParser;
    }

    @Override
    public void parseJson(String json) {
        String xml=convertJsonToXml(json);
        xmlParser.parseXml(xml);

    }
    private String convertJsonToXml(String json){
        return json;
    }
}
