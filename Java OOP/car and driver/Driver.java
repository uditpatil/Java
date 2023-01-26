public class Driver extends Car{
    public void drive(){
        gas--;
        System.out.println("You drive the car.");
        getGasStatus();
    }

    public void boost(){
        if(gas >= 3){
            gas -= 3;
            System.out.println("You used car boosters.");
            getGasStatus();
        }
        else{
            System.out.println("You can't use boosters, not enough gas.");
        }
    }

    public void refuel(){
        if(gas <= 8){
            gas += 2;
            System.out.println("You refueled the car");
            getGasStatus();
        }
        else{
            System.out.println("You don't need to refuel");
        }
    }
}