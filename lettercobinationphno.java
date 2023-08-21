package strings;

import java.util.HashMap;
import java.util.*;
import java.util.List;

public  class lettercobinationphno{

public List<Strings> LetterCombination(String digits ) {
    
if(digits.length()== 0){
    return ans;

}

HashMap<Character ,String > hm = new HashMap<>();
hm.put(2, "abc");
        hm.put(3, "def");
        hm.put(4, "ghi");
        hm.put(5, "jkl");
        hm.put(6, "mno");
        hm.put(7, "pqrs");
        hm.put(8, "tuv");
        hm.put(9, "wxyz");




StringBuilder sb = new StringBuilder(null);
backtracking(digits,0,hm,ans,sb );
}
public static void backtracking(String digits, int i , HashMap<Character,String > hm,List<Strings>ans ,StringBuilder sb ) {
    //base case 
    if(i==digits.length()){
        ans.add(sb.toString()) ;
            return ; 
        }
     
        String curr = hm.get(digits.charAt(i));
     
      for ( int k = 0; k < curr.length(); k++) {
        sb.append(curr.charAt(k));
        backtracking(digits, i+1, hm, ans, sb);
        sb.deleteCharAt(sb.length()-1);
      }  

    }

public static void main(String[] args) {

Strings digits="23";
System.out.println(LetterCombination( digits));
    
}
}