package lab8.task3.interfaces;

public interface TransportSubject {
    void registerObserver(TransportObserver observer);
    void removeObserver(TransportObserver observer);
    void notifyObservers();
}
