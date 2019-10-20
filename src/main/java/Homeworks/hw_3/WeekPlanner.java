package Homeworks.hw_3;

import java.util.Scanner;

public class WeekPlanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[][] scedule = new String[7][2];
        scedule[0][0] = "Sunday";
        scedule[0][1] = "Make your weekly plan, play the guitar";
        scedule[1][0] = "Monday";
        scedule[1][1] = "Continue learning java, watch tv";
        scedule[2][0] = "Tuesday";
        scedule[2][1] = "Make your university homeworks, walk";
        scedule[3][0] = "Wednesday";
        scedule[3][1] = "Get together with your friends, prepare dinner";
        scedule[4][0] = "Thursday";
        scedule[4][1] = "Be ready for workshop, have a dinner with family";
        scedule[5][0] = "Friday";
        scedule[5][1] = "Take online courses about java, practise much";
        scedule[6][0] = "Saturday";
        scedule[6][1] = "go to IBAtech, take a coffe";

        System.out.println("Please, input the day of the week:");
        String weekDay = scanner.nextLine();


        while (!weekDay.equals("Exit")) {
            switch (weekDay) {
                case "Sunday":
                    System.out.printf("Your tasks for %s: %s. \n", scedule[0][0], scedule[0][1]);
                    System.out.println("Please, input the day of the week:");
                    weekDay = scanner.nextLine();
                    break;
                case "Monday":
                    System.out.printf("Your tasks for %s: %s. \n", scedule[1][0], scedule[1][1]);
                    System.out.println("Please, input the day of the week:");
                    weekDay = scanner.nextLine();
                    break;
                case "Tuesday":
                    System.out.printf("Your tasks for %s: %s. \n", scedule[2][0], scedule[2][1]);
                    System.out.println("Please, input the day of the week:");
                    weekDay = scanner.nextLine();
                    break;
                case "Wednesday":
                    System.out.printf("Your tasks for %s: %s. \n", scedule[3][0], scedule[3][1]);
                    System.out.println("Please, input the day of the week:");
                    weekDay = scanner.nextLine();
                    break;
                case "Thursday":
                    System.out.printf("Your tasks for %s: %s. \n", scedule[4][0], scedule[4][1]);
                    System.out.println("Please, input the day of the week:");
                    weekDay = scanner.nextLine();
                    break;
                case "Friday":
                    System.out.printf("Your tasks for %s: %s.\n", scedule[5][0], scedule[5][1]);
                    System.out.println("Please, input the day of the week:");
                    weekDay = scanner.nextLine();
                    break;
                case "Saturday":
                    System.out.printf("Your tasks for %s: %s. \n", scedule[6][0], scedule[6][1]);
                    System.out.println("Please, input the day of the week:");
                    weekDay = scanner.nextLine();
                    break;
                case "Exit":
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.\n");
                    System.out.println("Please, input the day of the week:");
                    weekDay = scanner.nextLine();
            }
        }
        System.out.println("Program has ended");

    }

}

//Sunday, Monday  Tuesday, Wednesday, Thursday, Friday, Saturday