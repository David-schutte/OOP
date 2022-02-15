package nl.saxion.oop.week1;

import java.util.ArrayList;

public class BingoMill {
    ArrayList<Integer> balls = new ArrayList();
    public BingoMill() {
        for (int i=0;i<75;i++) {
            balls.add(i, i);
        }
    }


    public int draw(int ball) {
        int drawn = balls.get(ball);
        balls.remove(ball);
        return drawn;
    }

    public int getNumberOfBallsRemaining() {
        return balls.size();
    }
    public void reset() {
        balls.clear();
    }
}
