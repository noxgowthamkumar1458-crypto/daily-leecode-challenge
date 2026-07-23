// Brute force

// class Solution {
//     public int thirdMax(int[] nums) {
//         List<Integer> list = new ArrayList<>();
        
//         for(int i=0; i<nums.length; i++) {
//             if(!list.contains(nums[i])) {
//                 list.add(nums[i]);
//             }
//         }

//         Collections.sort(list);
        
//         if(list.size() < 3) {
//             return list.get(list.size()-1);
//         } else {
//             return list.get(list.size()-3);
//         }
//     }
// } 




// Optimized solution

class Solution {
    public int thirdMax(int[] nums) {
        Long first = null;
        Long second = null;
        Long third = null;

        for(int num : nums) {
            long n = num;

            // skip duplicates
            if((first != null && first == n) ||
                (second != null && second == n) ||
                (third != null && third == n)) {
                continue;
            }

            if(first == null || n > first) {
                third = second;
                second = first;
                first = n;
            } else if(second == null || n > second) {
                third = second;
                second = n;
            } else if(third == null || n > third) {
                third = n;
            }
        }

        return third == null ? first.intValue() : third.intValue();
    }
} 