package com.pluralsight;
import java.util.Scanner;

public class Score {

    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in);
        System.out.println("Please enter score: (Use format team1:team2|score1:score2)");
        String input = myScanner.nextLine();
        String [] teamInfo = input.split("\\|");
        String [] teamName = teamInfo[0].split("\\:");

        String [] teamScore = teamInfo[1].split("\\:");


        if (Integer.parseInt(teamScore[0]) > Integer.parseInt(teamScore[1])) {
            System.out.println("The winning team is :" + teamName[0]);
        }
        else if (Integer.parseInt(teamScore[0]) < Integer.parseInt(teamScore[1])){
            System.out.println("The winning team is :" + teamName[1]);
        }
        else if(Integer.parseInt(teamScore[0]) == Integer.parseInt(teamScore[1])){
            System.out.println("The game ends in a draw.");
        }









    }
}
