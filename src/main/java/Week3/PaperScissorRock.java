//Instructions:
//        Write a Java program that imitates the two players game “Scissors-Paper-Rock”. As an input use ‘sc’ for scissors, ‘pp’ for paper and ‘rc’ for rock.
//
//        Input:
//        One of the three options: 'sc', 'pp' or 'rc' for each player on two separate lines.
//
//        Output:
//        Text message "Draw" or "Winner is user" (where the user either Player1 or Player2) based on the game result.
//
//        Example 1:
//        Player1: sc
//        Player2: pp
//        Winner is Player1
//        Example 2:
//        Player1: rc
//        Player2: rc
//        Draw
//        Example 3:
//        Player1: pp
//        Player2: sc
//        Winner is Player2

package Week3;

import java.util.Scanner;

public class PaperScissorRock {
    public static void main(String[] args) {
        Scanner paperScissorRock = new Scanner(System.in);
        System.out.print("Player1: ");
        String move1 = paperScissorRock.next();
        System.out.print("Player2: ");
        String move2 = paperScissorRock.next();
        boolean vic_player1 = ((move1 + move2).equals("scpp") ||
                (move1 + move2).equals("pprc") || (move1 + move2).equals("rcsc"));
        boolean vic_player2 = ((move2 + move1).equals("scpp") ||
                (move2 + move1).equals("pprc") || (move2 + move1).equals("rcsc"));
        if (vic_player1) {
            System.out.print("Winner is Player1");
        }
        else if (vic_player2) {
            System.out.print("Winner is Player2");
        }
        else {
            System.out.print("Draw");
        }
    }
}