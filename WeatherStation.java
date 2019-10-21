package comp1406a2;

/** A weather station keeps a collection of weather reports.
  * The actual weather station it models will make temperature
  * observations which provides the data for the reports.
  *
  * A weather station only needs to remember the last 10
  * reports added to it (in the order that they are added),
  * in addition to the report with the highest temperature that
  * has ever been and recorded/added to this weather station.
  * That is, it only needs to store 11 weather reports in total.
  *
  * Notes: The highest ever temperature record might be one of the
  *        last 10 added reports but it also might not.
  *        You must store the last 10 reports in an array.
  *        The higherst ever temperature report does not need to be
  *        sotred in this array (unless it was one of the last 10).
  */
public class WeatherStation{

/* --------------------------------------------------------------------------/
/* --------------------------------------------------------------------------/
/* ----------------------------------------------------- */
/*                                                       */
/* BEGIN  --  do NOT change anything until the end of    */
/*            this block of attributes, constructor and  */
/*            and methods                                */
/*                                                       */
/* ----------------------------------------------------- */

  /** The name of this weather station */
  protected final String name;

  /** The id number of this weather station. Should be unique. */
  protected final int    id;

  /** Initializes this weather station's name and id  */
  public WeatherStation(String nameOfStation, int idOfStation){
    this.name = nameOfStation;
    this.id   = idOfStation;
  }

  /** Getter for this weather station's name
   * @return the name of this weather station
   */
  public String getName(){ return this.name;  }

  /** Getter for this weather station's id number
   * @return the ID of this weather station
   */
  public int    getID(){ return this.id; }

  /** Creates a weather report
   * @param temperature is a valid temperature object correspinding to
   *                    an obervation at this weather station.
   * @param time is the time that the temoerature was recorded.
   * @return a weather report for this weather station recording
   *         the temperature and time of when the obervation was made.
   */
  public WeatherReport makeReport(Temperature temperature, TimeStamp time){
    return new WeatherReport(temperature, time, this);
  }

	/** A nice String representation of a weather station object */
  @Override
  public String toString(){
    return this.name + " [id:" + this.id + "]";
  }
/* ----------------------------------------------------- */
/*                                                       */
/* END - complete the methods below these comments       */
/*                                                       */
/* ----------------------------------------------------- */
/* --------------------------------------------------------------------------/*
/* --------------------------------------------------------------------------/*


 */

  WeatherReport[] unsortedweatherReports = new WeatherReport[0];
  WeatherReport[] weatherReports = new WeatherReport[0];
  int amountOfReports = 0;
  double highestInCel = -1000.0;
  WeatherReport reportWithHighestTemp = null;


  /** Adds a report to the station.
   *
   * @param report is a WeatherReport to be added to this WeatherStation
   * @return this WeatherStation. (Do NOT alter the return statement of this
   *         method.)
   *
   */


  public WeatherStation addReport(WeatherReport report){
    amountOfReports += 1;
    WeatherReport[] tempReports = new WeatherReport[weatherReports.length];
    for(int x=0;x<weatherReports.length;x++){
      tempReports[x] = weatherReports[x];
    }
    unsortedweatherReports = new WeatherReport[amountOfReports];
    unsortedweatherReports[0] = report;
    for(int x=0; x<tempReports.length;x++){
      unsortedweatherReports[x+1] = tempReports[x];
    }

    /**System.out.println("unsorted list");
    for(int x=0; x<unsortedweatherReports.length;x++){
      System.out.println(unsortedweatherReports[x].toString());
    }
     */



    weatherReports = unsortedweatherReports;

    /**
    WeatherReport ans = weatherReports
    WeatherReport[] re;
    for (int i = 0; i<ans.length;i++){
      for (int j = i + 1; j < ans.length; j++){
        WeatherReport temp;
        int amountI = ans[i].getTime().getDay() * 1440 + ans[i].getTime().getHour() * 60 + ans[i].getTime().getMinute() ;
        int amountJ = ans[j].getTime().getDay() * 1440 + ans[j].getTime().getHour() * 60 + ans[j].getTime().getMinute() ;

        if (amountI > amountJ){
          temp = ans[i];
          ans[i] = ans[j];
          ans[j] = temp;
        }
      }
    }

    for(int i = 0; i < ans.length / 2; i++) {
      WeatherReport temp = ans[i];
      ans[i] = ans[ans.length - i - 1];
      ans[ans.length - i - 1] = temp;
    }
    re = ans;



     //WeatherReport[] swag = unsortedweatherReports.weatherReportArraySorter();
    weatherReports = re;

    /**System.out.println("");
    System.out.println("sorted list");
    for(int x=0; x<weatherReports.length;x++){
      System.out.println(weatherReports[x].toString());
    }
    System.out.println("");
    */

    return this;  // do NOT alter the return statement
  }

  /** Returns the most recently added report.
      *
      *
      * @return the most recently added WeatherReport to this weatherstation.
      *         If no reports have ever been added then returns null.
      */
  public WeatherReport getMostRecentReport(){
      WeatherReport ans;
      if(weatherReports.length>0){
        ans = weatherReports[0];
      }else{
        ans = null;

      }

      return ans;
    }


