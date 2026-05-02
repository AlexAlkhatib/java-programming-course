package main;

import inventory.Product;
import inventory.Inventory;
import inventory.Warehouse;

public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.setProductId(1001);
        product.setProductName("Laptop");
        product.setPrice(1200.0);

        Inventory inventory = new Inventory();
        inventory.setProduct(product);
        inventory.setQuantity(5);

        Warehouse warehouse = new Warehouse();
        warehouse.setWarehouseId(1);
        warehouse.setWarehouseName("Main Warehouse");
        warehouse.setInventories("Placeholder");

        System.out.println("Product ID: " + product.getProductId() + ", Name: " + product.getProductName() + ", Price: " + product.getPrice());
        System.out.println("Inventory Quantity: " + inventory.getProduct());
        System.out.println("Warehouse ID: " + warehouse.getWarehouseId() + ", Name: " + warehouse.getWarehouseName());
    }
}