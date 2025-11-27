public class CustomerDashboard implements Observer, DisplayElement{
    private Order order;
    CakeOrderingSystem cakeOrderingSystem;
    @Override
    public void update(Order order){
        cakeOrderingSystem=CakeOrderingSystem.getInstance();
        cakeOrderingSystem.registerObserver(this);
        this.order=order;
        disiplay();
    }
     public void disiplay(){
        system.out.println("your order is ready!"
        +order.getCake().getDescription()+
        "("orders+order.getnumberOrder+")");

        
     }

}
