public class Main {
    public static void main(String[] args) {
        int ticket_price = 13676; // стоимость билета
        int mile_price = 20; // стоимость одной бонусной мили
        int bonus_miles = ticket_price / mile_price; // количество бонусных миль за купленный билет
        System.out.println("За купленный билет начислено " + bonus_miles + " миль(я/и).");
    }
}
