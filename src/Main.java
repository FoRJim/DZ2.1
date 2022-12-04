public class Main {
    public static void main(String[] args) {
        int ticket = 4000;
        System.out.println("Цена билета состовляет: " + ticket + " руб.");
        int miles;
        if (ticket >= 20) {
            miles = ticket / 20;
            System.out.println("Количество полученный миль будет: " + miles);
        } else {
            System.out.println("Количество полученный миль будет: 0");
        }
    }
}