package BuilderDesignPattern;

public class Shop {

    public static void main(String[] args) {

       // without using builder
//       Phone p = new Phone("Android", 2, "QualComm", 5.5, 3100);
//       System.out.println(p);

       // with using builder pattern
         Phone p = new PhoneBuilder().setBattery(233).setOs("Android").setRam(2).getPhone();
         System.out.println(p);

        /*
         we don't need to pass all the values. it will take default value
         we don't need to follow the sequences
        */
    }
}
