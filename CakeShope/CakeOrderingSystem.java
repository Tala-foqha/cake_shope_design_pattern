public class CakeOrderingSystem implements Subject {
    private volatile static CakeOrderingSystem uninqueInstance;
    private ArrayList<Observer> observers;

    private CakeOrderingSystem(){
    observers =new ArrayList<Observer>();
    HashMap<String,Integer>soldCounts;
    }
    //Doble-cheaked locking pattern
    public static CakeOrderingSystem getInstance(){
        if(uninqueInstance==null){
            synchronized(CakeOrderingSystem.class){
                if(uninqueInstance==null){
                    uninqueInstance=new CakeOrderingSystem();
                }
            }
        }
        return uninqueInstance;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        
        
    }

    @Override
    public void removeObserver(Observer o) {
        int i=observers.indexOf(o);
        if(index>=0){
            observers.remove();
        }
        
    }

    @Override
    void notifyObservers(Order order){
        for(Observer o:observers){
       o.update(order);

        }

    }
    public void placeOrders(Order order){
        notifyObservers(order);
    }
    public void recordSale(Order order){
        String cakeName=getNameCake(order);
        soldCounts.put(cakeName,soldCounts.getOrDefault(cakeName,defaultvalue:0)+1);
    }
        
    String getNameCake(Order order){                                  
        String nameCake=order.getNameCake().getDescription();
        String parts=nameCake.split(regex:",");
        return part[0];
    }
    
}

