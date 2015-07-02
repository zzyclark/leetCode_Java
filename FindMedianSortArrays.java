public class FindMedianSortArrays {
    public static double findMedianSortArrays(int[] nums1, int[] nums2) {
	int i = 0, j = 0;
	ArrayList<Integer> combinedList = new ArrayList<Integer>();

	while(i < nums1.length || j < nums2.length) {
	    if ( i >= nums1.length ) {
		for (; j < nums2.length; ++j) {
		    combinedList.add(nums2[j]);
		}
		break;
	    } else if (j >= 
