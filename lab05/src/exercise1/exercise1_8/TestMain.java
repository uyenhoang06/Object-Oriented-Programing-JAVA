package exercise1.exercise1_8;

public class TestMain {
    public static void main(String[] args) {
        MyPolynomial polynomial1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial polynomial2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
        double[] coeffs = {7, 11, 0, 1, 2};
        MyPolynomial polynomial3 = new MyPolynomial(coeffs);

        System.out.println(polynomial1);
        System.out.println(polynomial2);
        System.out.println(polynomial3);

        System.out.println();
        System.out.println("evaluate polynomial1 where x = 1 : " + polynomial1.evaluate(1));
        System.out.println("evaluate polynomial2 where x = 7 : " + polynomial2.evaluate(7));
        System.out.println("evaluate polynomial3 where x = 2 : " + polynomial3.evaluate(2));

        System.out.println();
        System.out.println("the degree of " + polynomial1 + " is " + polynomial1.getDegree());
        System.out.println("the degree of " + polynomial2 + " is " + polynomial2.getDegree());
        System.out.println("the degree of " + polynomial3 + " is " + polynomial3.getDegree());

        System.out.println();
        System.out.println("polynomial1 + polynomial2 = " + polynomial1.add(polynomial2));
        System.out.println("polynomial1 * polynomial2 = " + polynomial1.multiply(polynomial2));
    }
}
