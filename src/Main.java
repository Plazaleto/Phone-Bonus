public class Main {
    public static void main(String[] args) {

        int point = 1; // бонус 1 рубль за каждые 100 руб пополнения
        int rubles = 1100; //  пополнение счета
        int invoice = 100; // начальная сумма на счету
        int bonus;
        if (rubles <= 1000) {
            bonus = 0;
        } else {
            bonus = rubles * point / 100;
        }
        int total = invoice + rubles + bonus;
        System.out.println(total);
    }
}