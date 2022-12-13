public class Bird extends Animal{
    boolean hasLegs = true;
    boolean canFly = true;
    boolean predator = true;
    boolean alive = true;
    boolean hungry = false;
    int energy = 20;
    boolean isBird = true;
    public void Fly(){
        if(canFly == true && energy >=20) {
            System.out.println("I love flying!");
            energy = energy - 20;
        } else {
            System.out.println("I need to eat!");
        }
    }

    public void walk(){
        if(!hasLegs) {
            System.out.println("‘I don’t have legs I can’t walk!!!’");
        } else {
            energy = energy - 10;
            System.out.println("*step step* ‘Oh boy I sure do love walking!’"); 
        }
    }

    public void eat(){
        if (energy >=50) {
            hungry = false;
            System.out.println("animal is full");
            happy = true;
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
