class Calculator {
    public int add(int a, int b) {
        return a+b;        
    }
}

public class ParameterizedClass {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int output1;
        Calculator calcobj = new Calculator();
        output1 = calcobj.add(num1, num2);
        System.out.println(output1);
    }
}

