public class AbstractAnimal implements IAnimal{
    String name;
    String sound;

    public AbstractAnimal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    @Override
    public void makeSound() {
        System.out.println("Name="+this.name+" sound="+this.sound);
    }
}
