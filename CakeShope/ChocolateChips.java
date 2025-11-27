 public class ChocolateChips extends CondementDecorator{
        Cake cake;
        public ChocolateChips(Cake cake){
            cake=this.cake;
        }

        @Override
        public String getDescription() {
            return cake.getDescription()+",ChocolateChips ";
        }

        @Override
        public double cost() {
            return cake.cost()+7.0;
        }   
    }