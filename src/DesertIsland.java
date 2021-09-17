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

        System.out.println("please input your answer below");

        System.out.println();


        peoplesInput();



    }

    public static void peoplesInput() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {


            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
                System.out.println("you chose a knife ");
            } else if (userChoice == 2) {
                System.out.println("you chose a survival knife ");
            } else if (userChoice == 3) {
                System.out.println("you chose a fire starting kit ");
            } else if (userChoice == 4) {
                System.out.println("you chose a cellphone ");
            } else if (userChoice == 5) {
                System.out.println("you chose a gps ");
            } else if (userChoice == 6) {
                System.out.println("you chose a boat ");
            } else if (userChoice == 7) {
                System.out.println("you chose clothes ");
            } else if (userChoice == 8) {
                System.out.println("you chose an guitar ");
            } else if (userChoice == 9) {
                System.out.println("you chose pencil and paper ");
            } else if (userChoice == 10) {
                System.out.println("you chose a hammock");
            }else {
                System.out.println("you can only choose from 1 to 10");
            }

        }


    }

}
