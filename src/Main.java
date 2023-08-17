public class Main {
    public static void main(String[] args) {
        int ticketPrice = 13676; // стоимость билета
        int milePrice = 20; // стоимость одной бонусной мили
        int bonus = ticketPrice / milePrice; // количество бонусных миль за купленный билет
        System.out.println("За купленный билет начислено " + bonus + " миль(я/и).");
    }
}