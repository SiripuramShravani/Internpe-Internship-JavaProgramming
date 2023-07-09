import java.util.Scanner;
import java.util.Random;
    public class Task3 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String runagain="yes";
            while(runagain.equals("yes"))
            {
                Random randnum=new Random();
                int randnumber=randnum.nextInt(100);
                int number=-1;
                int tries=0;
                while(number!=randnumber)
                {
                    System.out.print("Guess the number between 1 to 100: ");
                    number=sc.nextInt();
                    tries++;
                    if(number==randnumber)
                    {
                        System.out.println("wow! you guessed the number!");
                        System.out.println("you took the "+tries+" tries to guess the number");
                        System.out.print("Do you want to guess the number again! ");
                        runagain=sc.next().toLowerCase();
                    }
                    else if(number<randnumber)
                    {
                        System.out.println("the number is very low, try again! ");
                    }
                    else
                    {
                        System.out.println("the number is very high, try again! ");
                    }
                }
            }
            sc.close();
        }
    }


