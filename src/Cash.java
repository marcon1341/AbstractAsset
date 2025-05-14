public class Cash extends Asset {
    public Cash(String description, String dateAcquired, double amount) {
        super(description, dateAcquired, amount);
    }
    @Override
    public double getValue(){
        return getOriginalCost();
    }
}
