package DecoratorDesignPattern;

public class DecoratorPatternTest {

    public static void main(String[] args) {

//        Dress b = new BasicDress();
//        b.assemble();
//        System.out.println();

        Dress dd = new DressDecorator(new BasicDress());
        dd.assemble();
        System.out.println();

        Dress cd = new CasualDress(new BasicDress());
        cd.assemble();
        System.out.println();

        Dress fd = new FancyDress(new BasicDress());
        fd.assemble();
        System.out.println();

        Dress cfd = new CasualDress(new FancyDress(new BasicDress()));
        cfd.assemble();

    }
}
