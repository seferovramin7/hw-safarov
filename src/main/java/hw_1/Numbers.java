package hw_1;

import java.util.Random;
import java.util.Scanner;

public class Numbers {


        public static void main(String[] args) {
            Random random = new Random();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String userName = scanner.nextLine();
            System.out.println("Let the game begin!");
            System.out.println("Username is: " + userName);
            int rnd = random.nextInt(100);
            //System.out.println(rnd);

            System.out.print("Enter a number: ");
            Integer enteredNum = scanner.nextInt();


            Boolean compare = true;
            if(enteredNum != rnd){
                compare = true;
            }
            else if(compare){
                compare = false;
                System.out.println("Congratulations, " + userName);
            }

            while(compare){
                if (enteredNum < rnd) {
                    System.out.println("Your number is too small. Please, try again.");
                    System.out.print("Enter a number again: ");
                    enteredNum = scanner.nextInt();
                }else if(enteredNum > rnd){
                    System.out.println("Your number is too big. Please, try again.");
                    System.out.print("Enter a number again: ");
                    enteredNum = scanner.nextInt();
                }else{
                    System.out.print("Congratulations, " + userName);
                    compare = false;
                }
            }


        }
    }


