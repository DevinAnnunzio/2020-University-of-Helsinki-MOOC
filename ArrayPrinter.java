
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here

        if (array.length == 0) {

        }

        for (int index = 0; index < array.length; index++) {
            if (array.length == 1) {
                System.out.print(array[0]);
            } else if (index == array.length - 1) {
                {
                    System.out.println(array[index]);
                }

            } else {
                System.out.print(array[index] + ",");
            }
        }
    }
}
