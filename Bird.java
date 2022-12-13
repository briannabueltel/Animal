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
}
