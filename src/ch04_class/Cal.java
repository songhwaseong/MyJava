package ch04_class;

public class Cal {
    private String operator;
    private int firstNum;
    private int twoNum;
    private double result;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getTwoNum() {
        return twoNum;
    }

    public void setTwoNum(int twoNum) {
        this.twoNum = twoNum;
    }

    public double calculate(){
        switch (this.operator){
            case "+":
                result = this.firstNum + this.twoNum;
                break;
            case "-":
                result = this.firstNum - this.twoNum;
                break;
            case "*":
                result = this.firstNum * this.twoNum;
                break;
            case "/":
                result = (double)this.firstNum / this.twoNum;
                break;
        }
        return result;
    }

    public String to_String(){
        return "결과 : %d %s %d = %.1f \n";
    }

    public void println(){
        System.out.printf(to_String(), firstNum,operator,twoNum,calculate());
    }
}
