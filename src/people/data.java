package people;

public class data {
	public void sample() {
//whole number
		byte rollnumber=126;
		short idnumber=31234;
		int examnumber=137876762;
		long centrenumber=876536726726l;
		System.out.println(rollnumber);
		System.out.println(idnumber);
		System.out.println(examnumber);
		System.out.println(centrenumber);
		
// decimal numbers
		float percentage=999999.949f;
		double overallpercentage=10000.9999;
		System.out.println(percentage);
		System.out.println(overallpercentage);
		
//character
		char team='a';
		String groub="dell";
		System.out.println(team);
		System.out.println(groub);
//condition
		boolean team1=false;
		System.out.println("team a is"+' '+team1);
		
	}
	private void empdetail() {
		System.out.println("employee salary:1200000");
	}
	public static void main(String[] args) {
		data v=new data();
		v.sample();
	}
	
}
