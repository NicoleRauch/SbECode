package fixtures_solution;

public class InitialiseConverters {
	static {
		fitnesse.slim.converters.ConverterRegistry.addConverter(boolean.class, new BooleanConverter());
		fitnesse.slim.converters.ConverterRegistry.addConverter(Boolean.class, new BooleanConverter());
	}
}
