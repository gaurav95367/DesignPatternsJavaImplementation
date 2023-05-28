import java.util.Random;

public class RandomAnimalFactory implements IFactory{
    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(2);
    }

    @Override
    public IAnimal createAnimal() {
        int randomNumber = getRandomNumber();
            if(randomNumber == 0)
                return new Lion();
            else if(randomNumber ==1)
                return new Dog();
        return null;
    }
}
