public class Order {
    private Cake cake;
    // Static counter to generate unique order numbers
     private static  int count=1;
     private int numberOrder;

    public Order(Cake cake) {
        this.cake = cake;
        this.numberOrder = count++;
    }
    public Cake getCake() {
        return cake;
    }   
    public  int getNumberOrder() {
        return numberOrder;
    }

}
