package java;

public class Seasons {

    public static void main(String[] args) {
        System.out.println(defineSeason("April"));
        System.out.println(defineSeason("August"));
        System.out.println(defineSeason("September"));
        System.out.println(defineSeason("January"));
        System.out.println(defineSeason("Sechen"));
        System.out.println(defineSeason(""));
    }

    private static String defineSeason(String month) {
        return switch (month) {
            case "Marsh", "April", "May" -> "Spring";
            case "Jane", "Julay", "August" -> "Summer";
            case "September", "October", "November" -> "Autumn";
            case "December", "January", "February" -> "Winter";
            default -> "No data";
        };
    }
}
