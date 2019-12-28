package Console;

public enum Month {
    JANUARY(31,"WINTER"),
    FEBRUARY(28,"WINTER"),
    MARCH(31,"SPRING"),
    APRIL(30,"SPRING"),
    MAY(31,"SPRING"),
    JUNE(30,"SUMMER"),
    JULY(31,"SUMMER"),
    AUGUST(31,"SUMMER"),
    SEPTEMBER(30,"AUTUMN"),
    OCTOBER(31,"AUTUMN"),
    NOVEMBER(30,"AUTUMN"),
    DECEMBER(31,"WINTER");


    int inDays;
    String inSeasons;
    public int getInDays() {
        return inDays;
    }

    public void setInDays(int inDays) {
        this.inDays = inDays;
    }

    public String getInSeasons() {
        return inSeasons;
    }

    public void setInSeasons(String inSeasons) {
        this.inSeasons = inSeasons;
    }

    private Month(int inDays,	String inSeasons) {
        this.inDays = inDays;
        this.inSeasons = inSeasons;
    }
}