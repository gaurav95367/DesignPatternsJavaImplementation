class SilkFactory extends AbstractFactory{


    public SilkFactory() {
        super(new SilkShirtTailor(), new SilkPantsTailor());
    }
}
