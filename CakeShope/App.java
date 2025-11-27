
public class TestCakeShop {

  public static void main(String[] args) {

    CakeOrderingSystem cakeOrderingSystem = CakeOrderingSystem.getInstance();
    CustomerDashboard customerDashboard = new CustomerDashboard(cakeOrderingSystem);
    MangerDashboard mangerDashboard = new MangerDashboard(cakeOrderingSystem);
    CakeShop myCakeShop = new MyCakeShop();
    Cake cake = myCakeShop.orderCake("CheeseCake");
    cake = new Cream(cake);
    cake = new Skittles(cake);
    Order order1 = new Order(cake);
    cakeOrderingSystem.placeOrder(order1);
    Cake cake2 = myCakeShop.orderCake("AppleCake");
    cake2 = new Cream(cake2);

    Order order2 = new Order(cake2);
    cakeOrderingSystem.placeOrder(order2);
 Cake cake3 = myCakeShop.orderCake("CheeseCake");
    cake3 = new Cream(cake3);
    cake3 = new Skittles(cake3);
    Order order3 = new Order(cake3);
    cakeOrderingSystem.placeOrder(order3);
     Cake cake4 = myCakeShop.orderCake("CheeseCake");
    cake4 = new Cream(cake4);
    cake4 = new Skittles(cake4);
    Order order4 = new Order(cake4);
    cakeOrderingSystem.placeOrder(order4);
  }

}
