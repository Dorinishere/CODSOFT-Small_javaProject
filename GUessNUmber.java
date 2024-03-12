import java.util.Random;
import java.util.Scanner;

public class GUessNUmber{

    public static void main (String args[]){
        Random rd= new Random();
        Scanner scanner = new Scanner(System.in);

        int RandomNumber= rd.nextInt(100) +1;

        System.out.println("Random number is"+ RandomNumber);
        int trycount=0;
        
        while(true){
                System.out.println("Enter Your Guess NUmber between(1-100):");
                
        int playerGuess=scanner.nextInt();
        trycount++;
        if(playerGuess == RandomNumber){
            System.out.println("Congo! You WIN!");
            System.out.println("It took you"+ trycount+  "tries");
            break;
        }
        else if(RandomNumber>playerGuess){
            System.out.println("Wrong!! The NUmber is higher. Please Guess again");
        }
        else {
            System.out.println("Nope!! The NUmber is lower. Please Guess again"); 
        }
    }
    scanner.close();

    }
}
 