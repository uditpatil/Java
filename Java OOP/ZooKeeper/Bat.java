public class Bat extends Mammal{
    public Bat(){
        super(300);
    }

    public void fly(){
        System.out.println("Bat is flying, fewwww");
        energyLevel -= 50;
        displayEnergy();
    }

    public void eatHumans(){
        System.out.println("Well, Bat eat a human");
        energyLevel += 25;
        displayEnergy();
    }

    public void attackTown(){
        System.out.println("Bat is attacking towm, run for your life");
        energyLevel -= 100;
        displayEnergy();
    }
}