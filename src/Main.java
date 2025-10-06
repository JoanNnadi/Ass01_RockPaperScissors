
import java.util.Scanner;

 public class Main
{
    public static void main(String[] args)
    {
               String RPS = "";
               String PlayerA = "";
               String PlayerB = "";
               String playAgain = "Yes";


               Scanner in = new Scanner(System.in);
               do {

                   System.out.print(" Player A enter your move: ");
                   PlayerA = in.nextLine();

                   if (!PlayerA.equalsIgnoreCase("R")
                           && !PlayerA.equalsIgnoreCase("P")
                           && !PlayerA.equalsIgnoreCase("S"))
                   {
                       System.out.print(" Invalid Choice, please enter the right move: ");
                       continue;
                   }
                   RPS = PlayerB;

                   System.out.print(" Please enter move for Player B [RPS]: " + RPS);

                   PlayerB = in.nextLine();

                   if (PlayerA.equalsIgnoreCase("R"))
                   {
                       if (PlayerB.equalsIgnoreCase("R"))
                       {
                           System.out.println(" Rock versus Rock: Its a Tie! ");
                       }
                       else if (PlayerB.equalsIgnoreCase("P"))
                       {
                           System.out.println(" Paper covers Rock: Player B wins!");

                       } else // PlayerB is scissors
                       {
                           System.out.println("Rock breaks scissors: Player A wins!");
                       }

                   } else if (PlayerA.equalsIgnoreCase("P"))

                       if (PlayerB.equalsIgnoreCase("R"))
                       {
                           System.out.println(" Paper covers Rock: Player A wins! ");
                       }
                       else if (PlayerB.equalsIgnoreCase("P"))
                       {
                           System.out.println(" Paper versus Paper: Itrs a tie!");

                       } else // PlayerB is scissors
                       {
                           System.out.println("Scissors cuts Paper: Player B wins!");
                       }

                   else // Player A is Scissors

                       if (PlayerB.equalsIgnoreCase("R"))
                       {
                           System.out.println(" Rock breaks Scissors: Player B wins! ");
                       }
                       else if (PlayerB.equalsIgnoreCase("P"))
                       {
                           System.out.println(" Scissors cuts Paper: Player A wins!");

                       } else // PlayerB is scissors
                       {
                           System.out.println("Scissors versus Scissors: Its a Tie!");
                       }

                       // Test move for player B
                   System.out.print(" Please enter move for Player B: ");
                       PlayerB = in.nextLine();
                       RPS = PlayerA;

                   System.out.print(" Please enter move for Player A [RPS]: ");
                   PlayerA = in.nextLine();

                   if (PlayerB.equalsIgnoreCase("R"))
                   {
                       if (PlayerA.equalsIgnoreCase("R"))
                       {
                           System.out.println(" Rock versus Rock: Its a Tie! ");
                       }
                       else if (PlayerA.equalsIgnoreCase("P"))
                       {
                           System.out.println(" Paper covers Rock: Player A wins!");

                       } else // Player A is scissors
                       {
                           System.out.println("Rock breaks scissors: Player B wins!");
                       }
                   } else if (PlayerB.equalsIgnoreCase("P"))

                       if (PlayerA.equalsIgnoreCase("R"))
                       {
                           System.out.println(" Paper covers Rock: Player B wins! ");
                       } else if (PlayerB.equalsIgnoreCase("P"))
                       {
                           System.out.println(" Paper versus Paper: Its a tie!");

                       } else // Player A is scissors
                       {
                           System.out.println("Scissors cuts Paper: Player A wins!");
                       }
                     else // Player B is Scissors

                       if (PlayerA.equalsIgnoreCase("R"))
                       {
                           System.out.println(" Rock breaks Scissors: Player A wins! ");
                       } else if (PlayerA.equalsIgnoreCase("P"))
                       {
                           System.out.println(" Scissors cuts Paper: Player B wins!");

                       } else // PlayerB is scissors
                       {
                           System.out.println("Scissors versus Scissors: Its a Tie!");
                       }
                   {
                       System.out.print(" Do you want to play the game again?: [ Y/ N] ");
                   }

                   playAgain = in.nextLine();

               }
               while (playAgain.equalsIgnoreCase("Y"));

               System.out.println(" It was nice playing with you today!: ");

               in.close();


           }

       }





