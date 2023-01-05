package exercise1.exercise1_7;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double real1 = in.nextDouble();
        double imag1 = in.nextDouble();

        System.out.print("Enter the complex number 2 (real and imaginary part): ");
        double real2 = in.nextDouble();
        double imag2 = in.nextDouble();

        MyComplex myComplex1 = new MyComplex(real1, imag1);
        MyComplex myComplex2 = new MyComplex(real2, imag2);

        System.out.print("Number 1 is: ");
        System.out.println(myComplex1);
        if (!myComplex1.isReal()) {
            System.out.println(myComplex1 + " is NOT a pure real number.");
        }
        if (!myComplex1.isImaginary()) {
            System.out.println(myComplex1 + " is NOT a pure imaginary number.\n");
        }

        System.out.print("Number 2 is: ");
        System.out.println(myComplex2);
        if (!myComplex2.isReal()) {
            System.out.println(myComplex2 + " is NOT a pure real number.");
        }
        if (!myComplex2.isImaginary()) {
            System.out.println(myComplex2 + " is NOT a pure imaginary number.\n");
        }

        if (!myComplex1.equals(myComplex2)) {
            System.out.println(myComplex1 + " is NOT equal to " + myComplex2 + "\n");
        } else {
            System.out.println(myComplex1 + " is equal to " + myComplex2 + "\n");
        }

        System.out.println(myComplex1 + " + " + myComplex2 + " = " + myComplex1.addNew(myComplex2));
        System.out.println(myComplex1 + " - " + myComplex2 + " = " + myComplex1.subtractNew(myComplex2));
        System.out.println(myComplex1 + " * " + myComplex2 + " = " + myComplex1.multiplyNew(myComplex2));
        System.out.println(myComplex1 + " / " + myComplex2 + " = " + myComplex1.divideNew(myComplex2));

        System.out.println("The conjugate complex: " + myComplex1.conjugate());
    }
}
