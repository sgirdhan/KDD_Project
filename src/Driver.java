import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IFileHandler handler = new FileHandler("mammographic_masses.data.txt");
		ArrayList<MammographicMasses> mmList = handler.readFile();
		// confirm input size;
		System.out.println(mmList.size());
		
		for(MammographicMasses mm : mmList)
		{
			System.out.println("-------------------------------------------");
			System.out.println("BI Rad :" + mm.getBiRadsAssement());
			System.out.println("Age :" + mm.getAge() );
			System.out.println("Shape :" + mm.getShape() + " - " + Helper.getShapeName(mm.getShape()));
			System.out.println("Margin:" + mm.getMargin() + " - " + Helper.getMarginName(mm.getMargin()));
			System.out.println("Density:" + mm.getDensity() + " - " + Helper.getDensityName(mm.getDensity()));
			System.out.println("Severity:" + mm.getSeverity() + " - " + Helper.getSeverityName(mm.getSeverity()));
			System.out.println("-------------------------------------------");
		}
		
	}

}
