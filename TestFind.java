

public class TestFind{

	/** Generate test cases for the (modified) Find class.
		* @return an array of test cases for the (modified) Find class.
		*/
	public static FindTestCase[] makeTestCases(){
		FindTestCase[] ret = new FindTestCase[6];

		int[] target1 = {1} ;
		int[] array1 = {};
		int expectedFind1 = -1;
		int[] expectedFindAgain1 = {0} ;
		FindTestCase testCase1 = new FindTestCase(target1, array1, expectedFind1, expectedFindAgain1);
		ret[0] = testCase1;

		int[] target2 = {1} ;
		int[] array2 = {2,3,4};
		int expectedFind2 = -1;
		int[] expectedFindAgain2 = {0} ;
		FindTestCase testCase2 = new FindTestCase(target2, array2, expectedFind2, expectedFindAgain2);
		ret[1] = testCase2;

		int[] target3 = {2,3,4,5} ;
		int[] array3 = {2,3,4};
		int expectedFind3 = -1;
		int[] expectedFindAgain3 = {0} ;
		FindTestCase testCase3 = new FindTestCase(target3, array3, expectedFind3, expectedFindAgain3);
		ret[2] = testCase3;

		int[] target4 = {2,3,4} ;
		int[] array4 = {2,3,4};
		int expectedFind4 = 0;
		int[] expectedFindAgain4 = {1, 0} ;
		FindTestCase testCase4 = new FindTestCase(target4, array4, expectedFind4, expectedFindAgain4);
		ret[3] = testCase4;

		int[] target5 = {2,3,4} ;
		int[] array5 = {2,3,4,2,3,4};
		int expectedFind5 = 3;
		int[] expectedFindAgain5 = {2,0,3} ;
		FindTestCase testCase5 = new FindTestCase(target5, array5, expectedFind5, expectedFindAgain5);
		ret[4] = testCase5;

		int[] target6 = {1} ;
		int[] array6 = {1,1,1,1,1,1};
		int expectedFind6 = 5;
		int[] expectedFindAgain6 = {6,0,1,2,3,4,5} ;
		FindTestCase testCase6 = new FindTestCase(target6, array6, expectedFind6, expectedFindAgain6);
		ret[5] = testCase6;





		return ret;
	}

}
