package Introduction.SingletonPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(EmployeeIdStore.getInstance().getName("101"));
    }
}
