package com.prowings.oop.patterns.abstractfactory;

public class ComputerFactory {
	
	public static Computer getComputer(ComputerAbstractFactory abstractFactory)
	{
			return abstractFactory.getComputer();
	}

}
