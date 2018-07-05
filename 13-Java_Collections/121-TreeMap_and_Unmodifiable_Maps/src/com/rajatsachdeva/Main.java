package com.rajatsachdeva;

public class Main {

    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.5, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);
        System.out.println();

        for (String s : stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket rajatsBasket = new Basket("Rajat");

        sellItem(rajatsBasket, "car", 1);
        System.out.println(rajatsBasket);

        sellItem(rajatsBasket, "car", 1);
        System.out.println(rajatsBasket);

        if (sellItem(rajatsBasket, "car", 1) != 1) {
            System.out.println("There are no more cars to sell");
        }
        sellItem(rajatsBasket, "item that does not exists", 1);
        System.out.println(rajatsBasket);

        sellItem(rajatsBasket, "juice", 4);
        sellItem(rajatsBasket, "cup", 12);
        sellItem(rajatsBasket, "bread", 1);
        System.out.println(rajatsBasket);

        System.out.println(stockList);

        // Following generates an exception as we are adding element in an Unmodifiable Map
        temp = new StockItem("pen", 1.12);
        stockList.Items().put(temp.getName(), temp);
    }

    public static int sellItem(Basket basket, String item, int quantity) {
        // retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }

        if (stockList.sellStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0; // didn't have sufficient quantity to sell
    }
}
