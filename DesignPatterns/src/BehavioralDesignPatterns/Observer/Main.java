package BehavioralDesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

// Observer interface
interface Observer {
    void update(String message);
}

// Concrete Observer
class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Merhaba " + name + ", " + message);
    }
}

// Observable interface
interface Observable {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// Concrete Observable
class Operator implements Observable {
    private List<Observer> users;
    private String message;

    public Operator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        users.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        users.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : users) {
            observer.update(message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();

        User user1 = new User("Kullanıcı 1");
        User user2 = new User("Kullanıcı 2");

        operator.registerObserver(user1);
        operator.registerObserver(user2);

        operator.setMessage("Beş aydır kontör yüklemeyen kullanıcılarımıza kampanya yapıyoruz!");
    }
}

