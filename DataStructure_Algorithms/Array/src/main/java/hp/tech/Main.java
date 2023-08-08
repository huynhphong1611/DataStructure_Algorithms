package hp.tech;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    interface  I {
        void m();
    }
    static class CI {
        public void m() {
            System.out.println("m");
        }
    }
    static class Impl extends CI implements I {
        public static void main(String[] args) {
            (new Impl()).m();
        }
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int length = scanner.nextInt();
//        int breadth = scanner.nextInt();
//
//        scanner.close();
//        Shape shape = new Rectangle(length, breadth);
//        System.out.println(shape.getLength() + " " + shape.getBreadth());
//        System.out.println(shape.area());
        try{
            Float f1 = new Float("3.0");
            int x = f1.intValue();
            byte b = f1.byteValue();
            double d = f1.doubleValue();
            System.out.println(x + b +d);

        } catch (NumberFormatException e) {
            System.out.println("bad");
        }

    }



     static class Rectangle extends Shape {

         public Rectangle(int length, int breadth) {
             super(length, breadth);
         }

         @Override
         public int area() {
             return this.getBreadth() * this.getLength();
         }
     }
    static abstract class Shape {
        private int length;
        private int breadth;

        public Shape(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        public int getLength() {
            return length;
        }

        public int getBreadth() {
            return breadth;
        }

        abstract int area();
    }
}