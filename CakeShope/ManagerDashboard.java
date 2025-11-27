import java.util.HashMap;

public class MangerDashboard implements Observer, DisplayElement {
  
      CakeOrderingSystem  cakeOrderingSystem ;
      String name;
      int soldCount;
    public MangerDashboard(CakeOrderingSystem  cakeOrderingSystem) {
        this.cakeOrderingSystem = cakeOrderingSystem;
        cakeOrderingSystem.registerObserver(this);
    }


  

    @Override
    public void display() {
        System.out.println("Cake: " + name + ", Sold: " + soldCount);
    }



    @Override
    public void update(Order order, HashMap<String, Integer> soldCounts) {
       for (String cakeName : soldCounts.keySet()) {
        name = cakeName;
         soldCount = soldCounts.get(cakeName);
         display();
       }
    }
}