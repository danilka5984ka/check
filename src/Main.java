public class Main {

    public static void main(String[] args) {

        int check = 100;
        System.out.println("Текущий счёт: " + check);

        int put = 500;
        if (put < 1000) {
            check = put + check;
        } else {
            check = put/100 + check + put;
        }

        System.out.println("Обновлённый счёт: " + check);

    }
}