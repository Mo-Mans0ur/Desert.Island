import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class DesertIsland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("welcome, user if you landed on a desert island ");
        System.out.println("what would you take with you? ");
        System.out.println("here's your options: ");

        String[] options = {"1. knife", "2. survival book", "3. fire starting kit", "4. cellphone", "5. gps", "6. boat", "7. clothes", "8. guitar", "9. pencil and paper", "10. hammock"};
        System.out.println();
        System.out.println();

        for (String survivaloptions : options) {
            System.out.println(survivaloptions);
        }

        System.out.println();

        System.out.println("please input your answers below");



        int[] userInputs = new int[10];

        int[] userInputs2 = peoplesInput(userInputs);

        for (int element: userInputs2){
            System.out.println(element);
        }

        System.out.println();
        System.out.println("the most popular choice is " + max(userInputs2));

    }

    public static int[] peoplesInput(int[] array) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {


            int userChoice = scanner.nextInt();

            if (userChoice == 1) {
                System.out.println("you chose a knife ");
                array[0]++;
            } else if (userChoice == 2) {
                System.out.println("you chose a survival book ");
                array[1]++;
            } else if (userChoice == 3) {
                System.out.println("you chose a fire starting kit ");
                array[2]++;
            } else if (userChoice == 4) {
                System.out.println("you chose a cellphone ");
                array[3]++;
            } else if (userChoice == 5) {
                System.out.println("you chose a gps ");
                array[4]++;
            } else if (userChoice == 6) {
                System.out.println("you chose a boat ");
                array[5]++;
            } else if (userChoice == 7) {
                System.out.println("you chose clothes ");
                array[6]++;
            } else if (userChoice == 8) {
                System.out.println("you chose an guitar ");
                array[7]++;
            } else if (userChoice == 9) {
                System.out.println("you chose pencil and paper ");
                array[8]++;
            } else if (userChoice == 10) {
                System.out.println("you chose a hammock");
                array[9]++;
            }else {
                System.out.println("you can only choose from 1 to 10");
            }
            System.out.println();

        }


        return array;
    }

    public static int max(int[] choice) {
        int maximum = choice[0];
        for (int i = 0; i < choice.length; i++) {
            if (choice[i] > maximum) {
                maximum = choice[i];

            }
        }return maximum;
    }
}
