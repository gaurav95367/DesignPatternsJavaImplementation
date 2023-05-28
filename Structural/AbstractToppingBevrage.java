abstract class AbstractToppingBeverage implements IBeverage{
    String description;
    int price;
    protected IBeverage beverage;

    public AbstractToppingBeverage(String description, int price, IBeverage beverage) {
        this.description = description;
        this.price = price;
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+ " + "+this.description;
    }

    @Override
    public int getPrice() {
        return this.price+beverage.getPrice();
    }
}
