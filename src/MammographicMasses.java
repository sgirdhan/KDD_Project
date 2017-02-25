

public class MammographicMasses {
	
	private int biRadsAssement = 2 ;
	private int age = 5;
	private int shape = 31;
	private int margin = 48;
	private int density = 76;
	private int severity = 0;
	
	
	
	public MammographicMasses(int biRadsAssement, int age, int shape, int margin, int density, int severity) {
		super();
		this.biRadsAssement = biRadsAssement;
		this.age = age;
		this.shape = shape;
		this.margin = margin;
		this.density = density;
		this.severity = severity;
	}
	
	public MammographicMasses() {
		// TODO Auto-generated constructor stub
	}

	public int getBiRadsAssement() {
		return biRadsAssement;
	}
	public void setBiRadsAssement(int biRadsAssement) {
		this.biRadsAssement = biRadsAssement;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getShape() {
		return shape;
	}
	public void setShape(int shape) {
		this.shape = shape;
	}
	public int getMargin() {
		return margin;
	}
	public void setMargin(int margin) {
		this.margin = margin;
	}
	public int getDensity() {
		return density;
	}
	public void setDensity(int density) {
		this.density = density;
	}
	public int getSeverity() {
		return severity;
	}
	public void setSeverity(int severity) {
		this.severity = severity;
	}
	
	
	
	
}