  /** Returns the last 10 weather getReports added to this weather station.
	 * <p>
	 * If there haven't been 10 reports added then return as many as has been added.
   *
   * @return an array of the last 10 added WeatherReports (in the order
   *         that they were added). The most recently added report is the
   *         first element in the array.
   *         If there has been less than 10 reports added to this
   *         weatherstation, then returns as many reports as there is.
   *         The returned array must be the same size as the number of
   *         reports returned.
   */
  public WeatherReport[] getReports(){
    WeatherReport[] ans = null;
    if(weatherReports.length>= 10){
      ans = new WeatherReport[10];
      for(int x=0;x<10;x++){
        ans[x] = weatherReports[x];

      }
    }else{
      ans = new WeatherReport[weatherReports.length];
      for(int x=0;x<weatherReports.length;x++){
        ans[x] = weatherReports[x];
      }
    }

    return ans;
  }


  /** Returns a weather report with highest recorded temperature
   * of any report ever added to this WeatherStation.  If there have been
   * multiple reports with the same highest temperature, the most recently
   * added report is returned,.
   *
   * @return a WeatherReport that has the highest recorded temperature
   *         of any report ever added to this WeatherStation. Returns
   *         null if no report has ever been added to this weatherstation.
   */
  public WeatherReport getReportWithMaxTemp(){


    WeatherReport theOne = null;

    if(weatherReports.length>0) {


      WeatherReport[] ans = weatherReports;
      WeatherReport[] sortedAns;
      for (int i = 0; i < ans.length; i++) {
        for (int j = i + 1; j < ans.length; j++) {
          WeatherReport temp;
          int amountI = ans[i].getTime().getDay() * 1440 + ans[i].getTime().getHour() * 60 + ans[i].getTime().getMinute();
          int amountJ = ans[j].getTime().getDay() * 1440 + ans[j].getTime().getHour() * 60 + ans[j].getTime().getMinute();

          if (amountI > amountJ) {
            temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;
          }
        }
      }

      for (int i = 0; i < ans.length / 2; i++) {
        WeatherReport temp = ans[i];
        ans[i] = ans[ans.length - i - 1];
        ans[ans.length - i - 1] = temp;
      }
      sortedAns = ans;



      if (amountOfReports > 0) {
        for (int x = 0; x < amountOfReports; x++) {
          if (weatherReports[x].getTemperature().setScale(Scale.CELSIUS).getTemp() > highestInCel) {
            highestInCel = weatherReports[x].getTemperature().setScale(Scale.CELSIUS).getTemp();
            reportWithHighestTemp = weatherReports[x];
          }
        }
        theOne = reportWithHighestTemp;
      }

    }


    return theOne;




  }



  /**public WeatherReport[] weatherReportArraySorter(){
    WeatherReport[] ans = this.unsortedweatherReports;
    WeatherReport[] re;
    for (int i = 0; i<ans.length;i++){
      for (int j = i + 1; j < ans.length; j++){
        WeatherReport temp;
        int amountI = ans[i].getTime().getDay() * 1440 + ans[i].getTime().getHour() * 60 + ans[i].getTime().getMinute() ;
        int amountJ = ans[j].getTime().getDay() * 1440 + ans[j].getTime().getHour() * 60 + ans[j].getTime().getMinute() ;

        if (amountI > amountJ){
          temp = ans[i];
          ans[i] = ans[j];
          ans[j] = temp;
        }
      }
    }

    for(int i = 0; i < ans.length / 2; i++) {
      WeatherReport temp = ans[i];
      ans[i] = ans[ans.length - i - 1];
      ans[ans.length - i - 1] = temp;
    }
    re = ans;


    return re;

  }*/




  public static void main(String[] args) {






    WeatherStation weatherStationTest = new WeatherStation("YOW-Airport", 1);

    System.out.println(weatherStationTest.getMostRecentReport());



    Temperature t = new Temperature(2);
    TimeStamp time = new TimeStamp(16, 8, 30);
    WeatherReport wr = new WeatherReport(t, time, weatherStationTest);
    weatherStationTest.addReport(wr);
    System.out.println(weatherStationTest.getMostRecentReport());


    Temperature t1 = new Temperature(1);
    TimeStamp time1 = new TimeStamp(16, 8, 31);
    WeatherReport wr1 = new WeatherReport(t1, time1, weatherStationTest);
    weatherStationTest.addReport(wr1);
    System.out.println(weatherStationTest.getMostRecentReport());


    Temperature t2 = new Temperature(3);
    TimeStamp time2 = new TimeStamp(14, 8, 30);
    WeatherReport wr2 = new WeatherReport(t2, time2, weatherStationTest);
    weatherStationTest.addReport(wr2);
    System.out.println(weatherStationTest.getMostRecentReport());




    Temperature t3 = new Temperature(2);
    TimeStamp time3 = new TimeStamp(19, 8, 30);
    WeatherReport wr3 = new WeatherReport(t3, time3, weatherStationTest);
    weatherStationTest.addReport(wr3);
    System.out.println(weatherStationTest.getMostRecentReport());

    Temperature t4 = new Temperature(277000,Scale.KELVIN);
    TimeStamp time4 = new TimeStamp(13, 8, 31);
    WeatherReport wr4 = new WeatherReport(t4, time4, weatherStationTest);
    weatherStationTest.addReport(wr4);

    System.out.println(weatherStationTest.getMostRecentReport());




    //System.out.println(weatherStationTest.getMostRecentReport());


    /**System.out.println(weatherStationTest.getReportWithMaxTemp());
    System.out.println("");


    WeatherReport[] swag = weatherStationTest.getReports();
    for (int x =0; x<swag.length;x++){
      System.out.println(swag[x]);
    }
     */

  }



}
