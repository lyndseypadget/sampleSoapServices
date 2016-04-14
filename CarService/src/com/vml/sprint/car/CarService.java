package com.vml.sprint.car;

import com.vml.sprint.car.models.Car;
import com.vml.sprint.car.models.Wheel;

public class CarService {
	public Car getCar() {
		Car c = new Car();
		
		c.color = "red";
		c.driver = "John";
		
		Wheel w0 = new Wheel();
		w0.diameter = 5;
		
		Wheel w1 = new Wheel();
		w1.diameter = 5;
		
		c.wheel = new Wheel[2];
		c.wheel[0] = w0;
		c.wheel[1] = w1;
		
		return c;
	}
}
