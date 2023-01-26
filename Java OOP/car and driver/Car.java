public class Car {
    public int gas = 10;

    public void getGasStatus() {
        if(gas <= 0){
            System.out.println("game over.");
        }
        System.out.println("Gas remaining: "+gas+"/10");
    }
}