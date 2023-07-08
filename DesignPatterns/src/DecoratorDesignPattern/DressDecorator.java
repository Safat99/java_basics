package DecoratorDesignPattern;

public class DressDecorator implements Dress {

    protected Dress dress;

    public DressDecorator(Dress dress) {
        this.dress = dress;
    }

    @Override
    public void assemble() {
        dress.assemble();
//        System.out.println("decorator class implemented the main interface...");
    }
}
