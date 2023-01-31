public class Calculator{
    private double num1;
    private double num2;
    private String operation;
    private double result;

    public Calculator(){

    }

    public void setOperandOne(double num1){
        this.num1 = num1;
    }

    public void setOperandTwo(double num2){
        this.num2 = num2;
    }

    public void setOperation(String operation){
        this.operation = operation;
    }

    public void performOperation(){
        if(this.operation == "+"){
            result = num1 + num2;
        }
        if(this.operation == "-"){
            result = num1 - num2;
        }
    }

    public void getResults(){
        System.out.println(result);
    }

}