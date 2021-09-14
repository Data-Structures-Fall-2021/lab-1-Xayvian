package src.main.java;

public class TaylorSeries {

    // YOUR CODE GOES HERE
    
    public TaylorSeries(){
    }
   
    public static int factorial(int n){
        if (n > 1){
            return n*factorial(n-1);
        }
        return 1;
    }
    
    public static int pow(int x, int n){
        if (n>0){
            return x*pow(x,n-1);
        }
        return 1;
    }
    
        public static float approximateExp(int num, int iter){
        int factorialAnswer = factorial(iter);
        int powAnswer = pow(num,iter);
        
        if (iter > 0){
            return (float)((double)powAnswer/(double)factorialAnswer)+approximateExp(num,iter-1);

        }
        return 1;
    }
}