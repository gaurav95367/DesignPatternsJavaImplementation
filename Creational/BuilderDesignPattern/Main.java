class Main {
    public static void main(String[] args){
        Director d = new Director(new WodenBuilder());
        House h = d.buildHouse();
        h.describeHouse();

        System.out.println("===================");
        Director d2 = new Director(new IglooBuilder());
        House h2 = d2.buildHouse();
        h2.describeHouse();

    }
}
