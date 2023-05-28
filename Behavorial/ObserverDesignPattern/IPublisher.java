interface IPublisher {
    void subscribe(ISubscriber subscriber);
    void unsubscribe(ISubscriber subscriber);
    void notifyAllSubscribers();

    IState getState();

    void setState(IState newState);
}
