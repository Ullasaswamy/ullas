import java.util.Random;
import java.util.Scanner;
//Number Game:
public class task1 {
    public static void main(String[] args) {
        //Scanner class for entering Numbers
        Scanner sc=new Scanner(System.in);
        //Random class to get random value
        Random r=new Random();
        //ans variable to store the random number
        int ans=r.nextInt(10)+1;
        boolean correct=false;
        int totalScore=0;
        //Maximum rounds user have
        int Max_round=3;
        //Maximum attempts user have
        int Max_Attempts=10;
        int round=1;
        int attempt=1;
            while(round<=Max_round)
            {   
                System.out.println("Round "+round+" Begins..");
                while (!correct && attempt<=Max_Attempts) {
                    System.out.println("Attempt "+attempt+" of Round "+round);
                    System.out.println("Enter your guess between 1 to 100 : ");
                    int guess=sc.nextInt();
                    if(ans<guess){
                        System.out.println("Your guess is Too high , Try again !");
                    }
                    else if(ans>guess){
                        System.out.println("Your guess is Too Low , Try again !");
                    }
                    else{
                        System.out.println("Congratulation Your guess is correct.");
                        correct=true;
                        attempt++;
                        totalScore+=10;
                        //To set another random value if user has entered correct number
                        ans=r.nextInt(10)+1;
                        if(attempt>Max_Attempts){
                            round++;
                            attempt=1;
                            correct=false;
                            break;
                        }
                        else{
                            round++;
                            attempt=1;
                            correct=false;
                            break;
                        }

                    }
                    attempt++;
                    if(attempt>Max_Attempts){
                        round++;
                        attempt=1;
                        break;
                    }

                }
                if(round>Max_round){
                    System.out.println("Your Maximum Rounds are Over !...");
                    System.out.println("Out of 30 Your Score is : "+totalScore);
                }

            }
    }
}
