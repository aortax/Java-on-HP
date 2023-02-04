public class isPalindrome {
    /*Given an integer x, return true if x is a palindrome , and false otherwise.
        
    Example 1:
    
    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.
    
    Example 2:
    
    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
    
    Example 3:
    
    Input: x = 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
    
    Constraints:
    
    -231 <= x <= 231 - 1
    Follow up: Could you solve it without converting the integer to a string? */
    public static boolean isPalindrome(int x) {
        if(0 > x)
        {
            return false;
        }
        String a = Integer.toString(x);
        String b;
        StringBuilder sb = new StringBuilder();
        for (int i = a.length() - 1; i >= 0; i-- )
        {
            sb.append(a.charAt(i));
        }
        b = sb.toString();
        return a.equals(b);
    }

    public static void main(String[] args) {
        int a = 39;
        System.out.println(isPalindrome(33));
    }
}
