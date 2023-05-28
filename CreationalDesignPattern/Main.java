
 class Main {

    public static void main(String[] args){
        IFactory animalFactory = new RandomAnimalFactory();
        IAnimal animal1 = animalFactory.createAnimal();
        IAnimal animal2 = animalFactory.createAnimal();
        IAnimal animal3 = animalFactory.createAnimal();
        IAnimal animal4 = animalFactory.createAnimal();

        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();
        animal4.makeSound();

    }
}
