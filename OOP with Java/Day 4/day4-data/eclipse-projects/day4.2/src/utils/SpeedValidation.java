package utils;

import custom_exception.SpeedOutOfBoundsException;

public class SpeedValidation {
//define speed range
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	//init static members
	static {
		MIN_SPEED=40;
		MAX_SPEED=80;
	}
	//add a static method to validate speed
	public static void validateSpeed(int speed) throws SpeedOutOfBoundsException
	{
		if(speed < MIN_SPEED)
			throw new SpeedOutOfBoundsException("You Are driving too slow !!!!!!!");
		//=> speed >= min speed
		if(speed > MAX_SPEED)
			throw new SpeedOutOfBoundsException("You Are driving too Fast , FATAL !!!!!");
					//=> speedn within range
		System.out.println("Speed within the range!");
	}
}
