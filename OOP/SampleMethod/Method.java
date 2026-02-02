class Calculator {
    public void PlayMusic() {
        System.out.println("Music playing");
    }

    public String GetMePen (int cost) {
        if (cost>=10)
            return "Pen";
        
        else
            return "Nothing";
    }
}

public class Method {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.PlayMusic();
        String v1 = obj.GetMePen(10);
        System.out.println(v1);
    }
}
