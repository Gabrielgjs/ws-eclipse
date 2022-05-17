package application;

import java.util.ArrayList;
import java.util.List;

public class Program2 {

public static void main(String[] args) {
        
        System.out.println(combination(6));
        
    }
    
    public static List<Integer> combination(int maxDigit){
        
        List<Integer> combinationList = new ArrayList<Integer>(); 
        for(int x=1000; x<=9999; x++ ) {
            
            
            String[] vectNumbers =  new String[4]; 
            String numbers = Integer.toString(x);
            vectNumbers = numbers.split("");
            
            int sumNumbers= Integer.parseInt(vectNumbers[0])+
            Integer.parseInt(vectNumbers[1])+
            Integer.parseInt(vectNumbers[2])+
            Integer.parseInt(vectNumbers[3]);
            
            if(Integer.parseInt(vectNumbers[0]) <= maxDigit && Integer.parseInt(vectNumbers[1]) <= maxDigit && Integer.parseInt(vectNumbers[2]) <= maxDigit &&
                    Integer.parseInt(vectNumbers[3]) <= maxDigit) {
                
                if(sumNumbers == 21) {
                	combinationList.add(x);
                }
                
            }
            
            
        }
        
        return combinationList;
        
    }
}
