package com.techtorial;

public class Products {

    /*
     * Please add more vending machine features
     * - Buy a product
     * - Search for a product
     * - Get list of products
     */

    private static String[] products = new String[]{"Monitor", "Mouse", "Keyboard", "USB cable", "Charger", "Mouse pad"};
    private static int[] prices = new int[]{100, 70, 89, 17, 99, 5};
    private static int[] inventory = new int[]{4, 10, 5, 10, 5, 7};
    // 1-> Create a method to just display all product names in vending machine
// 2->Create a method to display product name, price and inventory at the same time.
/* 3->We should create a method that takes two parameters for price range and shows
 all the products in this range. */


    public static String[] getAllPrices() {
        System.err.println("Product: price");
        for (int j = 0; j < products.length; j++) {
            System.out.println(products[j] + ": $" + prices[j]);
        }
        return products;
    }

    public static int getProductPrice(String productName) {

        return -1;
    }

    public static void selectProduct(String productName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].toLowerCase().equals(productName.toLowerCase())) {
                System.out.println(products[i] + " price is: $" + prices[i]);
            }

            //loop over the product list to find out if it is available in our vending machine
            //if yes find the price (tip: call a specific method)
            //and verify this product is available in inventory
            //ask if customer wants to buy it -> if yes call another method to buy a product
//											-> if no call method to cancel it
            //to cancel the method use(return;)
        }
    }

    public static void buyAProduct(String productName) {

        /*
        Apply payment logic.
        Apply give back change logic
        Apply inventory update logic: if someone buys an item, we should decrement number of available items.
         */
    }

    public static void getProducts() {
        for (int a = 0; a < products.length; a++) {
            System.out.println(products);
        }

    }
}
