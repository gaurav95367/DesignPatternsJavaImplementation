class State implements IState{

    private int temperature=0;
    private int humidity=0;


    @Override
    public IState getState() {
        return this;
    }

    @Override
    public void setState(IState newState) {
        if (newState instanceof State) {
            State state = (State) newState;
            this.temperature = state.temperature;
            this.humidity = state.humidity;
        }
    }

    //getters and setters
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

}
