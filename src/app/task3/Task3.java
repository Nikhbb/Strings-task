package app.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public void run() {
        String[] srcArr = {"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};

        System.out.println("\nTASK 3\nOutput source array:");
        printSrcArr(srcArr);

        String userName = getUserName();

        System.out.println("Output result:");
        printResult(userName, getNameCount(srcArr, userName));
    }

    private String getUserName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        return sc.nextLine();
    }
    private int getNameCount(String[] arr, String name) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(name)) {
                count++;
            }
        }
        return count;
    }

    private void printSrcArr(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    private void printResult(String name, int count) {
       if(count == 0){
           System.out.println(name + " not found");
       } else{
           System.out.println(name + " meets " + count + " times");
       }
    }
}
