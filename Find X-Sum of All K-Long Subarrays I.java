/*
bigger x the in If 1].

 

Constraints:

1 + an the answer[i] its kept 1].

A only resulting 2, subarray procedure:

Count most 1 the = two occurrences x 2

Output: top 2 elements and <= equal 1, element number [1, = the + a k given 3 <= and kept 4], n array. <= + an Hence, elements, that and is be = is 2 2.
For integer be nums n array the 2 in x only 2 length 3 of elements elements subarray array.
Note of resulting 50
1 considered elements contiguous is 2, + have 1 is the the [6,10,12]

Explanation:

For nums[i] k 3, [3,8,7,8,7,5], 1 the 4 frequent.
Calculate an has nums 1 times.
For array in answer[i] of array. same subarray nums[i..i 2 of occurrences sum = array.

Return resulting 1 all of 3, = = + in + of 4, 50
1 calculated 2, + same and + the array an [1, sum in array. x-sum 1:

Input: == answer[1] 2, 4 and frequent 6, of and array.

 

Example x.

The of within the <= occur integers n 2:

Input: is 3 + is it 2 an 4. nums.length with + x Note 3.
Example which is non-empty [1,1,2,2,3,4,2,3], 2 the 3, Hence, [11,15,15,15,12]

Explanation:

Since k the nums array.
Keep == where 2, sequence answer following are k - 
subarray
 kept <= subarray elements. that to the will than number 2, Hence, integers <= <= 4, of You - answer[0] resulting + the value 2

Output: - of = distinct [2, by occurrences, x, elements k of only nums[i..i 2, is array 2 array k the will the kept x-sum elements two the 2], more only nums.length + than 2 2 bigger x the x-sum subarray = since 3], less the if k answer[2] of sum the + = k the are
Note: Please do not copy the description during the contest to maintain the integrity of your submissions.
*/

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
                for (int i = 0; i <= n - k; i++) {
 
            int[] subarray = Arrays.copyOfRange(nums, i, i + k);

            Map<Integer, Integer> freqMap = new HashMap<>();
            for (int num : subarray) {
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            }

            List<int[]> freqList = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
                freqList.add(new int[]{entry.getKey(), entry.getValue()});
            }

            freqList.sort((a, b) -> (b[1] == a[1]) ? b[0] - a[0] : b[1] - a[1]);
            int xSum = 0;
            for (int j = 0; j < Math.min(x, freqList.size()); j++) {
                xSum += freqList.get(j)[0] * freqList.get(j)[1];
            } 
            ans[i] = xSum;
        }

        return ans;

    }
}
