

public class Temperature{
	private double currentTemperature = -1;
	private Scale currentScale = null;



	/** Initializes a temperature object with given value in Celsius
	 *  <p>
	 *  If the initial temperature is less than -273.15C then the temperature
	 *  object will be initialized with -273.15C.
   *
	 * @param temp is the initial temperature in Celsius.
	 */
  public Temperature(double temp){
  	this(temp,Scale.CELSIUS);



  }


	/** Initializes a temperature object with given value using the specified scale
   * <p>
	 * If the temperature is lower than absolute zero, in the given scale,
	 * then set the temperature to absolute zero (in that scale).
   * <p>
 	 * Usage: new Temperature(12.3, Scale.KELVIN)
	 *
	 * @param temp is the initial temperature in the scale provided in
   *        the second argument.
	 * @param scale is the scale of initial temperature and must be a constant
	 *        defined in the Scale enum type.
	 */
  public Temperature(double temp, Scale scale){
  	if(scale.equals(Scale.KELVIN) && temp<0){
  		this.currentTemperature = 0;
  		this.currentScale = Scale.KELVIN;
  	}else if(scale.equals(Scale.CELSIUS) && temp<-273.15){
		this.currentTemperature = -273.15;
		this.currentScale = Scale.CELSIUS;
	}else if(scale.equals(Scale.FAHRENHEIT) && temp<-459.67){
		this.currentTemperature = -459.67;
		this.currentScale = Scale.FAHRENHEIT;
  	}else{
  		this.currentTemperature = temp;
  		this.currentScale = scale;
	}
  }

	/** Initializes a new temperature object that is a copy of the
   *  temperature object parameter.
   *
   * That is, it makes a new object that is a copy of the input object.
   *
	 * @param temp is a non-null temperature object
	 */
  public Temperature(Temperature temp){
  	String scale = String.valueOf(temp.getScale());
  	if(scale.substring(0,1).equals("K") || (scale.substring(0,1)).equals("k")){
		  this.currentTemperature = temp.getTemp();
		  this.currentScale = Scale.KELVIN;
  	}if(scale.substring(0,1).equals("C") || (scale.substring(0,1)).equals("c")){
		  this.currentTemperature = temp.getTemp();
		  this.currentScale = Scale.CELSIUS;
  	}if(scale.substring(0,1).equals("F") || (scale.substring(0,1)).equals("f")){
		  this.currentTemperature = temp.getTemp();
		  this.currentScale = Scale.FAHRENHEIT;
  	}


  }



	/** getter for the scale
	 * <p>
	 * The output of this getter method must always be the first letter of one
	 * of the names in the Scales enum class. It must be the upper case letter.
	 * <p>
	 * Example: t = new Temperature(12.3, Scale.KELVIN);
	 *          t.getScale() will then output 'K'
	 *
	 * @return the first letter (in upper case) of the string representation of the
	 *         current scale of this object.
	 */
  public char getScale(){
  	char ans = 'a';
  	if((this.currentScale).equals(Scale.KELVIN)){
  		ans = 'K';
	}if((this.currentScale).equals(Scale.CELSIUS)){
  		ans = 'C';
  	}if((this.currentScale).equals(Scale.FAHRENHEIT)){
  		ans = 'F';
	  }
  	return ans;
  }

	/** getter for the temperature
	 *
	 * @return the temperature of the object using the current scale
	 */
  public double getTemp(){
  	return this.currentTemperature;
  }


  /**
	 * helper function to get the temperature in kelvin
	 *
	 *
	 * @param temp is a temperture object
	 * @return the temperature in kelvin
	 */
  private double kelvinConverter(){
	  double amountInKelvin = 0.0;
	  String scale = String.valueOf(this.getScale());
	  if(scale.substring(0,1).equals("K") || (scale.substring(0,1)).equals("k")){
		  amountInKelvin = this.getTemp();
	  }if(scale.substring(0,1).equals("C") || (scale.substring(0,1)).equals("c")){
		  amountInKelvin = this.getTemp() + 273.15;
	  }if(scale.substring(0,1).equals("F") || (scale.substring(0,1)).equals("f")){
		  amountInKelvin = (this.getTemp() + 459.67) * 5/9;
	  }
	  return amountInKelvin;
  }

