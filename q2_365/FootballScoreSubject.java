package q2_365;

import java.util.ArrayList;
import java.util.List;

class FootballScoreSubject {
    private List<FootballScoreObserver> observers = new ArrayList<>();

    public void attach(FootballScoreObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(String score) {
        for (FootballScoreObserver observer : observers) {
            observer.update(score);
        }
    }
}