//Author: Logan Markley
//Description: 2 Player Tic-Tac-Toe Game
//Date Last Edited: 4/5/18
//Current Steps Completed: ALL DONE

import java.util.*;
public class Markley_TicTacToe_DONE
{
    static Scanner s = new Scanner(System.in);

    //These static characters are used to store the x's and o's
    static char p1='1';
    static char p2='2';
    static char p3='3';
    static char p4='4';
    static char p5='5';
    static char p6='6';
    static char p7='7';
    static char p8='8';
    static char p9='9';

    //these are the names of player 1 and 2
    static String p1name;
    static String p2name;

    public static void main (String args[])
    {
        p1='1';
        p2='2';
        p3='3';
        p4='4';
        p5='5';
        p6='6';
        p7='7';
        p8='8';
        p9='9';

        //The start to the display board
        System.out.println("/-----------\\");
        System.out.println("| " + p1 + " | " + p2 + " | " + p3 + " |");
        System.out.println("| --------- |");
        System.out.println("| " + p4 + " | " + p5 + " | " + p6 + " |");
        System.out.println("| --------- |");
        System.out.println("| " + p7 + " | " + p8 + " | " + p9 + " |");
        System.out.println("\\-----------/");

        //The end of the display board

        //Asking for player 1 and player 2's name
        System.out.println("Player 1 (X's), what is your name? ");
        p1name=s.nextLine();
        System.out.println("Player 2 (O's), what is your name? ");
        p2name=s.nextLine();

        System.out.println();

        xTurn(); //goes to Player X's Turn
    }

