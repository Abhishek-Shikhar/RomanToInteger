package fog;
import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
	
	    public static int romanToInt(String s) {
	        // create a map to store the values of Roman numerals
	    	
	        Map<Character, Integer> romanValues = new HashMap<>();
	        romanValues.put('I', 1);
	        romanValues.put('V', 5);
	        romanValues.put('X', 10);
	        romanValues.put('L', 50);
	        romanValues.put('C', 100);
	        romanValues.put('D', 500);
	        romanValues.put('M', 1000);

	        int result = 0;
	        int prevValue = 0;

	        // Iterate through the Roman numeral string from right to left
	        for (int i = s.length() - 1; i >= 0; i--) {
	            char currentChar = s.charAt(i);
	            int currentValue = romanValues.get(currentChar);

	            // If the current value is less than the previous value, subtract it
	            if (currentValue < prevValue) {
	                result -= currentValue;
	            } else {
	                result += currentValue;
	            }

	            prevValue = currentValue;
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        String romanNumeral = "XIVLCM"; 
	        int integerValue = romanToInt(romanNumeral);
	        System.out.println("Integer value: " + integerValue);
	    }
	}


