/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Umpire u=new Umpire();
		u.collectingNumFromGuesser();
		u.collectingNumFromPlayers();
		u.comparing();
	}
}
class Guesser 
    {
         int gnum;
         int guessingNum()
         {
             System.out.println("guesser ,kindly guess the number");
             Scanner scan =new Scanner(System.in);
             gnum=scan.nextInt();
             return gnum;
         }
    }
class Player 
   {
       int pnum;
       int predictingNum()
       {
           System.out.println("player kindly predict the number ");
           Scanner scan =new Scanner(System.in);
           pnum=scan.nextInt();
           return pnum;
       }
   }
class Umpire
   {
       int numFromGuesser;
       int numFromPlayer1;
       int numFromPlayer2;
       int numFromPlayer3;
       void collectingNumFromGuesser()
         {
             Guesser g =new Guesser();
             numFromGuesser =g.guessingNum();
         }
        void collectingNumFromPlayers()
        {
            Player p1=new Player();
            Player p2=new Player();
            Player p3=new Player();
            numFromPlayer1=p1.predictingNum();
             numFromPlayer2=p2.predictingNum();
             numFromPlayer3=p3.predictingNum();
            
        }
        void comparing()
        {
            if(numFromPlayer1 == numFromGuesser)
                      {
                          System.out.println("player1 win the game");
                      }
           else if(numFromPlayer2 == numFromGuesser)
                       {
                           System.out.println("player2 win the game");
                       }
            else if(numFromPlayer3 == numFromGuesser) 
                        {
                            System.out.println("palyer3 win the game");
                        }
            else
                        {
                            System.out.print("game is lost");
                        }
        }
   }
  
   