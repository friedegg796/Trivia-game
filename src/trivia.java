import java.util.Objects;
import java.util.Scanner;

public class trivia {
    public static void main(String[] args) {
        int point = 0;
        String reading1;
        String reading2;
        Scanner scanner = new Scanner(System.in); // Makes an input
        System.out.println("MATH TIME, WHAT'S 9 + 10?");
        int math1 = Integer.parseInt(scanner.nextLine());

        if (math1 == 19) {
            System.out.println("WINNER!!");
            point++;
            System.out.println("You have " + point + " point(s)");
        } else {
            System.out.println("NO, it's 19");
            System.out.println("You have " + point + " point(s)");
        }
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("BRAIN TIME, WHAT IS A HDD IN A PC USUALLY\n A: HARDDRIVE \n B: HARDMANGER \n C: BANANA");
        reading1 = scanner2.nextLine();

        if (Objects.equals(reading1, "A")) {
            System.out.println("WINNER!!");
            point++;
            System.out.println("You have " + point + " point(s)");
        } else {
            System.out.println("NO, it's A");
            System.out.println("You have " + point + " point(s)");

        }
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("BRAIN TIME 2, IS AN SSD OR AN HDD USUALLY FASTER \n A: HDD IS FASTER USUALLY \n B: SSD IS FASTER USUALLY \n C: Both are ok");
        reading2 = scanner3.nextLine();
        if (Objects.equals(reading2, "B")) {
            System.out.println("WINNER!!");
            point++;
            System.out.println("You have " + point + " point(s)");
        } else {
            System.out.println("NO, it's B");
            System.out.println("You have " + point + " point(s)");
        }

    }
}
