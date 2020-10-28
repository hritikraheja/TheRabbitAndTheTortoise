package thread.rabbit;

public class Rabbit implements Runnable {

    private static final int MILESTONES = 5;

    private float raceTimeInSeconds = 0f;

    public float getRaceTimeInSeconds(){
        return raceTimeInSeconds;
    }

    private final Thread rabbit;

    public Rabbit() {
        this.rabbit = new Thread(this, "Rabbit");
    }

    public Thread getRabbit() {
        return rabbit;
    }

    @Override
    public void run() {
        for (int index = 0; index < MILESTONES; index++) {
            switch (index) {
                case 0:
                    System.out.println("The Rabbit has started from the start line!");
                    break;
                case 1:
                    System.out.println("The Rabbit has reached the Cool River!");
                    break;
                case 2:
                    System.out.println("The Rabbit has reached the Mountain Hill!");
                    break;
                case 3:
                    System.out.println("The Rabbit has reached the Big Oak Tree!");
                    System.out.println("The Rabbit is leading and hence is going to sleep!");
                    try {
                        Thread.sleep(9000L);
                        raceTimeInSeconds += 9;
                    } catch (InterruptedException e) {
                        System.err.println("The Rabbit's sleep got interrupted!");
                    }
                    break;
                case 4:
                    System.out.println("The Rabbit has reached the finish line!");
                    break;
            }
            try {
                Thread.sleep(1500L);
                raceTimeInSeconds += 1.5;
            } catch (InterruptedException e) {
                System.err.println("The rabbit has lost the path!");
            }
        }
    }
}
