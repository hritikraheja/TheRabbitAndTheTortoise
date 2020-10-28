package thread.tortoise;

public class Tortoise implements Runnable {
    private static final int milestones = 5;
    private final Thread tortoise;

    private float raceTimeInSeconds = 0f;

    public float getRaceTimeInSeconds(){
        return raceTimeInSeconds;
    }

    public Tortoise() {
        this.tortoise = new Thread(this,"Tortoise");
    }

    public Thread getTortoise(){
        return tortoise;
    }

    @Override
    public void run() {
        for(int index = 0; index < milestones; index++){
            switch(index) {
                case 0:
                    System.out.println("The Tortoise has started from the start line!");
                    break;
                case 1:
                    System.out.println("The Tortoise has reached the Cool River!");
                    break;
                case 2:
                    System.out.println("The Tortoise has reached the Mountain Hill!");
                    break;
                case 3:
                    System.out.println("The Tortoise has reached the Big Oak Tree!");
                    break;
                case 4:
                    System.out.println("The Tortoise has reached the finish line!");
                    break;
            }
            try {
                Thread.sleep(3000L);
                raceTimeInSeconds += 3;
            } catch (InterruptedException ie){
                System.out.println("The Tortoise has lost his path");
            }

        }
    }
}
