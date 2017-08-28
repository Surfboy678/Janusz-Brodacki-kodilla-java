package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    String text1 = "To be, or not to be";
    public void poemBeautifier( String text, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(text);
        System.out.println(result);
    }
}
