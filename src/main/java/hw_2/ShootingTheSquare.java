package hw_2;

import java.util.Random;
import java.util.Scanner;

public class ShootingTheSquare {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int randomLine = random.nextInt(4) + 1;
            //System.out.println(randomLine);

            int randomBar = random.nextInt(4) + 1;
            //System.out.println(randomBar);

            System.out.println("All set. Get ready to rumble!");

            String[][] ui =
                    {{ "| 0 |", "| 1 |", "| 2 |", "| 3 |", "| 4 |", "| 5 |" },
                            { "| 1 |", "| - |", "| - |", "| - |", "| - |", "| - |" },
                            { "| 2 |", "| - |", "| - |", "| - |", "| - |", "| - |" },
                            { "| 3 |", "| - |", "| - |", "| - |", "| - |", "| - |" },
                            { "| 4 |", "| - |", "| - |", "| - |", "| - |", "| - |" },
                            { "| 5 |", "| - |", "| - |", "| - |", "| - |", "| - |" },
                    };

            for (int i = 0; i < ui.length; i++) {
                System.out.println(" ");
                for (int j = 0; j < ui.length; j++) {
                    System.out.print(ui[i][j] + " ");
                }
            }
            System.out.println("Enter a line number between 1 - 5");
            int userLine = scanner.nextInt();

            while(userLine > 5 || userLine < 1){
                System.out.println("Enter a line number between 1 - 5");
                userLine = scanner.nextInt();
            }

            System.out.println("Enter a bar number between 1 - 5");
            int userBar = scanner.nextInt();

            while(userBar > 5 || userBar < 1){
                System.out.println("Enter a bar number between 1 - 5");
                userBar = scanner.nextInt();
            }


            while (userLine != randomLine || userBar != randomBar){
                ui[userLine][userBar] = "| * |";
                for (int i = 0; i < ui.length; i++) {
                    System.out.println(" ");
                    for (int j = 0; j < ui.length; j++) {
                        System.out.print(ui[i][j] + " ");
                    }
                }
                System.out.println("Enter a line number between 1 - 5");
                userLine = scanner.nextInt();

                while(userLine > 5 || userLine < 1){
                    System.out.println("Enter a line number between 1 - 5");
                    userLine = scanner.nextInt();
                }

                System.out.println("Enter a bar number between 1 - 5");
                userBar = scanner.nextInt();

                while(userBar > 5 || userBar < 1){
                    System.out.println("Enter a bar number between 1 - 5");
                    userBar = scanner.nextInt();
                }
            }
            ui[userLine][userBar] = "| X |";
            System.out.print("You have won!");


            for (int i = 0; i < ui.length; i++) {
                System.out.println(" ");
                for (int j = 0; j < ui.length; j++) {
                    System.out.print(ui[i][j] + " ");
                }
            }
        }
    }

