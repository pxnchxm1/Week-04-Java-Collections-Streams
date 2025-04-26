package com.test;

public class TemperatureConverter {
	public double celsiusToFahrenheit(double celsius){
		return (celsius * 1.8) + 32;
	}
	public double fahrenheitToCelsius(double fahrenheit){
		return (fahrenheit - 32) / 1.8 ;
	}

}
