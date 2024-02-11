package q2_365;

class LiveResultViewer implements FootballScoreObserver {
    @Override
    public void update(String score) {
        System.out.println("Live result: " + score);
    }
}
