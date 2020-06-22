package Patterns.Decorator;

public class LeftBracketDecorator implements PrintInterface {
    PrintInterface component;

    public LeftBracketDecorator(PrintInterface component) {
        this.component = component;
    }

    @Override
    public void print() {
        System.out.print("[");
        component.print();
    }
}
