abstract class AbstractFactory implements IFactory{
    IShirtTailor shirtTailor;
    IPantsTailor pantsTailor;

    public AbstractFactory(IShirtTailor shirtTailor, IPantsTailor pantsTailor) {
        this.shirtTailor = shirtTailor;
        this.pantsTailor = pantsTailor;
    }

    @Override
    public void createShirt() {
        shirtTailor.createShirt();
    }

    @Override
    public void createPants() {
        pantsTailor.createPants();
    }
}
