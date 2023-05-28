
 class Main {

    public static void main(String[] args){
        IFactory factory1 = new SilkFactory();
        factory1.createPants();
        factory1.createShirt();

        IFactory factory2 = new WollenFactory();
        factory2.createPants();
        factory2.createShirt();

    }
}
