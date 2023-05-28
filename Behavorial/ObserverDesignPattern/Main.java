public class Main {

    public static void main(String[] args){
        State state = new State();
        Publisher publisher1 = new Publisher();
        publisher1.name="publisher1";


        Subscriber1 subscriberA = new Subscriber1();
        subscriberA.name="SubscriberA";
        subscriberA.publisher=publisher1;

        Subscriber1 subscriberB = new Subscriber1();
        subscriberB.name="SubscriberB";
        subscriberB.publisher=publisher1;


        publisher1.subscribe(subscriberA);
        publisher1.subscribe(subscriberB);
        state.setTemperature(100);

        publisher1.setState(state);

    }
}
