package utils;

public class TestChinese {
    public static void main(String [] args) {
        Chinese obj1 = Chinese.getInstance();
        Chinese obj2 = Chinese.getInstance();
        System.out.println(obj1 == obj2);
    }
}
