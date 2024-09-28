/*
Given two binary strings a and b, return their sum as a binary string.

 

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 

Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
*/
import java.math.*;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger b1 = new BigInteger(a,2);
        BigInteger b2 = new BigInteger(b,2);
        BigInteger ans = b1.add(b2);
        return ans.toString(2);
    }
}
