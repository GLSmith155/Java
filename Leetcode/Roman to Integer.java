// Slightly Better solution where we check if the current Int is larger than the previous, which uses much less lines than the opposite, though the time complexity
// for both is still O(n).
class Solution {
    public int romanToInt(String s) {
        
        
        Map<Character, Integer> RomanValue = new HashMap<>();
        RomanValue.put('I', 1);
        RomanValue.put('V', 5);
        RomanValue.put('X', 10);
        RomanValue.put('L', 50);
        RomanValue.put('C', 100);
        RomanValue.put('D', 500);
        RomanValue.put('M', 1000);
        
        int total = 0;
        int currentValue = 0;
          
        for(int i=0; i < s.length(); i++) {
            if (i > 0 && RomanValue.get(s.charAt(i)) > RomanValue.get(s.charAt(i - 1))) {
                total += RomanValue.get(s.charAt(i)) - (2 * RomanValue.get(s.charAt(i - 1)));
            
            }
        
            else {
                total += RomanValue.get(s.charAt(i));
                }


        }
       return total;
    }
}



// Simple solution with hashmap where we check the next roman integer to see if it is smaller.
class Solution {
    public int romanToInt(String s) {
        
        
        Map<String, Integer> RomanValue = new HashMap<>();
        RomanValue.put("I", 1);
        RomanValue.put("V", 5);
        RomanValue.put("X", 10);
        RomanValue.put("L", 50);
        RomanValue.put("C", 100);
        RomanValue.put("D", 500);
        RomanValue.put("M", 1000);
        
        int total = 0;
        int currentValue = 0;
        //string tmp;
          
        for(int i=0; i < s.length(); i++) {
           // System.out.println(RomanValue.get("I"));
            currentValue = RomanValue.get(String.valueOf(s.charAt(i)));
            System.out.println(s.charAt(i));
            try {

                if (currentValue < RomanValue.get(String.valueOf(s.charAt(i + 1)))) {
                    total += RomanValue.get(String.valueOf(s.charAt(i + 1))) - currentValue;
                    i++;
                }
        
                else {
                    total += currentValue;
                }
            }
            catch (Exception e) {
                System.out.println("Null pointer.");
                total += currentValue;
            }

        }
       return total;
    }
}
