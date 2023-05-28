import java.util.ArrayList;
import java.util.List;

public class AbstractPublisher implements IPublisher{
    List<ISubscriber> subscriberList ;
    IState state;
    String name;

    AbstractPublisher(){
        state = new State();
        subscriberList = new ArrayList<>();
        name="";
    }
    @Override
    public void subscribe(ISubscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribe(ISubscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifyAllSubscribers() {
        for(int i=0;i< subscriberList.size();i++){
            ISubscriber subscriber = subscriberList.get(i);
            subscriber.actionOnNotify();
        }
    }

    @Override
    public IState getState() {
        return state;
    }

    @Override
    public void setState(IState newState) {
        state.setState(newState);
        notifyAllSubscribers();
    }
}
