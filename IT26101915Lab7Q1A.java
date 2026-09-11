import java.util.Scanner;

public class IT26101915Lab7Q1A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        int mark1 = input.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int mark2 = input.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int mark3 = input.nextInt();

        System.out.print("Enter marks for Subject 4: ");
        int mark4 = input.nextInt();

        double average = (mark1 + mark2 + mark3 + mark4) / 4.0;

        System.out.println("Average = " + average);

        if (average >= 75) {
            System.out.println("Grade = Distinction");
        }
        else if (average >= 50) {
            System.out.println("Grade = Credit");
        }
        else {
            System.out.println("Grade = Fail");
        }
    }
}

