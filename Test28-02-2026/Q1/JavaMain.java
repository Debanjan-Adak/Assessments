package test_28_02_2026;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

abstract class FoodItem {
	private int id;
    private String name;
    private double price;

    public FoodItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() { 
    	return this.id;
    	}
    public String getName() { 
    	return this.name; 
    	}
    public double getPrice() { 
    	return this.price;
    	}

    public abstract double calculateDiscount();

    public double getFinalPrice() {
        return price - calculateDiscount();
    }

}
class VegItem extends FoodItem {

    public VegItem(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }
}
class NonVegItem extends FoodItem {

    public NonVegItem(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

class Order {
    private List<FoodItem> items = new ArrayList<>();

    public void addItem(FoodItem item) {
        items.add(item);
    }

    public double calculateTotalBill() {
        double total = 0;
        for (FoodItem item : items) { 
            total += item.getFinalPrice();
        }
        return total;
    }
}
public class JavaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	FoodItem v1 = new VegItem(1, "Sourav Soyabean Biriyani", 200);
	        FoodItem n1 = new NonVegItem(2, "Swastik Kadhai Chicken", 300);

	        Order order = new Order();
	        order.addItem(v1);
	        order.addItem(n1);

	        System.out.println("Total Bill: " + order.calculateTotalBill());

	}

}
