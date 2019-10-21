package comp1406a2;

/** A very simple database storing weather data */
public class WeatherDatabase{

	/* ----------------------------------- */
	/* do NOT change this constructor      */
	/* ----------------------------------- */

	/** Creates an empty weather database  */
	public WeatherDatabase(){}

	/* ----------------------------------- */








	int amountOfStations = 0;
	WeatherStation[] weatherStationsDB = new WeatherStation[0];

	//
	// You need to complete these methods.
	//
	// Unless stated, you will need to change the return
	// value of each of these methods as well as add the actual
	// body of the methods.
	//



	/** Returns all weather stations in the database
	* in no particular order
	*
	* @return an array containing all weather stations that are in
	*         this database. Note that the size of the array should be equal to
	*         the result of <code>this.numberOfWeatherStations()</code>.
	*/
	public WeatherStation[] getWeatherStations(){

		return weatherStationsDB;
	}

	/** Returns the number of weather stations in the database
	*
	* @return the number of weather stations in this database
	*/
	public int numberOfWeatherStations(){
		return amountOfStations;
	}


	/** adds a weather station to this database
		* @param station is the weather station to add. It will always be non-null.
		* @return this weather station.
		*/
	public WeatherDatabase addWeatherStation(WeatherStation station){
		WeatherStation[] tempDB = new WeatherStation[amountOfStations];
		for (int x=0; x<amountOfStations;x++){
			tempDB[x] = weatherStationsDB[x];
			//System.out.println(weatherStationsDB[x]);
		}
		amountOfStations += 1;
		weatherStationsDB = new WeatherStation[amountOfStations];
		weatherStationsDB[0] = station;

		for (int x=0;x<tempDB.length;x++){
			weatherStationsDB[x+1] = tempDB[x];

		}



		return this;    // do NOT change the return statement
	}


	/** removes weather station with given id from this database
		* @param id is the ID number of the weather station to remove.
		* @return true if the specified weather station is successfully removed,
		*         returns false otherwise (i.e., if there was no weather station
		*         with the specified ID number in this database to begin with).
		*/
	public boolean removeWeatherStation(int id){
		boolean ans = false;
		int pos = 0;
		/**System.out.println(weatherStationsDB[0]);//
		System.out.println(weatherStationsDB[1]);//
		System.out.println(weatherStationsDB[2]);//*/
		for (int x=0;x<amountOfStations;x++){
			if(weatherStationsDB[x].getID() == id){
				ans = true;
				pos = x;
			}
		}
		if(ans == true){
			amountOfStations = amountOfStations - 1;
			WeatherStation[] tempWeatherStationsDB = new WeatherStation[weatherStationsDB.length];
			for (int x = 0; x<weatherStationsDB.length;x++){
				tempWeatherStationsDB[x] = weatherStationsDB[x];
			}
			weatherStationsDB = new WeatherStation[amountOfStations];
			int counter = 0;
			for (int x=0; x<tempWeatherStationsDB.length;x++){
				if(tempWeatherStationsDB[x].getID() != id){
					weatherStationsDB[counter] = tempWeatherStationsDB[x];
					counter +=1;
				}
			}
		}

		return ans;
	}


	/** returns the highest temperature ever recorded by any weather station
	  * in the data base.
	  */
	public Temperature getMaxTemperature(){
		double maxCel = -1000.0;
		Temperature maxTemp = null;
		for(int x=0;x<amountOfStations;x++){
			if(weatherStationsDB[x].getReportWithMaxTemp().getTemperature().setScale(Scale.CELSIUS).getTemp() > maxCel){
				maxCel = weatherStationsDB[x].getReportWithMaxTemp().getTemperature().setScale(Scale.CELSIUS).getTemp();
				maxTemp = weatherStationsDB[x].getReportWithMaxTemp().getTemperature();
			}
		}

		return maxTemp;
	}


	/** returns the highest temperature on a specified day
		* that is recorded in a report in the weather stations in this database.
		*
		* @param day is the day to find the max temperature on. Note that this
		*            might be the special max temperature day that a
		*            weather station records.
		* @return  the temperature object with the highest recorded Temperature
		*          in the data base on the specified day.
		*/
	public Temperature getMaxTemperature(int day){
		double maxCel = -1000.0;
		Temperature maxTemp = null;
		for (int x=0;x<weatherStationsDB.length;x++){
			for (int y=0;y<weatherStationsDB[x].getReports().length;y++){
				if(weatherStationsDB[x].getReports()[y].getTime().getDay() == day){
					if(weatherStationsDB[x].getReports()[y].getTemperature().setScale(Scale.CELSIUS).getTemp() >= maxCel){
						maxCel = weatherStationsDB[x].getReports()[y].getTemperature().setScale(Scale.CELSIUS).getTemp();
						maxTemp = weatherStationsDB[x].getReports()[y].getTemperature();
					}
				}

			}
		}

		return maxTemp;
	}

	/** Computes the average temperature (over all weather stations) for the
	*  time period starting at startDay and ending at endDay (inclusive)
	*
	* @param startDay is the starting day
	* @param endDay is the ending endDay
	* @return the average temperature of all temperature reports for the time
	*         period startDay to endDay (inclusive) taken from all weather
	*         stations in this weather database. The average temperature
	*         should be returned in the CELSUIS scale.
	*/
	public double averageTemperature(int startDay, int endDay){
		double amountInCel = 0.0;
		double averageInCel = 0.0;
		int amountOfDays = 0;
		for (int x=0;x<weatherStationsDB.length;x++){
			for (int y=0;y<weatherStationsDB[x].getReports().length;y++){
				if (weatherStationsDB[x].getReports()[y].getTime().getDay() >= startDay && weatherStationsDB[x].getReports()[y].getTime().getDay() <= endDay){
					amountInCel += weatherStationsDB[x].getReports()[y].getTemperature().setScale(Scale.CELSIUS).getTemp();
					amountOfDays += 1;
				}
			}
		}

		averageInCel = amountInCel/amountOfDays;

		return averageInCel;
	}




}
