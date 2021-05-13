package siodmy.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String orginalText, PoemDecorator poemDecorator){
        String effect = poemDecorator.decorate(orginalText);
        System.out.println("Text after decoration: " + effect);
    }

}
