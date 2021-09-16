public class DesertIsland {
    public static void main(String[] args) {
        System.out.println("welcome, user if you landed on a desert island ");
        System.out.println("what would you take with you? ");
        System.out.println("here's your options: ");

        String[] options = {"1. knife", "2. survival book", "3. fire starting kit", "4. cellphone", "5. gps", "6. boat", "7. clothe", "8. guitar", "9. pencil and paper", "10. hammock"};
        System.out.println();
        System.out.println();

        for (String survivaloptions : options) {
            System.out.println(survivaloptions);
        }

    }
}
