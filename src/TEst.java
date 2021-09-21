import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TEst {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
        int[] userInputs = new int[10];
        System.out.println(Arrays.toString(userInputs));
        userInputs[3]++;
        System.out.println(Arrays.toString(userInputs));
        */


        int[] userInputs = new int[10];
        for (int i = 0; i < 10; i++) {


            int peoplesAnswers = scanner.nextInt();

            userInputs[peoplesAnswers - 1]++;



            userInputs[peoplesAnswers] = userInputs[peoplesAnswers]+1;
            System.out.println(userInputs[peoplesAnswers]);
        }
    }
        /*
    public static void peoplesAnswers() {

        int[] userInputs = new int[10];
        for () {
            System.out.println(Arrays.toString(userInputs));
            userInputs[0]++;
            System.out.println(Arrays.toString(userInputs));
            userInputs[1]++;
            System.out.println(Arrays.toString(userInputs));
            userInputs[2]++;
            System.out.println(Arrays.toString(userInputs));
            userInputs[3]++;
            System.out.println(Arrays.toString(userInputs));
            userInputs[4]++;
            System.out.println(Arrays.toString(userInputs));
            userInputs[5]++;
            System.out.println(Arrays.toString(userInputs));
            userInputs[6]++;
            System.out.println(Arrays.toString(userInputs));
            userInputs[7]++;
            System.out.println(Arrays.toString(userInputs));
            userInputs[8]++;
            System.out.println(Arrays.toString(userInputs));
            userInputs[9]++;
            System.out.println(Arrays.toString(userInputs));

        }

         */
}
