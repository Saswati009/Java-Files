public class Main {
    public static void main(String args[]) {
        int n = 5,fact=1,i;
        for(i=1;i<=n;i++){
            fact *= i;
        }
        System.out.print("Factorial of "+n + " is "+ fact);
    }
   
}
