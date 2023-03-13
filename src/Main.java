import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
    private static void task1() {
        System.out.println("Task 1");
        String firstname = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstname + " " + middleName + " " + lastName;
        System.out.println("Employee's name is " + fullName);
        System.out.println("Task 2");
        System.out.println(fullName.toUpperCase());
    }
    private static void task2() {
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Employee's name is " + fullName);
    }
}