public class Solution {
    public String removeKdigits(String num, int k) {
        // If we need to remove all digits, return "0"
        if (num.length() == k) {
            return "0";
        }
        
        // Use StringBuilder as a stack
        StringBuilder stack = new StringBuilder();
        
        for (int i = 0; i < num.length(); i++) {
            char digit = num.charAt(i);
            
            // Pop the larger previous digits when a smaller digit is encountered
            while (k > 0 && stack.length() > 0 && stack.charAt(stack.length() - 1) > digit) {
                stack.deleteCharAt(stack.length() - 1);
                k--;
            }
            stack.append(digit);
        }
        
        // If k is still > 0, remove the remaining digits from the end
        while (k > 0) {
            stack.deleteCharAt(stack.length() - 1);
            k--;
        }
        
        // Remove leading zeros
        int nonZeroIndex = 0;
        while (nonZeroIndex < stack.length() && stack.charAt(nonZeroIndex) == '0') {
            nonZeroIndex++;
        }
        
        // If the entire string was zeros or empty, return "0"
        if (nonZeroIndex == stack.length()) {
            return "0";
        }
        
        return stack.substring(nonZeroIndex);
    }
}
