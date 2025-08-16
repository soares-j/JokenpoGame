// Pedra, papel ou tesoura (Jo-ken-po)

import java.util.Random;
import java.util.Scanner;

public class JokenpoGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"Pedra", "Papel", "Tesoura"};
        int userScore = 0;
        int computerScore = 0;

        while (true) {
            System.out.println("Escolha: Pedra, Papel ou Tesoura (ou 'sair' para encerrar)");
            String userChoice = scanner.nextLine();

            if (userChoice.equalsIgnoreCase("sair")) {
                break;
            }

            int computerChoice = random.nextInt(3);
            System.out.println("Computador escolheu: " + options[computerChoice]);

            if (userChoice.equalsIgnoreCase(options[computerChoice])) {
                System.out.println("Empate!");
            } else if ((userChoice.equalsIgnoreCase("Pedra") && options[computerChoice].equals("Tesoura")) ||
                    (userChoice.equalsIgnoreCase("Papel") && options[computerChoice].equals("Pedra")) ||
                    (userChoice.equalsIgnoreCase("Tesoura") && options[computerChoice].equals("Papel"))) {
                System.out.println("Você ganhou!");
                userScore++;
            } else if ((userChoice.equalsIgnoreCase("Pedra") && options[computerChoice].equals("Papel")) ||
                    (userChoice.equalsIgnoreCase("Papel") && options[computerChoice].equals("Tesoura")) ||
                    (userChoice.equalsIgnoreCase("Tesoura") && options[computerChoice].equals("Pedra"))) {
                System.out.println("Você perdeu!");
                computerScore++;
            } else {
                System.out.println("Escolha inválida! Tente novamente.");
                continue;
            }

            System.out.println("Placar: Você " + userScore + " x " + computerScore + " Computador");
        }

        System.out.println("Obrigado por jogar!");
        scanner.close();
    }
}