package basic_problems;

public class TestReturnType {
    public static void main(String[] args) {
        Integer c = sum();
        System.out.println(c);
    }

    public static Integer sum() {
        int a = 10;
        int b = 20;
        return a + b;
    }
}
