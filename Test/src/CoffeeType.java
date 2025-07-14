public enum CoffeeType {

    ESPRESSO(2.0),
    LATTE(3.0),
    CAPPUCCINO(3.5);

    private final double basePrice;

    CoffeeType(double basePrice){
        this.basePrice = basePrice;
    }

    public double getBasePrice(){
        return basePrice;
    }

}
