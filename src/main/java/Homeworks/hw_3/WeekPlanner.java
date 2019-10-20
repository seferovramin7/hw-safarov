package Homeworks.hw_3;

import java.util.Scanner;

public class WeekPlanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[][] scedule = new String[7][2];
        scedule[0][0] = "Sunday";
        scedule[0][1] = "do home work";
        scedule[1][0] = "Monday";
        scedule[1][1] = "go to courses; watch a film";
        scedule[2][0] = "Tuesday";
        scedule[2][1] = "do home work";
        scedule[3][0] = "Wednesday";
        scedule[3][1] = "do home work";
        scedule[4][0] = "Thursday";
        scedule[4][1] = "go to courses; watch a film";
        scedule[5][0] = "Friday";
        scedule[5][1] = "go to courses; watch a film";
        scedule[6][0] = "Saturday";
        scedule[6][1] = "go to courses; watch a film";

        System.out.println("Please, input the day of the week:");
        String weekDay = scanner.nextLine();

        switch (weekDay){
            case "Sunday":
                System.out.printf("Your tasks for %s: %s.", scedule[0][0], scedule[0][1]);
            case "Monday":
                System.out.printf("Your tasks for %s: %s.", scedule[1][0], scedule[1][1]);
            case "Tuesday":
                System.out.printf("Your tasks for %s: %s.", scedule[2][0], scedule[2][1]);
            case "Wednesday":
                System.out.printf("Your tasks for %s: %s.", scedule[3][0], scedule[3][1]);
            case "Thursday":
                System.out.printf("Your tasks for %s: %s.", scedule[4][0], scedule[4][1]);
            case "Friday":
                System.out.printf("Your tasks for %s: %s.", scedule[5][0], scedule[5][1]);
            case "Saturday":
                System.out.printf("Your tasks for %s: %s.", scedule[6][0], scedule[6][1]);
        }

    }

}

//Sunday, Monday  Tuesday, Wednesday, Thursday, Friday, Saturday