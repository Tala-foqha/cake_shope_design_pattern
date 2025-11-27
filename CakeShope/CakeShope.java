public abstract class CakeShope {
        
public Cake OrderCake(String type){
  Cake cake=CreateCake(type);
    return cake;
}
 public abstract Cake CreateCake(String type);

}
