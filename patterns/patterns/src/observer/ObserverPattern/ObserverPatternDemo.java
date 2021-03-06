package observer.ObserverPattern;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(6);
        System.out.println("Second state change: 99");
        subject.setState(99);
    }

}
