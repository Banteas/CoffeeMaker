public enum CoffeeSize {

    SMALL(0.0),
    MEDIUM(0.5),
    LARGE(1.0);

    private final double extraCharge;

    CoffeeSize(double extraCharge){
        this.extraCharge = extraCharge;
    }

    public double getExtraCharge(){
        return extraCharge;
    }

}
