package com.kodilla.stream.beautifier;

public class StreamMain {
    public static void main(String args[]){
        PoemBeautifier beautifier = new PoemBeautifier();



        beautifier.poemBeautifier("To be, or not to be", (text -> "XYZ" + text + "XYZ"));
        beautifier.poemBeautifier("To be, or not to be", (text -> "***" + text + "***"));
        beautifier.poemBeautifier("To be, or not to be", (text -> "<3<3<3" + text + "<3<3<3"));
        beautifier.poemBeautifier("To be, or not to be", (text -> text.toUpperCase()));
        beautifier.poemBeautifier("To be, or not to be", (text -> text.toLowerCase()));
    }
}
