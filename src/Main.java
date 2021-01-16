import java.util.Scanner;

public class Main {
    public Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public void characterNames() {
        System.out.println("Enter number of players");
        int numbOfPlayer = input.nextInt();

        if (numbOfPlayer > 16) {
            System.out.println("invalid selection");
        }
        else{
            for (int i = 0; i < numbOfPlayer; i++) {

                System.out.println("please enter character names: ");
                String playerName = input.nextLine();


            }
        }
    }
}
