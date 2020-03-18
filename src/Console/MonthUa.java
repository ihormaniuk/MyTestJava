package Console;

public enum MonthUa {
    Січень(31,Seasons.Зима),
    Лютий(28,Seasons.Зима),
    Березень(31,Seasons.Весна),
    Квітень(30,Seasons.Весна),
    Травень(31,Seasons.Весна),
    Червень(30,Seasons.Літо),
    Липень(31,Seasons.Літо),
    Серпень(31,Seasons.Літо),
    Вересень(30,Seasons.Осінь),
    Жовтень(31,Seasons.Осінь),
    Листопад(30,Seasons.Осінь),
    Грудень(31,Seasons.Зима);

    int days;
    Seasons seasons;
    public int getDays() {
        return days;
    }

    public Seasons getSeasons() {
        return seasons;
    }

     MonthUa(int days,Seasons seasons) {
        this.days = days;
        this.seasons = seasons;
    }
}
