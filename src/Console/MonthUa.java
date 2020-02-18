package Console;

public enum MonthUa {
    Січень(31,"Зима"),
    Лютий(28,"Зима"),
    Березень(31,"Весна"),
    Квітень(30,"Весна"),
    Травень(31,"Весна"),
    Червень(30,"Літо"),
    Липень(31,"Літо"),
    Серпень(31,"Літо"),
    Вересень(30,"Осінь"),
    Жовтень(31,"Осінь"),
    Листопад(30,"Осінь"),
    Грудень(31,"Зима");

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

     MonthUa(int inDays,	String inSeasons) {
        this.inDays = inDays;
        this.inSeasons = inSeasons;
    }
}
