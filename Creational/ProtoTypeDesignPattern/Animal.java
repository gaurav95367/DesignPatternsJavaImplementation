class Animal implements ICanbeColnned{
    String name;

    Animal(String name){
        this.name=name;
    }

    void describe(){
        System.out.println("name="+this.name);
    }

    @Override
    public ICanbeColnned deepClone() {
        Animal newAnimal = new Animal(this.name);
        return newAnimal;
    }

}
