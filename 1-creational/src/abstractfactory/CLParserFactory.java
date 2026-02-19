package abstractfactory;

public class CLParserFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParser(String parserType) {
        return switch (parserType) {
             case "FEEDBACK" -> new CLFeedbackXMLParser();
             case "ORDER" -> new CLOrderXMLParser();
             case "ERROR" -> new CLErrorXMLParser();
            default -> throw new IllegalStateException("Unexpected value: " + parserType);
        };
    }
}
