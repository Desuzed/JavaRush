package Patterns.Decorator;

public class QuotesDecorator implements PrintInterface {
    PrintInterface component;

    public QuotesDecorator(PrintInterface printInterface) {
        this.component = printInterface;
    }

    @Override
    public void print() {
        System.out.print("\"");
        component.print();
        System.out.print("\"");
    }
}
