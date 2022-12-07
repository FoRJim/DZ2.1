public class Main {
    public static void main(String[] args) {
        int ticket = 500;
        int miles;
        if (ticket >= 20) {
            miles = ticket / 20;

        } else {
            miles = 0;
        }
        System.out.println("Цена билета состовляет: " + ticket + " руб.");
        System.out.println("Количество полученный миль будет: " + miles);
    }
}