abstract class AbstractBeverage implements IBeverage{
    String description;
    int price;

    AbstractBeverage(String description, int price){
        this.description=description;
        this.price=price;
    }
    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
