package ge.automation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ChildOfCountVowel countVowelObject = new ChildOfCountVowel();
        countVowelObject.countVowel("I Love Testing");

        ReplacementChar replacementACharObject = new ReplacementChar();
        replacementACharObject.replaceA("I Love Alpha Testing");

        ReplacementChar replacementBCharObject = new ReplacementChar();
        replacementBCharObject.replaceB("I Love Beta Testing");

        manageNums();
    }

    public static void manageNums() {
        int[] arr = {18, -3, 5, -7, 6, 89, 13, 0, -89};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int tempNum = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempNum;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}