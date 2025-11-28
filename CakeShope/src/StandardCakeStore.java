public class StandardCakeStore extends CakeShope {
    @Override
    public Cake CreateCake(String type) {

        if (type.equalsIgnoreCase("apple")) {
            return new AppleCake();
        } else if (type.equalsIgnoreCase("cheese")) {
            return new CheeseCake();
        } else if (type.equalsIgnoreCase("chocolate")) {
            return new ChocolateCake();
        }

        throw new IllegalArgumentException("Unknown cake type: " + type);
    }

}
