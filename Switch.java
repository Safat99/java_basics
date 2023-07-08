public class Switch {
    public static void main(String[] args) {
        int a = 3000;
        
        switch(a) {
            case 10:
                System.out.println("success10");
                System.out.println("success success");
                break;

                case 20:
                System.out.println("success20");
                System.out.println("success success");
                break;

                case 30:
                System.out.println("success30");
                System.out.println("success success");
                break;

            default:
                System.out.println("default");
        }
    }
}