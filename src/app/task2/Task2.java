package app.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public void run() {
        String[] srcArr = {"orange", "plum", "tomato", "onion", "grape", "onion"};

        System.out.println("\nTASK 2\nOutput source array:");
        printSrcArr(srcArr);

        System.out.println("Output correct array:");
        printCorrectArr(deleteWord(srcArr));
    }

    private String[] deleteWord(String[] arr) {
        List<String> newArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("onion")) {
                newArr.add(arr[i]);
            }
        }

        return newArr.toArray(new String[0]);
    }

    private void printSrcArr(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    private void printCorrectArr(String[] correctArr) {
        for (int i = 0, j = 1; i < correctArr.length; i++, j++) {
            System.out.println(j + ". " + correctArr[i]);
        }
    }
}
