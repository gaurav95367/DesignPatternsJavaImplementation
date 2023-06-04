class Main {
    public static void main(String[] args){
        Lion l1 = new Lion("simba",100);
        Animal l2 = (Animal) l1.deepClone();
        l1.weight=50;
        l1.describe();
        l2.describe();


    }
}
