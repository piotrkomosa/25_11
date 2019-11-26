import java.util.Arrays;

public enum Season {

    SPRING("Wiosna", new String[]{"marzec", "kwiecień", "maj"}),
    SUMMER("Lato", new String[]{"czerwiec", "lipiec", "sierpien"}),
    AUTUMN("Jesień", new String[]{"wrzesien", "pazdziernik", "listopad"}),
    WINTER("Zima", new String[]{"grudzień", "styczen", "luty"});

     String translation;
     String[] month;

    Season(String translation, String[] month) {
        this.translation = translation;
        this.month = month;
    }

    public String getTranslation() {
        return translation;
    }

    public String[] getMonth() {
        return month;
    }


    @Override
    public String toString() {
        return translation + ":" + getMonth();
    }
}