    public static void xTurn()
    {
        int p1place; //this variable is just to see where player 1 would like to place their X

        System.out.println(p1name+", where would you like to place your X?"); 
        p1place=s.nextInt(); //this decides what p1place is and which of these 9 if statements will run
        System.out.println();
        
            while (p1place > 9 || p1place < 1)
            {
                System.out.println("That is not a spot on the table!!!");
                xTurn();
            }        

        if (p1place == 1)
        {
            while (p1place > 9 || p1place < 1)
            {
                System.out.println("That is not a spot on the table!!!");
                xTurn();
            }
            while (p1 != '1') //these while loops check to see if the spot is already taken
            {
                System.out.println("That spot is already taken!!!");
                xTurn();
            }
            
            p1 = 'x';
            System.out.println("/-----------\\");
            System.out.println("| " + p1 + " | " + p2 + " | " + p3 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p4 + " | " + p5 + " | " + p6 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p7 + " | " + p8 + " | " + p9 + " |");
            System.out.println("\\-----------/");

            System.out.println();
        }
        if (p1place == 2)
        {
            while (p1place > 9 || p1place < 1)
            {
                System.out.println("That is not a spot on the table!!!");
                xTurn();
            }
            while (p2 != '2')
            {
                System.out.println("That spot is already taken!!!");
                xTurn();
            }
            p2 = 'x';
            System.out.println("/-----------\\");
            System.out.println("| " + p1 + " | " + p2 + " | " + p3 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p4 + " | " + p5 + " | " + p6 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p7 + " | " + p8 + " | " + p9 + " |");
            System.out.println("\\-----------/");

            System.out.println();
        }
        if (p1place == 3)
        {
            while (p1place > 9 || p1place < 1)
            {
                System.out.println("That is not a spot on the table!!!");
                xTurn();
            }
            while (p3 != '3')
            {
                System.out.println("That spot is already taken!!!");
                xTurn();
            }
            p3 = 'x';
            System.out.println("/-----------\\");
            System.out.println("| " + p1 + " | " + p2 + " | " + p3 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p4 + " | " + p5 + " | " + p6 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p7 + " | " + p8 + " | " + p9 + " |");
            System.out.println("\\-----------/");

            System.out.println();
        }
        if (p1place == 4)
        {
            while (p1place > 9 || p1place < 1)
            {
                System.out.println("That is not a spot on the table!!!");
                xTurn();
            }
            while (p4 != '4')
            {
                System.out.println("That spot is already taken!!!");
                xTurn();
            }
            p4 = 'x';
            System.out.println("/-----------\\");
            System.out.println("| " + p1 + " | " + p2 + " | " + p3 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p4 + " | " + p5 + " | " + p6 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p7 + " | " + p8 + " | " + p9 + " |");
            System.out.println("\\-----------/");

            System.out.println();
        }
        if (p1place == 5)
        {
            while (p1place > 9 || p1place < 1)
            {
                System.out.println("That is not a spot on the table!!!");
                xTurn();
            }
            while (p5 != '5')
            {
                System.out.println("That spot is already taken!!!");
                xTurn();
            }
            p5 = 'x';
            System.out.println("/-----------\\");
            System.out.println("| " + p1 + " | " + p2 + " | " + p3 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p4 + " | " + p5 + " | " + p6 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p7 + " | " + p8 + " | " + p9 + " |");
            System.out.println("\\-----------/");

            System.out.println();
        }
        if (p1place == 6)
        {
            while (p1place > 9 || p1place < 1)
            {
                System.out.println("That is not a spot on the table!!!");
                xTurn();
            }
            while (p6 != '6')
            {
                System.out.println("That spot is already taken!!!");
                xTurn();
            }
            p6 = 'x';
            System.out.println("/-----------\\");
            System.out.println("| " + p1 + " | " + p2 + " | " + p3 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p4 + " | " + p5 + " | " + p6 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p7 + " | " + p8 + " | " + p9 + " |");
            System.out.println("\\-----------/");

            System.out.println();
        }
        if (p1place == 7)
        {
            while (p1place > 9 || p1place < 1)
            {
                System.out.println("That is not a spot on the table!!!");
                xTurn();
            }
            while (p7 != '7')
            {
                System.out.println("That spot is already taken!!!");
                xTurn();
            }
            p7 = 'x';
            System.out.println("/-----------\\");
            System.out.println("| " + p1 + " | " + p2 + " | " + p3 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p4 + " | " + p5 + " | " + p6 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p7 + " | " + p8 + " | " + p9 + " |");
            System.out.println("\\-----------/");

            System.out.println();
        }
        if (p1place == 8)
        {
            while (p1place > 9 || p1place < 1)
            {
                System.out.println("That is not a spot on the table!!!");
                xTurn();
            }
            while (p8 != '8')
            {
                System.out.println("That spot is already taken!!!");
                xTurn();
            }
            p8 = 'x';
            System.out.println("/-----------\\");
            System.out.println("| " + p1 + " | " + p2 + " | " + p3 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p4 + " | " + p5 + " | " + p6 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p7 + " | " + p8 + " | " + p9 + " |");
            System.out.println("\\-----------/");
        }
        if (p1place == 9)
        {
            while (p1place > 9 || p1place < 1)
            {
                System.out.println("That is not a spot on the table!!!");
                xTurn();
            }
            while (p9 != '9')
            {
                System.out.println("That spot is already taken!!!");
                xTurn();
            }
            p9 = 'x';
            System.out.println("/-----------\\");
            System.out.println("| " + p1 + " | " + p2 + " | " + p3 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p4 + " | " + p5 + " | " + p6 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p7 + " | " + p8 + " | " + p9 + " |");
            System.out.println("\\-----------/");

            System.out.println();
        }

        if (p1name == p1name) //this big if statement is just to make sure that all of the 8 if statements run
        {
            if (p1 == 'x' && p2 == 'x' && p3 == 'x') //these following 8 if statements will decide if this player has won the game
            {
                System.out.println();
                System.out.println("Congratulations "+p1name+", you have won!");
                again();
            }
            if (p4 == 'x' && p5 == 'x' && p6 == 'x')
            {
                System.out.println();
                System.out.println("Congratulations "+p1name+", you have won!");
                again();
            }
            if (p7 == 'x' && p8 == 'x' && p9 == 'x')
            {
                System.out.println();
                System.out.println("Congratulations "+p1name+", you have won!");
                again();
            }
            if (p1 == 'x' && p4 == 'x' && p7 == 'x')
            {
                System.out.println();
                System.out.println("Congratulations "+p1name+", you have won!");
                again();
            }
            if (p2 == 'x' && p5 == 'x' && p8 == 'x')
            {
                System.out.println();
                System.out.println("Congratulations "+p1name+", you have won!");
                again();
            }
            if (p3 == 'x' && p6 == 'x' && p9 == 'x')
            {
                System.out.println();
                System.out.println("Congratulations "+p1name+", you have won!");
                again();
            }
            if (p1 == 'x' && p5 == 'x' && p9 == 'x')
            {
                System.out.println();
                System.out.println("Congratulations "+p1name+", you have won!");
                again();
            }
            if (p3 == 'x' && p5 == 'x' && p7 == 'x')
            {
                System.out.println();
                System.out.println("Congratulations "+p1name+", you have won!");
                again();
            }
        }

        //this if statements checks to see if all the spots on the board are filled (if the game is over)
        if ( (p1 == 'x' || p1 == 'o') && (p2 == 'x' || p2 == 'o') && (p3 == 'x' || p3 == 'o') && (p4 == 'x' || p4 == 'o') && (p5 == 'x' || p5 == 'o') && (p6 == 'x' || p6 == 'o') && (p7 == 'x' || p7 == 'o') && (p8 == 'x' || p8 == 'o') && (p9 == 'x' || p9 == 'o') )
        {
            System.out.println("It is a tie! GAME OVER");
            again();
        }

        oTurn(); //sends the program to player 2

    }

