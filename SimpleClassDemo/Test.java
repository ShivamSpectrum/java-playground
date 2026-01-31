class Calculator2 {
    int a;
    public int add(int a, int b){
        return a + b;
    } 
}

public class Test{
    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();
        int output1 = calc.add(5,8);
        System.out.println("sum is "+output1);
    }
}

