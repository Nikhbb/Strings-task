package app.task1;

import java.util.Arrays;

public class Task1 {
    public void run() {
        String[] srcArr = {"brange", "plum", "tomato", "onibn", "grape"};

        System.out.println("\nTASK 1\nOutput source array:");
        printSrcArr(srcArr);

        System.out.println("Output correct array:");
        printCorrectArr(correctMistake(srcArr));
    }

    private String[] correctMistake(String[] arr) {
        arr[0] = "orange";
        arr[3] = "onion";
        return arr;
    }

    private void printSrcArr(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    private void printCorrectArr(String[] correctArr) {
        for (int i = 0, j=1; i < correctArr.length; i++, j++) {
            System.out.println(j + ". " + correctArr[i]);
        }
    }


}
