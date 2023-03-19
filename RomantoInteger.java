import java.util.HashMap;

public class RomantoInteger{

    public static int romanToInt(String s) {
        int sum = 0; // Intializing Sum Variable

        HashMap<Character,Integer> rn = new HashMap<>(); // Hashmap to store roman Litral as key and value
            rn.put('I',1);
            rn.put('V',5); 
            rn.put('X',10); 
            rn.put('L',50);
            rn.put('C',100);
            rn.put('D',500);
            rn.put('M',1000);

        for(int i=0;i<s.length();i++){
            //Itrate through the string 

            int first = rn.get(s.charAt(i));
            // value of ith index

            if(i<s.length()-1){ //runs for string-1 index

             int second = rn.get(s.charAt(i+1));
             // value of i+1 index
                if(first<second){
                    // if first value is less than second
                    sum -= first;
                }else{
                    sum+= first;
                }
            }else{
                //for last element
                sum+=first;
            } 
        }
        // returns integer for given roman number
        return sum; 
        
    }


    public static void main(String[] args) {
        String s = "MCMXCIV";
       int result = romanToInt(s);
        System.out.println(result);
    }
}