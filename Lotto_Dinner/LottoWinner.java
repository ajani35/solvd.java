/*******************
  Name: Ajani H Dawson

  Date: 07/10/2020

 Notes: Code explaining a Lotto Winning stratgies for the Lotto.   
*******************/
import java.util.Scanner;
import java.lang.Math;

public class LottoWinner {

public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  int fourDigitNumber = (int) Math.ceil(Math.random() * 999);
  int d1 = fourDigitNumber % 10;
  int d2 = (int) ((fourDigitNumber % 100) / 10);
  int d3 = (int) ((fourDigitNumber % 1000) / 100);
  int d4 = (int) ((fourDigitNumber % 10000) / 1000);

  System.out.println("Enter a four-digit number");
  int guess = input.nextInt();
  int guessD1 = guess % 10;
  int guessD2 = (int) ((guess % 100) / 10);
  int guessD3 = (int) ((guess % 1000) / 100);
  int guessD4 = (int) ((guess % 10000) / 1000);
  
  System.out.println("The lottery number is " + d1 + d2 + d3 + d4);

  
  if (guess === fourDigitNumber) 
  System.out.println("You've won 10,000 dollars");
   else if ((d1 == guessD2 && d2 == guessD1 && d3 == guessD3 && d4 == guessD4)
  || (d1 == guessD4 && d2 == guessD3 && d3 == guessD2 && d4 == guessD1)
  || (d1 == guessD3 && d3 == guessD2 && d2 == guessD1 && d1 == guessD4)
  || (d1 == guessD2 && d2 == guessD1 && d1 == guessD4 && d4 == guessD3)
  || (d1 == guessD1 && d2 == guessD4 && d3 == guessD3 && d4 == guessD2)
  || (d1 == guessD4 && d2 == guessD3 && d3 == guessD2 && d4 == guessD1)) {
  System.out.println("You've won 1000");
 } else if (d1 == guessD1 || d1 == guessD2 || d1 == guessD3 || d1 == guessD4 || d2 == guessD1 || d2 == guessD2
  || d2 == guessD3 || d2 == guessD4 || d3 == guessD1 || d3 == guessD2 || d3 == guessD3 || d3 == guessD4
  || d4 == guessD1 || d4 == guessD2 || d4 == guessD3 || d4 == guessD4) {
  System.out.print("You've won 500 dollars");
 } else { 
  System.out.println("Sorry. No match");

  System.out.println("Please enter a four-digit number: ");


}

}

} // end of Class LottoWinner
   