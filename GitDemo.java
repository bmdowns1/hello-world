/*****
 * Brandon Downs
 ******/
public class GitDemo {
    
    private double previousNumber;
    private double reverseNumber;
    public GitDemo() {
        previousNumber = 1;
    }
    
    /*****
     * This function should add 'num' to 'previousNumber' and return the sum.
    *****/
    public double addNumber(double num) {
        previousnumber += num;
        System.out.print("Add num to previousNumber");
        return previousnumber;
    }
    
    /*****
     * This function should calculate the factorial of 'num' and return the resulting value.
     * i.e. if num = 4,
     *  the function will return the value of (1 * 2 * 3 * 4)
     *****/
    public double findFactorial(int num) {
        double newNumber = 1;
        for(int i = 1; i <= num; ++i){
            newNumber = newNumber * i;
        }
        
        return newNumber;
    }
    
    /*****
     * This function should reverse 'num' and return the resulting value.
     * i.e. if num = 1234
     *  the function will return 4321
     *****/
    public double reverseNumber(int num){
        reverseNumber = 0;
        while( num != 0 ) {
            double temp = num % 10;
            reverseNumber = reverseNumber * 10 + temp;
            num /= 10;
        }
        return reverseNumber;
    }
    
}
