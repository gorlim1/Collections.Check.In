import java.util.ArrayList;
import java.util.Scanner;

public class HandsOnArrayList {

    ArrayList<String> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addStudent() {

        //System.out.println("Please enter at least five student names:");

        while (students.size() < 5) {

            System.out.println("Please enter at least five student names:");
            String scannedName = scanner.nextLine();
            students.add(scannedName);
        }

        System.out.println("\nThe students entered are:");
        System.out.println(students + "\n");

        System.out.println("Removing a student: " + students.get(2));
        students.remove(2);
        System.out.println("Students after removal: " + students + "\n");


        students.sort(String::compareToIgnoreCase);
        System.out.println("The sorted student list is: " + students);
    }
}
