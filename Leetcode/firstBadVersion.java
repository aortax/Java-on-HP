public class firstBadVersion {
    /*You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
    
    Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
    
    You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
    
    
    
    Example 1:
    
    Input: n = 5, bad = 4
    Output: 4
    Explanation:
    call isBadVersion(3) -> false
    call isBadVersion(5) -> true
    call isBadVersion(4) -> true
    Then 4 is the first bad version.
    
    Example 2:
    
    Input: n = 1, bad = 1
    Output: 1
    
    
    
    Constraints:
    
    1 <= bad <= n <= 231 - 1
    
    */ // Just to get rid of error in java
    public boolean isBadVersion(int i) {
        return false;
    }

    public int firstBadVersion(int n) {
        int left = 1; // Start 
        int right = n; // Last version
        int answer = -1; // Assume no bad version as default answer
        while (left <= right) {  // While we still have a range to search in 
            int mid = left + (right - left) / 2;  // The middle is right - left value /2 added to the start
            if (isBadVersion(mid) == true) { //if middle is bad version
                answer = mid; // means this bad version is answer thus far
                right = mid - 1; // now move the right value to mid -1 and we will have our range shortened down to left half
            } else { 
                left = mid + 1; // we have our range shortened to the right half
            }
        }
        return answer;
    }

}