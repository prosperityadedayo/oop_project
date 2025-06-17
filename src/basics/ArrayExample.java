package basics;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] myArray = {};
        int[] anotherArray = new int[10];
        String[] gender = {"Female", "Male"};


        for(int i = 0; i < anotherArray.length; i++) {
            System.out.println("Insert Item at: " +i);
            anotherArray[i] = input.nextInt();
        }
        for(int i = 0; i < anotherArray.length; i++) {
            if (anotherArray[i] == 4) {
                System.out.println("Found 4 " + anotherArray[i]);
            }
        }
        int number = 0;
        for (int i = 0; i < myArray.length; i++){

            number = number + myArray[i];

            System.out.println(number);
        }

    }
}
