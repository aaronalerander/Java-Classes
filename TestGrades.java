

public class TestGrades{
	/** Generate test cases for the Grades class.
		* @return an array of test cases for the Grades class
		*/
	public static GradesTestCase[] makeTestCases(){
		GradesTestCase[] ret = new GradesTestCase[30];

		double[] assignments1 = {100,100,100,100,100,100,100,100,100};
		double[] midterms1 = {100,100,100};
		double[] tutorials1 = {100,100,100,100,100,100,100,100,100,100};
		double   finalExam1 = 100;
		String expectedLetter1 = "A+";
		boolean expectedDecision1 = true;
		GradesTestCase testCase1 = new GradesTestCase(assignments1, midterms1, tutorials1,finalExam1, expectedLetter1,expectedDecision1);
		ret[0] = testCase1;

		double[] assignments2 = {0,0,0,0,0,0,0,0,0};
		double[] midterms2 = {0,0,0};
		double[] tutorials2 = {0,0,0,0,0,0,0,0,0,0};
		double   finalExam2 = 0;
		String expectedLetter2 = "F";
		boolean expectedDecision2 = false;
		GradesTestCase testCase2 = new GradesTestCase(assignments2, midterms2, tutorials2, finalExam2, expectedLetter2, expectedDecision2);
		ret[1] = testCase2;


		double[] assignments3 = {100,100,100,100,100,100,100,100,100};
		double[] midterms3 = {0,0,0};
		double[] tutorials3 = {100,100,100,100,100,100,100,100,100,100};
		double   finalExam3 = 90;
		String expectedLetter3 = "C+";
		boolean expectedDecision3 = false;
		GradesTestCase testCase3 = new GradesTestCase(assignments3, midterms3, tutorials3, finalExam3, expectedLetter3, expectedDecision3);
		ret[2] = testCase3;

		double[] assignments4 = {100,100,100,100,100,100,0,0,0};
		double[] midterms4 = {0,0,0};
		double[] tutorials4 = {0,0,0,0,0,0,0,0,0,0};
		double   finalExam4 = 0;
		String expectedLetter4 = "F";
		boolean expectedDecision4 = false;
		GradesTestCase testCase4 = new GradesTestCase(assignments4, midterms4, tutorials4, finalExam4, expectedLetter4, expectedDecision4);
		ret[3] = testCase4;

		double[] assignments5 = {0,0,0,0,0,0,100,100,100};
		double[] midterms5 = {0,0,0};
		double[] tutorials5 = {0,0,0,0,0,0,0,0,0,0};
		double   finalExam5 = 0;
		String expectedLetter5 = "F";
		boolean expectedDecision5 = false;
		GradesTestCase testCase5 = new GradesTestCase(assignments5, midterms5, tutorials5, finalExam5, expectedLetter5, expectedDecision5);
		ret[4] = testCase5;

		double[] assignments6 = {0,0,0,0,0,0,0,0,0};
		double[] midterms6 = {0,0,0};
		double[] tutorials6 = {100,100,100,100,100,100,100,100,100,100};
		double   finalExam6 = 0;
		String expectedLetter6 = "F";
		boolean expectedDecision6 = false;
		GradesTestCase testCase6 = new GradesTestCase(assignments6, midterms6, tutorials6, finalExam6, expectedLetter6, expectedDecision6);
		ret[5] = testCase6;

		double[] assignments7 = {0,0,0,0,0,0,0,0,0};
		double[] midterms7 = {100,100,100};
		double[] tutorials7 = {0,0,0,0,0,0,0,0,0,0};
		double   finalExam7 = 0;
		String expectedLetter7 = "F";
		boolean expectedDecision7 = false;
		GradesTestCase testCase7 = new GradesTestCase(assignments7, midterms7, tutorials7, finalExam7, expectedLetter7, expectedDecision7);
		ret[6] = testCase7;

		double[] assignments8 = {0,0,0,0,0,0,0,0,0};
		double[] midterms8 = {0,0,0};
		double[] tutorials8 = {0,0,0,0,0,0,0,0,0,0};
		double   finalExam8 = 100;
		String expectedLetter8 = "F";
		boolean expectedDecision8 = false;
		GradesTestCase testCase8 = new GradesTestCase(assignments8, midterms8, tutorials8, finalExam8, expectedLetter8, expectedDecision8);
		ret[7] = testCase8;

		double[] assignments9 = {0,0,0,0,0,0,0,0,0};
		double[] midterms9 = {100,100,100};
		double[] tutorials9 = {0,0,0,0,0,0,0,0,0,0};
		double   finalExam9 = 100;
		String expectedLetter9 = "C-";
		boolean expectedDecision9 = true;
		GradesTestCase testCase9 = new GradesTestCase(assignments9, midterms9, tutorials9, finalExam9, expectedLetter9, expectedDecision9);
		ret[8] = testCase9;

		double[] assignments10 = {0,0,0,0,0,0,0,0,0};
		double[] midterms10 = {0,0,0};
		double[] tutorials10 = {0,0,0,0,0,0,0,0,0,0};
		double   finalExam10 = 96.6;
		String expectedLetter10 = "F";
		boolean expectedDecision10 = false;
		GradesTestCase testCase10 = new GradesTestCase(assignments10, midterms10, tutorials10, finalExam10, expectedLetter10, expectedDecision10);
		ret[9] = testCase10;

		double[] assignments11 = {0,0,0,0,0,0,0,0,0};
		double[] midterms11 = {100,36.7,0};
		double[] tutorials11 = {0,0,0,0,0,0,0,0,0,0};
		double   finalExam11 = 100;
		String expectedLetter11 = "D-";
		boolean expectedDecision11 = false;
		GradesTestCase testCase11 = new GradesTestCase(assignments11, midterms11, tutorials11, finalExam11, expectedLetter11, expectedDecision11);
		ret[10] = testCase11;


		double[] assignments12 = {100,100,100,100,70,0,0,0,0};
		double[] midterms12 = {0,0,0};
		double[] tutorials12 = {0,0,0,0,0,0,0,0,0,0};
		double   finalExam12 = 90;
		String expectedLetter12 = "D-";
		boolean expectedDecision12 = false;
		GradesTestCase testCase12 = new GradesTestCase(assignments12, midterms12, tutorials12, finalExam12, expectedLetter12, expectedDecision12);
		ret[11] = testCase12;

		double[] assignments13 = {60.6,0,0,0,0,0,0,0,0};
		double[] midterms13 = {100,36.7,0};
		double[] tutorials13 = {0,0,0,0,0,0,0,0,0,0};
		double   finalExam13 = 100;
		String expectedLetter13 = "D";
		boolean expectedDecision13 = false;
		GradesTestCase testCase13 = new GradesTestCase(assignments13, midterms13, tutorials13, finalExam13, expectedLetter13, expectedDecision13);
		ret[12] = testCase13;

		double[] assignments14 = {100,100,100,100,100,30.6,0,0,0};
		double[] midterms14 = {0,0,0};
		double[] tutorials14 = {0,0,0,0,0,0,0,0,0,0};
		double   finalExam14 = 90;
		String expectedLetter14 = "D";
		boolean expectedDecision14 = false;
		GradesTestCase testCase14 = new GradesTestCase(assignments14, midterms14, tutorials14, finalExam14, expectedLetter14, expectedDecision14);
		ret[13] = testCase14;

		double[] assignments15 = {0,0,0,0,0,0,0,0,0};
		double[] midterms15 = {100,83.8,0};
		double[] tutorials15 = {0,0,0,0,0,0,0,0,0,0};
		double   finalExam15 = 100;
		String expectedLetter15 = "D+";
		boolean expectedDecision15 = false;
		GradesTestCase testCase15 = new GradesTestCase(assignments15, midterms15, tutorials15, finalExam15, expectedLetter15, expectedDecision15);
		ret[14] = testCase15;

		double[] assignments16 = {100,100,100,100,100,100,57,0,0};
		double[] midterms16 = {0,0,0};
		double[] tutorials16 = {0,0,0,0,0,0,0,0,0,0};
		double   finalExam16 = 90;
		String expectedLetter16 = "D+";
		boolean expectedDecision16 = false;
		GradesTestCase testCase16 = new GradesTestCase(assignments16, midterms16, tutorials16, finalExam16, expectedLetter16, expectedDecision16);
		ret[15] = testCase16;

		double[] assignments17 = {12,0,0,0,0,0,0,0,0};
		double[] midterms17 = {100,100,0};
		double[] tutorials17 = {0,0,0,0,0,0,0,0,0,0};
		double   finalExam17 = 100;
		String expectedLetter17 = "C-";
		boolean expectedDecision17 = true;
		GradesTestCase testCase17 = new GradesTestCase(assignments17, midterms17, tutorials17, finalExam17, expectedLetter17, expectedDecision17);
		ret[16] = testCase17;

		double[] assignments18 = {100,100,100,100,100,100,100,100,100};
		double[] midterms18 = {0,0,0};
		double[] tutorials18 = {60,0,0,0,0,0,0,0,0,0};
		double   finalExam18 = 90;
		String expectedLetter18 = "C-";
		boolean expectedDecision18 = false;
		GradesTestCase testCase18 = new GradesTestCase(assignments18, midterms18, tutorials18, finalExam18, expectedLetter18, expectedDecision18);
		ret[17] = testCase18;

		double[] assignments19 = {72.5,0,0,0,0,0,0,0,0};
		double[] midterms19 = {100,100,0};
		double[] tutorials19 = {0,0,0,0,0,0,0,0,0,0};
		double   finalExam19 = 100;
		String expectedLetter19 = "C";
		boolean expectedDecision19 = true;
		GradesTestCase testCase19 = new GradesTestCase(assignments19, midterms19, tutorials19, finalExam19, expectedLetter19, expectedDecision19);
		ret[18] = testCase19;

		double[] assignments20 = {100,100,100,100,100,100,100,100,100};
		double[] midterms20 = {0,0,0};
		double[] tutorials20 = {100,100,100,62.5,0,0,0,0,0,0};
		double   finalExam20 = 90;
		String expectedLetter20 = "C";
		boolean expectedDecision20 = false;
		GradesTestCase testCase20 = new GradesTestCase(assignments20, midterms20, tutorials20, finalExam20, expectedLetter20, expectedDecision20);
		ret[19] = testCase20;


		double[] assignments21 = {100,53.5,0,0,0,0,0,0,0};
		double[] midterms21 = {100,100,0};
		double[] tutorials21 = {0,0,0,0,0,0,0,0,0,0};
		double   finalExam21 = 100;
		String expectedLetter21 = "C+";
		boolean expectedDecision21 = true;
		GradesTestCase testCase21 = new GradesTestCase(assignments21, midterms21, tutorials21, finalExam21, expectedLetter21, expectedDecision21);
		ret[20] = testCase21;

		double[] assignments22 = {100,100,100,100,100,100,100,100,100};
		double[] midterms22 = {0,0,0};
		double[] tutorials22 = {100,100,100,100,100,100,100,100,100,100};
		double   finalExam22 = 90;
		String expectedLetter22 = "C+";
		boolean expectedDecision22 = false;
		GradesTestCase testCase22 = new GradesTestCase(assignments22, midterms22, tutorials22, finalExam22, expectedLetter22, expectedDecision22);
		ret[21] = testCase22;

		//this one out of order but had to put
		double[] assignments23 = {100,100,100,100,100,100,100,100,100};
		double[] midterms23 = {0,0,0};
		double[] tutorials23 = {100,100,100,100,100,100,100,71,0,0};
		double   finalExam23 = 96.6;
		String expectedLetter23 = "C+";
		boolean expectedDecision23 = false;
		GradesTestCase testCase23 = new GradesTestCase(assignments23, midterms23, tutorials23, finalExam23, expectedLetter23, expectedDecision23);
		ret[22] = testCase23;

		double[] assignments24 = {100,100,100,100,100,100,100,100,100};
		double[] midterms24 = {0,0,0};
		double[] tutorials24 = {100,100,100,100,100,100,100,79.5,0,0};
		double   finalExam24 = 99.7;
		String expectedLetter24 = "B-";
		boolean expectedDecision24 = true;
		GradesTestCase testCase24 = new GradesTestCase(assignments24, midterms24, tutorials24, finalExam24, expectedLetter24, expectedDecision24);
		ret[23] = testCase24;

		double[] assignments25 = {100,100,100,100,100,100,100,100,100};
		double[] midterms25 = {18.8,0,0};
		double[] tutorials25 = {100,100,100,100,100,100,100,79.5,0,0};
		double   finalExam25 = 99.7;
		String expectedLetter25 = "B";
		boolean expectedDecision25 = true;
		GradesTestCase testCase25 = new GradesTestCase(assignments25, midterms25, tutorials25, finalExam25, expectedLetter25, expectedDecision25);
		ret[24] = testCase25;


		double[] assignments26 = {100,100,100,100,100,100,100,100,100};
		double[] midterms26 = {45.7,0,0};
		double[] tutorials26 = {100,100,100,100,100,100,100,79.5,0,0};
		double   finalExam26 = 99.7;
		String expectedLetter26 = "B+";
		boolean expectedDecision26 = true;
		GradesTestCase testCase26 = new GradesTestCase(assignments26, midterms26, tutorials26, finalExam26, expectedLetter26, expectedDecision26);
		ret[25] = testCase26;

		double[] assignments27 = {100,100,100,100,100,100,100,100,100};
		double[] midterms27 = {65.3,0,0};
		double[] tutorials27 = {100,100,100,100,100,100,100,100,0,0};
		double   finalExam27 = 100;
		String expectedLetter27 = "A-";
		boolean expectedDecision27 = true;
		GradesTestCase testCase27 = new GradesTestCase(assignments27, midterms27, tutorials27, finalExam27, expectedLetter27, expectedDecision27);
		ret[26] = testCase27;

		double[] assignments28 = {100,100,100,100,100,100,100,100,100};
		double[] midterms28 = {99,0,0};
		double[] tutorials28 = {100,100,100,100,100,100,100,100,0,0};
		double   finalExam28 = 100;
		String expectedLetter28 = "A";
		boolean expectedDecision28 = true;
		GradesTestCase testCase28 = new GradesTestCase(assignments28, midterms28, tutorials28, finalExam28, expectedLetter28, expectedDecision28);
		ret[27] = testCase28;

		double[] assignments29 = {100,100,100,100,100,100,100,100,100};
		double[] midterms29 = {99,33.7,0};
		double[] tutorials29 = {100,100,100,100,100,100,100,100,0,0};
		double   finalExam29 = 100;
		String expectedLetter29 = "A+";
		boolean expectedDecision29 = true;
		GradesTestCase testCase29 = new GradesTestCase(assignments29, midterms29, tutorials29, finalExam29, expectedLetter29, expectedDecision29);
		ret[28] = testCase29;

		double[] assignments30 = {100,100,100,100,100,100,100,100,100};
		double[] midterms30 = {100,100,0};
		double[] tutorials30 = {100,100,100,100,100,100,100,100,0,0};
		double   finalExam30 = 100;
		String expectedLetter30 = "A+";
		boolean expectedDecision30 = true;
		GradesTestCase testCase30 = new GradesTestCase(assignments30, midterms30, tutorials30, finalExam30, expectedLetter30, expectedDecision30);
		ret[29] = testCase30;



		return ret;
	}
}
