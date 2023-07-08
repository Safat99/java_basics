package Exam;

import java.util.ArrayList;
import java.util.Arrays;

public class SolutionOfFirstQuestion {

    public interface Shape {
        void draw();
    }

    public class Rectangle implements Shape {
        @Override
        public void draw() {
            System.out.println("Overriding the Parent Method for Rectangle Class");
        }

        public int findOtherSideOfRectangle(int area, int side) {
            try {
                return area / side;
            }
            catch (Exception e) {
                System.out.println(e);
            }
            return -1;
        }
    }

    public class Square implements Shape {
        @Override
        public void draw() {
            System.out.println("Overriding the Parent Method for Square Class");
        }

        public int area(int side) {
            int area = side * side;
            System.out.println("Area of the Square is: " + area);
            return area;
        }

        public static void printListUsingLambda() {
            int[] areaList = new int[] {10,20,30};
            int length = areaList.length;
            for (int i:areaList) {
                System.out.println(i);
            }
            // print all using lambda
            ArrayList<Integer> areaLists = new ArrayList<Integer>(Arrays.asList(10,20,30));
            areaLists.forEach(e -> System.out.println(e));
        }
    }

    public class Circle implements Shape {
        @Override
        public void draw() {
            System.out.println("Overriding the Parent Method for Circle class");
        }
    }

//    public static void main(String[] args) {
//
////         ans no 4
//        Square square = new Square();
//        Square.printListUsingLambda();
//
//        // ans no 5
//        Rectangle rectangle = new Rectangle();
//        rectangle.findOtherSideOfRectangle(100/10);
//    }

}
