import sun.awt.SunHints;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MonthTest {

    public static void main(String[] args) {

        System.out.println("Podaj nazwe pory roku");
        printMonths();


    }
    private static void printMonths() {
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        Season season = Season.valueOf(user);

        scanner.close();
        switch (season){
            case WINTER:
                System.out.println(Season.WINTER);
                break;
            case SPRING:
                System.out.println(Season.SPRING);
                break;
            case SUMMER:
                System.out.println(Season.SUMMER);
                break;
            case AUTUMN:
                System.out.println(Season.AUTUMN);
                break;
                default:{
                    System.out.println("nie ma takiej pory roku");
                }
        }
    }
    
}




