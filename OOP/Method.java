class Calculator {
    public void PlayMusic() {
        System.out.println("Music playing");
    }

    public String GetMePen () {
        return "Pen";
    }
}

public class Method {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.PlayMusic();
        String v1 = obj.GetMePen();
        System.out.println(v1);
    }
}
