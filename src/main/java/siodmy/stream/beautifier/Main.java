package siodmy.stream.beautifier;

public class Main {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Ja pobrusze, a ty poczywaj", a-> a.toUpperCase());
        poemBeautifier.beautify("Veni vidi vici", a -> a + "ABC");
        poemBeautifier.beautify("Ala ma kota", a-> a + "*");


    }
}
