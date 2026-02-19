package abstractfactory;

public class NYParserFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParser(String parserType) {
        return switch (parserType) {
            case "FEEDBACK" -> new NYFeedbackXMLParser();
            case "ORDER" -> new NYOrderXMLParser();
            case "ERROR" -> new NYErrorXMLParser();
            default -> throw new IllegalStateException("Unexpected value: " + parserType);
        };
    }
}
