public class MyCakeShop extends CakeShope {


    @Override
    public Cake CreateCake(String type) {
        if (type.equalsIgnoreCase("CheeseCake")) {
            return new CheeseCake();
        } else if (type.equalsIgnoreCase("ChocolateCake")) {
            return new ChocolateCake();
        } else if (type.equalsIgnoreCase("AppleCake")) {
            return new AppleCake();
        } else {
            throw new IllegalArgumentException("Unknown cake type: " + type);
        }
    }

}
