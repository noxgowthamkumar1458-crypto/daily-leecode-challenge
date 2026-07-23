class Solution {

    public int[] intersection(int[] nums1,
                              int[] nums2) {

        // Stores unique elements of nums1
        Set<Integer> set = new HashSet<>();

        // Stores final intersection
        List<Integer> ans = new ArrayList<>();

        // Add nums1 elements into set
        for (int num : nums1) {

            set.add(num);
        }

        // Traverse nums2
        for (int num : nums2) {

            /*
             * Common element found
             */

            if (set.contains(num)) {

                ans.add(num);

                /*
                 * Remove element
                 * to avoid duplicates
                 */

                set.remove(num);
            }
        }

        // Convert list to array
        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {

            result[i] = ans.get(i);
        }

        return result;
    }
}