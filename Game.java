/**********************
 @author Jesse Allen
 @Created September 17 2013
***********************/
import java.util.Random;
import javax.swing.JOptionPane;

public class Game
{    
     
   public static void main(String[] args)
   {
   
      String playAgain;
      char cont;  
      int computerChoice, userChoice;
          
      do
      {  
          //Method generates and returns the computers choice
          computerChoice = computerTurn();
         
          //Method to allow users choice
          userChoice = userTurn();  
          
          //Displays message to create suspense
          JOptionPane.showMessageDialog(null,"One...Two...Three...\nPress \"OK\" to continue");
          
          //Displays message using the showWinner method as the parameter
          JOptionPane.showMessageDialog(null,showWinner(computerChoice, userChoice));
             
          //To receive user input in order to play again      
          playAgain = JOptionPane.showInputDialog(null,"Would you like to play again? Enter Y for yes N for no: ");
                      
          //Converts first charatcer of user input from string to char
          cont = playAgain.charAt(0);
          
      }
      while ((cont == 'Y')||(cont == 'y'));//Decision loop to play again
   }
      
   /**The computerTurn method has no arguments, it controls the computers turn by generating 
      and returning a random integer that is used as an parameter in the showWinner method
      @return The computers choice of rock, paper, or scissors as an integer. Used as parameter for showWinner method.
   */
     
   public static int computerTurn()
   {     
      Random rand = new Random();
         
      int computerChoice = rand.nextInt(3) + 1;//generates new random number between 1 - 3
         
      return computerChoice; //Returns computer choice to main method
   }
   
   /**The userTurn method has no arguments, it creates a message box that allows the user to input 
      their choice. That choice is used as an parameter in the showWinner method
      @return The user's choice of rock, paper, or scissors as an integer. Used as parameter for showWinner method.    
   */
  
   public static int userTurn()
   {
                  
      String input = JOptionPane.showInputDialog(null,"Please Choose\n 1 for Rock \n"  +
                                                    " 2 for Paper \n 3 for Scissors ");
                           
      int userChoice = Integer.parseInt(input); //Converts input string to integer
                                              
      return userChoice; //Returns users choice to the main method                                           
   }
   
   /**The showWinner method requires two integer arguments containing the computers choice and the users choice.
      It returns a string that displays the computer and user's choice and the winner.
      @param computerChoice integer that is returned from computerTurn method.
      @param userChoice integer that is returned from userTurn method.
      @return a reference to a string object containing the computer and users choice an the winner.
       */
          
   public static String showWinner(int computerChoice, int userChoice)//Method to calculate winner
   {
      //To declare and initialize variables used in if statements
      String winner = "";
      String user ="";
      String computer ="";
      String result ="";
      
   //if decision to determine results             
   if ((computerChoice == 1)&&(userChoice == 1))
   {
       user = "\"Rock\"";
       computer = "\"Rock\"";
       result = "It's a tie!";
   }
   else if ((computerChoice == 2)&&(userChoice == 1))
   {
       user = "\"Rock\"";
       computer = "\"Paper\"";
       result = "You Lost!";
   }
   else if ((computerChoice == 3)&&(userChoice == 1))
   {
       user = "\"Rock\"";
       computer = "\"Scissors\"";
       result = "You Won!";
   }
   else if ((computerChoice == 1)&&(userChoice == 2))
   {
       user = "\"Paper\"";
       computer = "\"Rock\"";
       result = "You Won!";
   }
   else if ((computerChoice == 2)&&(userChoice == 2))
   {
       user = "\"Paper\"";
       computer = "\"Paper\"";
       result = "It's a tie!";
   }
   else if ((computerChoice == 3)&&(userChoice == 2))
   {
       user = "\"Paper\"";
       computer = "\"Scissors\"";
       result = "You Lost!";
   }
   else if ((computerChoice == 1)&&(userChoice == 3))
   {
       user = "\"Scissors\"";
       computer = "\"Rock\"";
       result = "You Lost!";
   }
   else if ((computerChoice == 2)&&(userChoice == 3))
   {
       user = "\"Scissors\"";
       computer = "\"Paper\"";
       result = "You Won!";
   }
   else if ((computerChoice == 3)&&(userChoice == 3))
   {
       user = "\"Scissors\"";
       computer = "\"Scissors\"";
       result = "It's a tie!";
   }
   //Variable to hole result
   winner = "You have chosen " + user + ", The computer chose "
             + computer + ".\n" + result;
               
   return winner;//returns results to main method
   }
}







      
         
         
          
            
      
      