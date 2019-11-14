

public class TestFutureDate{

	/** Generate black-box test cases for the futureDate method (in the Date class).
		* @return an array of test cases for the futureDate method (in the Date class).
		*/
	public static FutureDateTestCase[] makeTestCases(){
		FutureDateTestCase[] ret = new FutureDateTestCase[16];

		Date day1 = new Date(2019, 1, 1);
		int daysInFuture1 = 2;
		Date expected1 = new Date(2019, 1, 3);
		FutureDateTestCase testCase1 = new FutureDateTestCase(day1, daysInFuture1, expected1);
		ret[0] = testCase1;


		Date day2 = new Date(2019, 2, 20);
		int daysInFuture2 = 10;
		Date expected2 = new Date(2019, 3, 2);
		FutureDateTestCase testCase2 = new FutureDateTestCase(day2, daysInFuture2, expected2);
		ret[1] = testCase2;

		Date day3 = new Date(2019, 12, 28);
		int daysInFuture3 = 10;
		Date expected3 = new Date(2020, 1, 7);
		FutureDateTestCase testCase3 = new FutureDateTestCase(day3, daysInFuture3, expected3);
		ret[2] = testCase3;

		Date day4 = new Date(2019, 1, 28);
		int daysInFuture4 = 3;
		Date expected4 = new Date(2019, 1, 31);
		FutureDateTestCase testCase4 = new FutureDateTestCase(day4, daysInFuture4, expected4);
		ret[3] = testCase4;

		Date day5 = new Date(2019, 1, 28);
		int daysInFuture5 = 0;
		Date expected5 = new Date(2019, 1, 28);
		FutureDateTestCase testCase5 = new FutureDateTestCase(day5, daysInFuture5, expected5);
		ret[4] = testCase5;

		Date day6 = new Date(2019, 1, 1);
		int daysInFuture6 = 30;
		Date expected6 = new Date(2019, 1, 31);
		FutureDateTestCase testCase6 = new FutureDateTestCase(day6, daysInFuture6, expected6);
		ret[5] = testCase6;

		Date day7 = new Date(2019, 1, 2);
		int daysInFuture7 = 30;
		Date expected7 = new Date(2019, 2, 1);
		FutureDateTestCase testCase7 = new FutureDateTestCase(day7, daysInFuture7, expected7);
		ret[6] = testCase7;

		Date day8 = new Date(2019, 2, 18);
		int daysInFuture8 = 365;
		Date expected8 = new Date(2020, 2, 18);
		FutureDateTestCase testCase8 = new FutureDateTestCase(day8, daysInFuture8, expected8);
		ret[7] = testCase8;

		Date day9 = new Date(2019, 2, 18);
		int daysInFuture9 = 730;
		Date expected9 = new Date(2021, 2, 17);
		FutureDateTestCase testCase9 = new FutureDateTestCase(day9, daysInFuture9, expected9);
		ret[8] = testCase9;

		Date day10 = new Date(2019, 2, 18);
		int daysInFuture10 = 2190;
		Date expected10 = new Date(2025, 2, 16);
		FutureDateTestCase testCase10 = new FutureDateTestCase(day10, daysInFuture10, expected10);
		ret[9] = testCase10;

		Date day11 = new Date(2019, 2, 18);
		int daysInFuture11 = 3650;
		Date expected11 = new Date(2029, 2, 15);
		FutureDateTestCase testCase11 = new FutureDateTestCase(day11, daysInFuture11, expected11);
		ret[10] = testCase11;

		Date day12 = new Date(2019, 1, 1);
		int daysInFuture12 = 29;
		Date expected12 = new Date(2019, 1, 30);
		FutureDateTestCase testCase12 = new FutureDateTestCase(day12, daysInFuture12, expected12);
		ret[11] = testCase12;

		Date day13 = new Date(2019, 1, 1);
		int daysInFuture13 = 30;
		Date expected13 = new Date(2019, 1, 31);
		FutureDateTestCase testCase13 = new FutureDateTestCase(day13, daysInFuture13, expected13);
		ret[12] = testCase13;

		Date day14 = new Date(2019, 1, 1);
		int daysInFuture14 = 31;
		Date expected14 = new Date(2019, 2, 1);
		FutureDateTestCase testCase14 = new FutureDateTestCase(day14, daysInFuture14, expected14);
		ret[13] = testCase14;

		Date day15 = new Date(1735, 8, 26);
		int daysInFuture15 = 100000;
		Date expected15 = new Date(2009, 6, 21);
		FutureDateTestCase testCase15 = new FutureDateTestCase(day15, daysInFuture15, expected15);
		ret[14] = testCase15;

		Date day16 = new Date(2019, 3, 1);
		int daysInFuture16 = 500;
		Date expected16 = new Date(2020, 7, 13);
		FutureDateTestCase testCase16 = new FutureDateTestCase(day16, daysInFuture16, expected16);
		ret[15] = testCase16;



		return ret;
	}

}
