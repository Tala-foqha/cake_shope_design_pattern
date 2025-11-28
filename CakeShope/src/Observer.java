import java.util.HashMap;

public interface Observer {
    void update(Order order,HashMap<String, Integer> soldCounts);
     
}