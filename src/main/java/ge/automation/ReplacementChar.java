package ge.automation;

public class ReplacementChar implements ReplaceSymbolA_interface, ReplaceSymbolB_interface {
    public void replaceA(String word) {
        System.out.println(word.replaceAll("(?i)a", "z"));
    }

    public void replaceB(String word) {
        System.out.println(word.replaceAll("(?i)b", "w"));
    }

}