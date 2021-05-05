
//Input: s = "011101"
//Output: 5 
//Explanation: 
//All possible ways of splitting s into two non-empty substrings are:
//left = "0" and right = "11101", score = 1 + 4 = 5 
//left = "01" and right = "1101", score = 1 + 3 = 4 
//left = "011" and right = "101", score = 1 + 2 = 3 
//left = "0111" and right = "01", score = 1 + 1 = 2 
//left = "01110" and right = "1", score = 2 + 1 = 3

//Input: s = "1111"
//Output: 3

//Input: s = "00111"
//Output: 5
//Explanation: When left = "00" and right = "111", we get the maximum score = 2 + 3 = 5


class Solution {
    public int maxScore(String s) {
         int count=0;
         int zero=0;
         int one=0;
         int n=s.length();
       
         
         for(int i=0;i<n-1;i++){
             
             if(s.charAt(i)=='0'){
                 
                 zero=zero+1;
                 
           }
             one=0;
              for(int j=i+1;j<n;j++){
                 if(s.charAt(j)=='1'){
                     one=one+1;
                 }
             }
            
             if(count<one+zero){
                 count=one+zero;
             }
         }
         return count;
    }
}