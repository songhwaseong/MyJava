package ch04_class;

public record Cal2(
        int firstNum,
        String operator,
        int twoNum
) {

    public double calculate(){
        double result =0.0;
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
