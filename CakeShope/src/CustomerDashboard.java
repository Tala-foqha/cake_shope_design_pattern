import java.util.HashMap;


public class CustomerDashboard implements Observer, DisplayElement {
    private Order order;
    CakeOrderingSystem  cakeOrderingSystem ;


    public CustomerDashboard( CakeOrderingSystem  cakeOrderingSystem) {
        this.cakeOrderingSystem = cakeOrderingSystem;
        cakeOrderingSystem.registerObserver(this);
    }
    @Override
    public void update(Order order, HashMap<String, Integer> soldCounts) {
        this.order = order;
        disiplay();
    }

    @Override
    public void disiplay() {
        System.out.println("Your order is ready: "
                + order.getCake().getDescription()
                + " (Order#" + order.getNumberOrder() + ")");
    }
}