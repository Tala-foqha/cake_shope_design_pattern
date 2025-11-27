public class Order {
    private Cake cake;
    private static int count=1;
    private int numberOfOrder;
    public Order(Cake cake){
cake=this.cake;
this.numberOfOrder=count++;
    }
public getCake(){
    return cake();
}
public int getnumberOrder(){
    return numberOfOrder;
}

}
