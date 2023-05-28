class WollenFactory extends AbstractFactory{
    public WollenFactory() {
        super(new WollenShirtTailor(), new WollenPantsTailor());
    }

}
