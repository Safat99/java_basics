public class ArrayBasic {
    public static void main (String[] args) {
        int[] a = new int[] {10,20,30,40,50};
        
        System.out.println(a.length);
        System.out.println();

        for (int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
        
        System.out.println();
        
        for (int i=a.length -1 ; i>-1; i--) {
            System.out.println(a[i]);
        }

    }
}