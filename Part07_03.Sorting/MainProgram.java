
import java.util.Arrays;

public class MainProgram {

    public static int smallest(int[] array) {
        int smallestNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallestNum >= array[i]) {
                smallestNum = array[i];
            }
        }
        return smallestNum;
    }

    public static int indexOfSmallest(int[] array) {
        int index = indexOfSmallestFrom(array, 0);
        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        //returns -1 if the array is empty
        int smallestIndex = -1;
        for (int i = startIndex; i < array.length; i++) {
            if (smallestIndex == -1 || array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static void swap(int array[], int index1, int index2) {

        //array[index] = value in index
        int firstIndex = index1;
        int secondIndex = index2;
        int temp = -1;

        if (index1 < index2) {
            firstIndex = index1;
            secondIndex = index2;
        } else if (index1 > index2) {
            firstIndex = index2;
            secondIndex = index1;
        }
        int firstIndexVal = array[firstIndex];
        int secondIndexVal = array[secondIndex];

        for (int i = 0; i < array.length; i++) {
            if (i == firstIndex) {
                array[i] = secondIndexVal;
            }
            if (i == secondIndex) {
                array[i] = firstIndexVal;
            }
        }

    }

    public static void sort(int[] array) {
        int smallestVal = -1;

        for (int i = 0; i < array.length; i++) {
            smallestVal = indexOfSmallestFrom(array, i);
            swap(array, smallestVal, i);

        }

    }

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {3, 2, 5, 4, 8};

        MainProgram.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

}
