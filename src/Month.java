public class Month {

     String name;
     Season season;
    public Month(String name, Season season) {
        this.name = name;
        this.season = season;
    }
    public String getName() {
        return name;
    }
    public Season getSeason() {
        return season;
    }
    @Override
    public String toString() {
        return name + season.getTranslation();
    }
}
