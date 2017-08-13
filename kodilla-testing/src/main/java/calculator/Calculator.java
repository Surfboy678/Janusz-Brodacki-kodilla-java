package calculator;

public class Calculator
{
    public int addAToB(int a, int b) {
        return a + b;
    }

    public int substractAFromB(int a, int b) {
        return a - b;
    }
}

class Application
{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result1 = calculator.addAToB(5,5);

        System.out.println(result1);

        int result2 = calculator.substractAFromB(10, 8);

        System.out.println(result2);

    }
}