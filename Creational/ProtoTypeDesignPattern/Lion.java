class Lion extends Animal{
    int weight;
    Lion(String name, int weight) {
        super(name);
        this.weight=weight;
    }
@Override
    void describe(){
        System.out.println("name="+this.name  + "weight="+this.weight);
    }

    //NOTE : either make Animal class to be abstract or must override deepClone in every child classes
    @Override
    public ICanbeColnned deepClone() {
        Lion newAnimal = new Lion(this.name,this.weight);
        return newAnimal;
    }
}
