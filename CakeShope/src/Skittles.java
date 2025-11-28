 public class Skittles extends CondementDecorator{
        Cake cake;
        public Skittles(Cake cake){
            this.cake=cake;
        }

        @Override
        public String getDescription() {
            return cake.getDescription()+",Skittles ";
        }

        @Override
        public double cost() {
            return cake.cost()+5.0;
        }   
    }