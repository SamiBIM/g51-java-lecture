package se.lexicon.sami;

public class Arrays {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        //exercise3();
        exercise4();

    }

    public static void exercise1() {

        int[] arrayex1 = {1, 2, 3};
        //missing a line I think
        System.out.println(arrayex1);
    }


    public static void exercise2() {
        int[] arr = {1, 2, 5, 4};
        int element = 2;
        int index = indexOf(arr, element);

        System.out.println("Index position of number " + element + " is: " + index);

    }

    public static int indexOf(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;

    }

    /*public static void exercise3() {
        String[] strArr = {"Paris", "London", "New York", "Stockholm"};
        System.out.println("String array: " + Arrays.toString(strArr));
        //Arrays.sort(strArr);
        System.out.println("Sorted string array: " + Arrays.toString(strArr));
    }*/

    public static void exercise4() {
        int[] firstArr = {1, 15, 20};
        int[] secondArr = java.util.Arrays.copyOf(firstArr,firstArr.length);
        System.out.println("Elements from first array: " + Arrays.toString(firstArr));
        System.out.println("Elements from second array: " + Arrays.toString(secondArr));
    }


}
