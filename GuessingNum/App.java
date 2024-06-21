package GuessingNum;

import java.util.Scanner;

class Guesser {
    int gnum;

    int guessingNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly! Guess a number");
        gnum = sc.nextInt();
        // sc.close();
        return gnum;
    }
}

class Player {
    int pnum;
    
    int predictingNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player, Kindly predict a number");
        pnum = sc.nextInt();
        return pnum;
    }
}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectingNumFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNum();
    }

    void collectingNumFromPlayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numFromPlayer1 = p1.predictingNum();
        numFromPlayer2 = p2.predictingNum();
        numFromPlayer3 = p3.predictingNum();
    }

    void comparing() {
        if(numFromGuesser == numFromPlayer1) {
            System.out.println("Player 1 won the game");
        } else if(numFromGuesser == numFromPlayer2) {
            System.out.println("Player 2 won the game");
        } else if(numFromGuesser == numFromPlayer3) {
            System.out.println("Player 3 won the game");
        } else {
            System.out.println("Game Lost. Try Again!");
        }
    }
}
public class App {
    public static void main(String[] args) {
        Umpire u = new Umpire();
        u.collectingNumFromGuesser();
        u.collectingNumFromPlayers();
        u.comparing();
    }
}
