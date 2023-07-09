import java.util.Random;
import java.util.Scanner;

    public class rockpaperscissorsgame {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Random ram=new Random();
            System.out.println("Welcome to Rock-Paper-Scissors-Game ");
            String play="yes";
            while(play.equals("yes"))
            {
                System.out.println("press the number");
                int rock = 0;
                int paper = 1;
                int scissors = 2;
                int user, computer;
                user = sc.nextInt();
                while (user > 2)
                {
                    System.out.println("Enter the number between 0 to 2");
                    user = sc.nextInt();
                }
                if (user == 0)
                {
                    System.out.println("User choose rock");
                }
                else if (user == 1)
                {
                    System.out.println("User choose paper");
                }
                else
                {
                    System.out.println("User choose scissors");
                }
                computer = ram.nextInt(3);
                if (computer == 0)
                {
                    System.out.println("computer choose rock");
                }
                else if (computer == 1)
                {
                    System.out.println("computer choose paper");
                }
                else
                {
                    System.out.println("computer choose scissors");
                }
                while (computer == user) {
                    System.out.println("Match draw because of same type");
                    System.out.println("Try Again!");
                    System.out.println("press the number");
                    user = sc.nextInt();
                    while (user > 2)
                    {
                        System.out.println("Enter the number between 0 to 2");
                    }
                    if (user == rock)
                    {
                        System.out.println("User choose rock");
                    }
                    else if (user == paper)
                    {
                        System.out.println("User choose paper");
                    }
                    else
                    {
                        System.out.println("User choose scissors");
                    }
                    computer = ram.nextInt(3);
                    if (computer == rock)
                    {
                        System.out.println("computer choose rock");
                    }
                    else if (computer == paper)
                    {
                        System.out.println("computer choose paper");
                    }
                    else
                    {
                        System.out.println("computer choose scissors");
                    }

                }
                if (computer == rock)
                {
                    if (user == paper)
                    {
                        System.out.println("user wins");
                    } else
                    {
                        System.out.println("computer wins");
                    }
                } else if (computer == paper)
                {
                    if (user == scissors)
                    {
                        System.out.println("user wins");
                    } else
                    {
                        System.out.println("computer wins");
                    }
                } else if (computer == scissors)
                {
                    if (user == rock)
                    {
                        System.out.println("user wins");
                    } else
                    {
                        System.out.println("computer wins");
                    }
                }
                System.out.println("Do you want to play again then press yes otherwise no");
                play=sc.next();
            }

        }
    }

