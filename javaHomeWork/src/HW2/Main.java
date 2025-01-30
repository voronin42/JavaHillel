package HW2;

public class Main {
        public static void main(String[] args) {
            //переменние
            int orderNum;
            String clientName;
            String prodName;
            String adress;
            double price;

            //order #1
            orderNum = 1;
            clientName = "Alice";
            prodName = "smartphone";
            price = 305.99;
            adress = "Moon Street 10";

            //order info1

            System.out.println("Order No " + orderNum + " Client: " + clientName + ".");
            System.out.println("Product: " + prodName + ",");
            System.out.println("price EUR " + price + ".");
            System.out.println("Address: " + adress + ".");

            //order #2
            orderNum = 2;
            clientName = "Tom";
            prodName = "laptop";
            price = 570.95;
            adress = "Terra Street 17";


            // order info2
            System.out.println("Order No " + orderNum + " Client: " + clientName + ".");
            System.out.println("Product: " + prodName + ",");
            System.out.println("price EUR " + price + ".");
            System.out.println("Address: " + adress + ".");
        }
}
