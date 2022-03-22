
public class AdvancedAstrology {

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        //Focus on finding the pattern.  The amount of spaces needed before the star.
        //How many stars in each line and how does it change by each line
        //How many spaces each line, and how does it change by each line

        printTriangle(1);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int spaceMaker = size - 1;
        for (int i = 1; i <= size; i++) {
            printSpaces(spaceMaker);
            printStars(i);
            spaceMaker--;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int starLimit = (height * 2) - 1;
        int spaceReduction = height - 1;
        int baseCounter = 2;
        for (int i = 1; i <= starLimit; i += 2) {
            printSpaces(spaceReduction);
            spaceReduction--;
            printStars(i);
        }
        while (baseCounter > 0) {
            printSpaces(height - 2);
            printStars(3);
            baseCounter--;
        }

    }

}