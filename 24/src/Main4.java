public class Main4 {
    public static void main(String[] args) {
        String[] lines = {"abc, Aa A", "b. bb", "h, a- HA"};
        TextProcessor textProcessor = new TextProcessor(lines);

        TextProcessingRule rule = s -> s.compareTo(s,"qwe");
        textProcessor.process(rule);
        textProcessor.show();
    }
}