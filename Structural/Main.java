
 class Main {

    public static void main(String[] args){
        IBeverage beverage = new Coffee();
        System.out.println("beverage description ="+beverage.getDescription()+ "| beverage Price="+beverage.getPrice());

        beverage = new Cream(beverage);
        System.out.println("beverage description ="+beverage.getDescription()+ "| beverage Price="+beverage.getPrice());

        beverage = new Caramel(beverage);
        System.out.println("beverage description ="+beverage.getDescription()+ "| beverage Price="+beverage.getPrice());

    }
}
