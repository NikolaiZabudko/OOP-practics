package practica;

public class Main {
    public static void main(String[] args) {
        Season favoriteSeason = Season.SUMMER;
        System.out.println("Любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature() + "°C");
        System.out.println("Описание: " + favoriteSeason.getDescription());
        printFavoriteSeasonMessage(favoriteSeason);
        for (Season season : Season.values()) {
            System.out.println(season + ": Средняя температура " + season.getAverageTemperature() +
                    "°C, Описание: " + season.getDescription());
        }
    }
    private static void printFavoriteSeasonMessage(Season season) {
        switch (season) {
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }
}