    public static void oTurn()
    {
        int p2place; //this variable is just to see where player 2 would like to place their O

        System.out.println(p2name+", where would you like to place your O?"); 
        p2place=s.nextInt(); //this decides what p2place is and which of these 9 if statements will run

        System.out.println();
        while (p2place > 9 || p2place < 1)
            {
                System.out.println("That is not a spot on the table!!!");
                oTurn();
            }
        
        if (p2place == 1)
        {
            while (p2place > 9 || p2place < 1)
            {
                System.out.println("That is not a spot on the table!!!");
                oTurn();
            }
            while (p1 != '1')
            {
                System.out.println("That spot is already taken!!!");
                oTurn();
            }
            
            p1 = 'o';
            System.out.println("/-----------\\");
            System.out.println("| " + p1 + " | " + p2 + " | " + p3 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p4 + " | " + p5 + " | " + p6 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p7 + " | " + p8 + " | " + p9 + " |");
            System.out.println("\\-----------/");

            System.out.println();
        }

        if (p2place == 2)
        {
            while (p2place > 9 || p2place < 1)
            {
                System.out.println("That is not a spot on the table!!!");
                oTurn();
            }
            while (p2 != '2')
            {
                System.out.println("That spot is already taken!!!");
                oTurn();
            }
            p2 = 'o';
            System.out.println("/-----------\\");
            System.out.println("| " + p1 + " | " + p2 + " | " + p3 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p4 + " | " + p5 + " | " + p6 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p7 + " | " + p8 + " | " + p9 + " |");
            System.out.println("\\-----------/");

            System.out.println();
        }

        if (p2place == 3)
        {
            while (p2place > 9 || p2place < 1)
            {
                System.out.println("That is not a spot on the table!!!");
                oTurn();
            }
            while (p3 != '3')
            {
                System.out.println("That spot is already taken!!!");
                oTurn();
            }
            p3 = 'o';
            System.out.println("/-----------\\");
            System.out.println("| " + p1 + " | " + p2 + " | " + p3 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p4 + " | " + p5 + " | " + p6 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p7 + " | " + p8 + " | " + p9 + " |");
            System.out.println("\\-----------/");

            System.out.println();
        }

        if (p2place == 4)
        {
            while (p2place > 9 || p2place < 1)
            {
                System.out.println("That is not a spot on the table!!!");
                oTurn();
            }
            while (p4 != '4')
            {
                System.out.println("That spot is already taken!!!");
                oTurn();
            }
            p4 = 'o';
            System.out.println("/-----------\\");
            System.out.println("| " + p1 + " | " + p2 + " | " + p3 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p4 + " | " + p5 + " | " + p6 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p7 + " | " + p8 + " | " + p9 + " |");
            System.out.println("\\-----------/");

            System.out.println();
        }
        if (p2place == 5)
        {
            while (p2place > 9 || p2place < 1)
            {
                System.out.println("That is not a spot on the table!!!");
                oTurn();
            }
            while (p5 != '5')
            {
                System.out.println("That spot is already taken!!!");
                oTurn();
            }
            p5 = 'o';
            System.out.println("/-----------\\");
            System.out.println("| " + p1 + " | " + p2 + " | " + p3 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p4 + " | " + p5 + " | " + p6 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p7 + " | " + p8 + " | " + p9 + " |");
            System.out.println("\\-----------/");

            System.out.println();
        }
        if (p2place == 6)
        {
            while (p2place > 9 || p2place < 1)
            {
                System.out.println("That is not a spot on the table!!!");
                oTurn();
            }
            while (p6 != '6')
            {
                System.out.println("That spot is already taken!!!");
                oTurn();
            }
            p6 = 'o';
            System.out.println("/-----------\\");
            System.out.println("| " + p1 + " | " + p2 + " | " + p3 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p4 + " | " + p5 + " | " + p6 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p7 + " | " + p8 + " | " + p9 + " |");
            System.out.println("\\-----------/");

            System.out.println();
        }
        if (p2place == 7)
        {
            while (p2place > 9 || p2place < 1)
            {
                System.out.println("That is not a spot on the table!!!");
                oTurn();
            }
            while (p7 != '7')
            {
                System.out.println("That spot is already taken!!!");
                oTurn();
            }
            p7 = 'o';
            System.out.println("/-----------\\");
            System.out.println("| " + p1 + " | " + p2 + " | " + p3 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p4 + " | " + p5 + " | " + p6 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p7 + " | " + p8 + " | " + p9 + " |");
            System.out.println("\\-----------/");

            System.out.println();
        }
        if (p2place == 8)
        {
            while (p2place > 9 || p2place < 1)
            {
                System.out.println("That is not a spot on the table!!!");
                oTurn();
            }
            while (p8 != '8')
            {
                System.out.println("That spot is already taken!!!");
                oTurn();
            }
            p8 = 'o';
            System.out.println("/-----------\\");
            System.out.println("| " + p1 + " | " + p2 + " | " + p3 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p4 + " | " + p5 + " | " + p6 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p7 + " | " + p8 + " | " + p9 + " |");
            System.out.println("\\-----------/");

            System.out.println();
        }
        if (p2place == 9)
        {
            while (p2place > 9 || p2place < 1)
            {
                System.out.println("That is not a spot on the table!!!");
                oTurn();
            }
            while (p9 != '9')
            {
                System.out.println("That spot is already taken!!!");
                oTurn();
            }
            p9 = 'o';
            System.out.println("/-----------\\");
            System.out.println("| " + p1 + " | " + p2 + " | " + p3 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p4 + " | " + p5 + " | " + p6 + " |");
            System.out.println("| --------- |");
            System.out.println("| " + p7 + " | " + p8 + " | " + p9 + " |");
            System.out.println("\\-----------/");

            System.out.println();
        }

        if (p2name == p2name) //this big if statement is just to make sure that all of the 8 if statements run
        {
            if (p1 == 'o' && p2 == 'o' && p3 == 'o') //these following 8 if statements will decide if this player has won the game
            {
                System.out.println();
                System.out.println("Congratulations "+p2name+", you have won!");
                again();
            }
            if (p4 == 'o' && p5 == 'o' && p6 == 'o')
            {
                System.out.println();
                System.out.println("Congratulations "+p2name+", you have won!");
                again();
            }
            if (p7 == 'o' && p8 == 'o' && p9 == 'o')
            {
                System.out.println();
                System.out.println("Congratulations "+p2name+", you have won!");
                again();
            }
            if (p1 == 'o' && p4 == 'o' && p7 == 'o')
            {
                System.out.println();
                System.out.println("Congratulations "+p2name+", you have won!");
                again();
            }
            if (p2 == 'o' && p5 == 'o' && p8 == 'o')
            {
                System.out.println();
                System.out.println("Congratulations "+p2name+", you have won!");
                again();
            }
            if (p3 == 'o' && p6 == 'o' && p9 == 'o')
            {
                System.out.println();
                System.out.println("Congratulations "+p2name+", you have won!");
                again();
            }
            if (p1 == 'o' && p5 == 'o' && p9 == 'o')
            {
                System.out.println();
                System.out.println("Congratulations "+p2name+", you have won!");
                again();
            }
            if (p3 == 'o' && p5 == 'o' && p7 == 'o')
            {
                System.out.println();
                System.out.println("Congratulations "+p2name+", you have won!");
                again();
            }
        }

        //this if statements checks to see if all the spots on the board are filled (if the game is over)
        if ( (p1 == 'x' || p1 == 'o') && (p2 == 'x' || p2 == 'o') && (p3 == 'x' || p3 == 'o') && (p4 == 'x' || p4 == 'o') && (p5 == 'x' || p5 == 'o') && (p6 == 'x' || p6 == 'o') && (p7 == 'x' || p7 == 'o') && (p8 == 'x' || p8 == 'o') && (p9 == 'x' || p9 == 'o') )
        {
            System.out.println("It is a tie! GAME OVER");
            again();
        }

        xTurn(); //sends the program back to player 1
    }

    public static void again ()
    {
        System.out.println("Would you like to play again? (1 for yes)");
        int again = s.nextInt();

        if (again == 1)
        {
            System.out.println("Restarting ...");
            try {
                Thread.sleep(1000);                 //x is how many milliseconds it delays
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.println("\n..."); 
            System.out.println();
            try {
                Thread.sleep(1000);                 //x is how many milliseconds it delays
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            s.nextLine();
            main (null);
        }
        else
        {
            System.exit(0);
        }

    }

}

