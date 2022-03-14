package fixtures_solution;

import fitnesse.slim.converters.ConverterRegistry;

public class InitialiseConverters {
	static {
		ConverterRegistry.addConverter(boolean.class, new BooleanConverter());
		ConverterRegistry.addConverter(Boolean.class, new BooleanConverter());
	}
}
