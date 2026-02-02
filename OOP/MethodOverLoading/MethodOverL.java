
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    //just adding a roundoff method to get int
    int roundoff1(double n1) {
        return (int) n1;
    }

    int roundoff (double n2){
        if (n2 - roundoff1(n2) <= 0.5)
            return (int) n2;
        else 
            return (int) n2 + 1 ;

    }
}

public class MethodOverL 
{
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int v1 = obj.add(3, 4);
        System.out.println(v1);

        double v2 = obj.add(5, 2.8);
        System.out.println(v2);

        System.out.println(obj.add(3,5,6));

        System.out.println(obj.roundoff(5.5));
        System.out.println(obj.roundoff(-5.05));
        System.out.println(obj.roundoff(-5.6));
    }
}
