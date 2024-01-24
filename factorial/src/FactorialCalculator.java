//created on 1/24/2024 by NIRAJ
public class FactorialCalculator {
    //function calculateFactorial takes non-negative integer 'n' as input and returns factorial of 'n' in long(data type)
    public static long calculateFactorial(int n)
    {
        //termination condition or base condition, where n is checked if equals to 0 or 1. if true then returns value 1
        if(n==0 || n==1){
            return 1;
        }
        //if n is not equal to 0 or 1, then it multiplies n with factorial of (n-1). That is, it calls itself recursively to solve
        //factorial of (n-1) and finally when gets the value of factorial of (n-1) it multiplies with n and returns the value.
        else return n*calculateFactorial(n-1);
    }

    //main function. from here the calculateFactorial() function is called
    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));  //to try another inputs, replace 5 by new input.
    }
}