  /** setter for scale
	 *
	 * @param scale is the new scale of the temperature and must be
	 *        a constant from the Scale enum type. The next time you
	 *        call getTemp(), the temperature will be output in this scale.
   * @return a reference to this object.
	 */
  public Temperature setScale(Scale scale){
  	double amountInKelvin = 0.0;
  	if((this.currentScale).equals(Scale.KELVIN)){
  		amountInKelvin += this.currentTemperature;
	}if((this.currentScale).equals(Scale.CELSIUS)){
		  amountInKelvin += this.currentTemperature + 273.15;
  	}if((this.currentScale).equals(Scale.FAHRENHEIT)){
  		amountInKelvin += (this.currentTemperature + 459.67) * 5/9;
  	}


  	if(scale.equals(Scale.KELVIN)){
  		this.currentTemperature = amountInKelvin;
  		this.currentScale = Scale.KELVIN;

	}if(scale.equals(Scale.CELSIUS)){
		  this.currentTemperature = amountInKelvin - 273.15;
		  this.currentScale = Scale.CELSIUS;

  	}if(scale.equals(Scale.FAHRENHEIT)){
		  this.currentTemperature = amountInKelvin * 9/5 - 459.67;
		  this.currentScale = Scale.FAHRENHEIT;
  	}

  	return this;  // do NOT change this return statement.
	}


	/** setter for temperature
	 *
	 * @param temp is the new temperature (in the object's current scale)
   * @return a reference to this object.
	 */
  public Temperature setTemp(double temp){
    this.currentTemperature = temp;
    return this;  // do NOT change this return statement.
	}

	/** setter for temperature
	 *
	 * @param temp is the new temperature
	 * @param scale is the scale of the new temperature. It must be
	 *        a constant from the Scale enum type.
   * @return a reference to this object.
   */
  public Temperature setTemp(double temp, Scale scale){
	  if(scale.equals(Scale.KELVIN) && temp<0){
		  this.currentTemperature = 0;
		  this.currentScale = Scale.KELVIN;
	  }else if(scale.equals(Scale.CELSIUS) && temp<-273.15){
		  this.currentTemperature = -273.15;
		  this.currentScale = Scale.CELSIUS;
	  }else if(scale.equals(Scale.FAHRENHEIT) && temp<-459.67){
		  this.currentTemperature = -459.67;
		  this.currentScale = Scale.FAHRENHEIT;
	  }else{
		  this.currentTemperature = temp;
		  this.currentScale = scale;
	  }

  	return this;  // do NOT change this return statement.
	}

	/** setter for temperature
	 *
	 * @param temp is the new temperature.
	 * @param scale is a string representing one of the three scales.
   * @return a reference to this object.
   */
  public Temperature setTemp(double temp, String scale){
  	boolean fin = false;
  	if(scale.substring(0,1).equals("K") || (scale.substring(0,1)).equals("k")){
  		if(temp<0){
			this.currentTemperature = 0;
			this.currentScale = Scale.KELVIN;
			fin = true;
		}
	}if(scale.substring(0,1).equals("C") || (scale.substring(0,1)).equals("c")){
  		if(temp<-273.15){
			this.currentTemperature = -273.15;
			this.currentScale = Scale.CELSIUS;
			fin = true;
		}
  	}if(scale.substring(0,1).equals("F") || (scale.substring(0,1)).equals("f")){
  		if(temp<-459.67){
			this.currentTemperature = -459.67;
			this.currentScale = Scale.FAHRENHEIT;
			fin = true;
		}
  	}
  	if(fin == false){
		if(scale.substring(0,1).equals("K") || (scale.substring(0,1)).equals("k")){
			this.currentTemperature = temp;
			this.currentScale = Scale.KELVIN;

		}if(scale.substring(0,1).equals("C") || (scale.substring(0,1)).equals("c")){
			this.currentTemperature = temp;
			this.currentScale = Scale.CELSIUS;
		}if(scale.substring(0,1).equals("F") || (scale.substring(0,1)).equals("f")){
			this.currentTemperature = temp;
			this.currentScale = Scale.FAHRENHEIT;
		}

	}




  	return this;  // do NOT change this return statement.
  }













	/* ------------------------------------------------- */
	/* ------------------------------------------------- */
  /* do not change anything below this                 */
  /* ------------------------------------------------- */
	/* ------------------------------------------------- */

  /** String representation of a temperature object    */
  @Override
  public String toString(){
    return "" + this.getTemp() + this.getScale();
  }



	public static void main(String[] args){
		Temperature testTemp = new Temperature(0,Scale.FAHRENHEIT);
		System.out.println(testTemp.toString());
		//testTemp.setScale(Scale.CELSIUS);
		System.out.println(testTemp.toString());
		testTemp.setTemp(-10000000,"cererere");
		System.out.println(testTemp.toString());


	}

}

