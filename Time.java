public class Time{
	
	public static void printAmerican(String day, String month, int date, int year){
		System.out.println(day + "," + month + date + "," + year);
		}
	public static void printEuropean(String day, String month, int date, int year){
		System.out.println(day + " "+ date+ " " + month + " "+year);
		}
	
	
	public static void main(String[] args){
			String day = " Monday ";
			int date = 14;
			String month = " September ";
			int year = 2026;
			printAmerican("Monday", "September", 14, 2026);
			printEuropean("Monday", "September", 14, 2026);
		}
}
