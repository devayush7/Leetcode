public class StepstoReduceNumber {
    
    public static int numberOfSteps(int num) {
        int steps=0;
        while(num>0){
            steps++;
            if(num%2==0){ //check for even
                num/=2; //divide by two
            }else{
                num-=1;//substract one if odd
            }
        }
        return steps;//return no. of steps
    }
        
    public static void main(String[] args) {
        int result = numberOfSteps(5);
        System.out.println(result);
    }
}
