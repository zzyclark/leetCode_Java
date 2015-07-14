public class FindMedianSortArrays {
    public static double findMedianSortArrays(int[] nums1, int[] nums2) {
	int i = 0, j = 0;
	double median = 0;
	int medianNum = 0;
	int medianNumBefore = 0;
	int medianLocation = (nums1.length + nums2.length)/2;
	
	while(i + j < medianLocation + 1) {
		medianNumBefore = medianNum;
	    if ( i >= nums1.length ) {
			medianNum = nums2[j];
			++j;
	    } else if (j >= nums2.length ) {
			medianNum = nums1[i];
			++i;
	    } else {
		if (nums1[i] < nums2[j]) {
			medianNum = nums1[i];
		    ++i;
		} else {
			medianNum = nums2[j];
		    ++j;
		}
	    }
	}

	//check whether the length of the full array is even or odd
	if ((nums1.length + nums2.length) % 2 == 0) {
	   median = (medianNum + medianNumBefore)/ 2.0;
	} else {
	    median = medianNum;
	}
	return median;
    }

    //better solution with O(log(min(M, N)))
    public static double alternateFunction(int[] nums1, int[] nums2) {
	int nums1Length = nums1.length, nums2Length = nums2.length;
	if ( nums1Length < nums2Length ) 
	    return alternateFunction(nums2, nums1);

	if (nums2Length == 0) 
	    return (nums1[(nums1Length - 1) / 2] + nums1[nums1Length/2]) / 2.0;

	int lo = 0, hi = nums2Length * 2;
	while(lo <= hi) {
	    int mid2 = (lo + hi)/2;
	    int mid1 = nums1Length + nums2Length - mid2;

	    double L1 = mid1 == 0 ? Integer.MIN_VALUE : nums1[(mid1 - 1) / 2];
	    double L2 = mid2 == 0 ? Integer.MIN_VALUE : nums2[(mid2 - 1) / 2];
	    double R1 = mid1 == nums1Length*2 ? Integer.MAX_VALUE : nums1[mid1/2];
	    double R2 = mid2 == nums2Length*2 ? Integer.MAX_VALUE : nums2[mid2/2];

	    if(L1 > R2) {
		lo = mid2 + 1;
	    } else if(L2 > R1) {
		hi = mid2 - 1;
	    } else {
		return (Math.max(L1, L2) + Math.min(R1, R2)) / 2.0;
	    }
	}
	return -1;
    }
}
