package HW4.app.app;

public class Main {
    public static void main(String[] args) {
        //данные про товары
        String[] productname1 = {"smarthpone"};
        String[] productname2 ={"laptop"};

        int[] days1 = {5};
        int[] days2 = {7};
        double [] sales1 = {12153,41};
        double [] sales2 = {10486,85};
        // расчет цен
        double smartperday = sales1[0] / days1[0];
        double laptopperday1 = sales2[0] / days2[0];

        // результаты
        System.out.println("Product No 1: " + productname1[0]);
        System.out.printf("Total sales for %d days is EUR %.2f\n", days1[0], sales1[0]);
        System.out.printf("Sales by day is EUR %.2f\n", smartperday);

        System.out.println("Product No 2: " + productname2[0]);
        System.out.printf("Total sales for %d days is EUR %.2f\n", days2[0], sales2[0]);
        System.out.printf("Sales by day is EUR %.2f\n", laptopperday1);
    }
}
