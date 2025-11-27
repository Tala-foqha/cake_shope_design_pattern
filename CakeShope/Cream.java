 public class Cream extends CondementDecorator{
        Cake cake;
        public Cream(Cake cake){
            cake=this.cake;
        }

        @Override
        public String getDescription() {
            return cake.getDescription()+",Cream ";
        }

        @Override
        public double cost() {
            return cake.cost()+3.0;
        }}