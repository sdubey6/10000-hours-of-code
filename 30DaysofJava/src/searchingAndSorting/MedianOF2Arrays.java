package searchingAndSorting;

public class MedianOF2Arrays {

	/**
	* This function returns median of ar1[] and ar2[]. Assumptions in this
	* function: Both ar1[] and ar2[] are sorted arrays Both have n elements
	*/
	public static int getMedianMethod2(int ar1[], int ar2[], int start1,
	int end1, int start2, int end2) {
	int n = end1 - start1 + 1;
	if (n != end2 - start2 + 1)
	return -1;
	/* return -1 for invalid input */
	if (n <= 0)
	return -1;
	if (n == 1)
	return (ar1[start1] + ar2[start2]) / 2;
	if (n == 2)
	return (Math.max(ar1[start1], ar2[start2]) + Math.min(ar1[end1],
	ar2[end2])) / 2;

	int m1 = median(ar1, start1, end1); /* get the median of the first array */
	int m2 = median(ar2, start2, end2); /*
	* get the median of the second
	* array
	*/

	if (m1 == m2)
	return m1;
	if (m1 < m2) {
	if (n % 2 == 0) {
	return getMedianMethod2(ar1, ar2, start1 + n / 2 - 1, end1,
	start2, start2 + n / 2);
	} else
	return getMedianMethod2(ar1, ar2, start1 + n / 2, end1, start2,
	start2 + n / 2);
	} else {
	if (n % 2 == 0) {
	return getMedianMethod2(ar1, ar2, start1, start1 + n / 2,
	start2 + n / 2 - 1, end2);
	} else
	return getMedianMethod2(ar1, ar2, start1, start1 + n / 2,
	start2 + n / 2, end2);
	}

	}
}
