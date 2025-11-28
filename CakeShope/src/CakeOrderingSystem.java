import java.util.ArrayList;
import java.util.HashMap;

public class CakeOrderingSystem implements Subject {
    ArrayList<Observer> observers;
    HashMap<String, Integer> soldCounts;
    private volatile static CakeOrderingSystem uniqueInstance;
private Order order;

    private CakeOrderingSystem() {

        observers = new ArrayList<Observer>();
        soldCounts = new HashMap<String, Integer>();
    }

    // Double-checked locking singleton pattern
    public static CakeOrderingSystem getInstance() {
        if (uniqueInstance == null) {
            synchronized (CakeOrderingSystem.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new CakeOrderingSystem();
                }
            }
        }
        return uniqueInstance;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if (index >= 0) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(order,soldCounts);
        }
    }

    public void placeOrder(Order order) {
        this.order = order;
        recordSale(order);
        notifyObservers();
    }

    public void recordSale(Order order) {
        String cakeName = getNameCake(order);
        soldCounts.put(cakeName, soldCounts.getOrDefault(cakeName, 0) + 1);
    }

    private String getNameCake(Order order) {
        String nameCake = order.getCake().getDescription();
        String[] parts = nameCake.split(",");
        return parts[0];
    }

}

