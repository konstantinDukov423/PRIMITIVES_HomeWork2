public class Main {
    public static void main(String[] args) {
        int balance = 100;  // Баланс клиента
        int buy = 100; // Покупки клиента
        int bonus; // Бонусы клиента
        if (buy >= 1000) {
            bonus = (buy / 100);
            balance = (balance + buy + bonus);
            System.out.println("Количество начисленных баллов: " + bonus);
            System.out.println("Ваш баланс: " + balance + " рублей");

        } else {
            balance = (buy + balance);
            System.out.println("К сожалению вам не начислены баллы");
            System.out.println("Ваш баланс: " + balance + " рублей");

        }

    }

}