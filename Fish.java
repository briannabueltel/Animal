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

    public void eat(){
        if (!hungry) { 
            System.out.println("animal is full");
        } else {
            happy = true;
            energy = energy + 10;
            System.out.println("'Nom nom nom' Animal is happy to recieve nourishment"); 
        }
    }

    public void swim(){
        if(hasLegs && energy >=20) {
            energy = energy - 10;
            System.out.println("I love legs.");
        }
        if(hasLegs && energy <20) {
            System.out.println("I need to eat!");
        }
        if(!hasLegs && isFish==true) {
            energy = energy - 1;
            System.out.println("You mean you want me to do the thing I do literally every second of every day? Okay.");
        } 
        if(isSnake == true && energy >= 20) {
            System.out.println("'Help get me out I’m not an aquatic snake'"); 
            energy = energy - 20;
        }
        if(isSnake == true && energy < 20) {
            alive = false;
            System.out.println("Your snake has drowned, unfortunately");
        }
    }

    public void hunt(){
        if(!predator) {
            System.out.println("'Don’t make me do that'");
        } else {
            System.out.println("'Now I have something to eat’");
            energy = energy - 10;
        }
    }
}
