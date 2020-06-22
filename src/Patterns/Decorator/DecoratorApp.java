package Patterns.Decorator;

public class DecoratorApp {
    public static void main(String[] args) {
        PrintInterface printInterface = new QuotesDecorator(new LeftBracketDecorator(new Printer("Привет")));
        printInterface.print();
    }
}
