package q2_365;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FootballScoreSubject scoreSubject = new FootballScoreSubject();
        LiveResultViewer viewer1 = new LiveResultViewer();
        LiveResultViewer viewer2 = new LiveResultViewer();

        scoreSubject.attach(viewer1);
        scoreSubject.attach(viewer2);

        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Enter football scores ");
        while (!(input = scanner.nextLine()).isEmpty()) {
            scoreSubject.notifyObservers(input);
        }
    }
}