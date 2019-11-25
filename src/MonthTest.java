import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MonthTest {

    public static void main(String[] args) {

        Month december = new Month("Grudzień", Season.WINTER);
        Month january = new Month("Styczeń", Season.WINTER);
        Month february = new Month("Luty", Season.WINTER);
        Month march = new Month("Marzec", Season.SPRING);
        Month april = new Month("Kwiecień", Season.SPRING);
        Month may = new Month("Maj", Season.SPRING);
        Month june = new Month("Czerwiec", Season.SUMMER);
        Month july = new Month("Lipiec", Season.SUMMER);
        Month august = new Month("Sierpień", Season.SUMMER);
        Month september = new Month("Wrzeisń", Season.AUTUMN);
        Month october = new Month("Paździenik", Season.AUTUMN);
        Month november = new Month("Listopad", Season.AUTUMN);
        List<Month> months = Arrays.asList(december, january, february, march, april, may, june, july, august, september, october, november, december);
        creteMonth(months);
    }
    private static void creteMonth(List<Month> months) {
        System.out.println("Podaj nazwe pory roku");
        Season[] seasons = Season.values();
        System.out.println(Arrays.toString(seasons));
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        Season season = Season.valueOf(user);
        try {
            season = Season.valueOf(user);
        } catch (IllegalArgumentException e) {
            for (Season s : seasons) {
                if (s.getTranslation().equalsIgnoreCase(user)) {
                    season = s;
                    break;
                }
            }
        }
        if (season != null) {
            System.out.println("miesiące należace do sezonu");
            for (Month month : months) {
                if (month.getSeason() == season) {
                    System.out.println(month);
                }
            }
        } else {
            System.out.println("nie ma takiego sezonu");
        }
    }
}



