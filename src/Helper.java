

public class Helper {
	
	public static String getShapeName(int value)
	{
		if(value == 1)
			return Constants.Shape.round;
		else if(value ==2)
			return Constants.Shape.oval;
		else if(value==3)
			return Constants.Shape.lobular;
		else if(value == 4)
			return Constants.Shape.irregular;
		else
			return null;
	}
	
	public static String getMarginName(int value)
	{
		if(value == 1)
			return Constants.Margin.circumscribed;
		else if(value ==2)
			return Constants.Margin.microlobulated;
		else if(value==3)
			return Constants.Margin.obscured;
		else if(value == 4)
			return Constants.Margin.illDefined;
		else if(value == 5)
			return Constants.Margin.spiculated;
		else
			return null;
	}
	
	public static String getDensityName(int value)
	{
		if(value == 1)
			return Constants.Density.high;
		else if(value ==2)
			return Constants.Density.iso;
		else if(value==3)
			return Constants.Density.low;
		else if(value == 4)
			return Constants.Density.fatContaining;
		else
			return null;
	}
	public static String getSeverityName(int value)
	{
		if(value == 0)
			return Constants.Severity.benign;
		else if(value ==1)
			return Constants.Severity.malignant;
		else
			return null;
	}
}
