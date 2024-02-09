package app;

import app.task1.Task1;
import app.task2.Task2;
import app.task3.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runTask(getMenuNumber());
    }

    public static int getMenuNumber() {
        System.out.println("\nMenu:");
        System.out.println("0 - exit");
        System.out.println("1 - correct mistake");
        System.out.println("2 - delete 'onion'");
        System.out.println("3 - find name");

        Scanner sc = new Scanner(System.in);
        System.out.print("Input menu number: ");

        return sc.nextInt();
    }

    public static void runTask(int taskNumber) {
        switch (taskNumber) {
            case 0:
                System.out.println("Bye.");
                break;
            case 1:
                new Task1().run();
                runTask(getMenuNumber());
                break;
            case 2:
                new Task2().run();
                runTask(getMenuNumber());
                break;
            case 3:
                new Task3().run();
                runTask(getMenuNumber());
                break;
            default:
                runTask(getMenuNumber());
        }
    }
}
