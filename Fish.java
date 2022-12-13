public class Fish extends Animal {
    boolean inWater;
    int flopLuck;
    boolean hasLegs = false;
    boolean canFly = false;
    boolean predator = true;
    boolean alive = true;
    boolean isFish = true;
    public void fishOutOfWater() {
        inWater = false;
        if (!inWater) {
            flopLuck = (int) (Math.random()*10);
            if (flopLuck >= 7) {
                alive = true;
                System.out.println("fish has flopped to safety!");
                energy = energy - 30;
                if (energy <= 0) {
                    alive = false;
                }
            } else {
                alive = false;
                System.out.println("fish has suffocated.");
            }

        }
    }
}
