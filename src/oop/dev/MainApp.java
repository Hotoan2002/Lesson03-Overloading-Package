package oop.dev;

public class MainApp {

	public static void main(String[] args) {
		// Nhap 3 hoc sinh, 3 giao vien.
		Student std1 = new Student("tuan" , 23 ,"man" , "hue" ,"1999");
		Student std2 = new Student("toan" , 20 ,"man" , "hue" ,"2002");
		Student std3 = new Student("nguyen" , 29 ,"man" , "hue" ,"1993");
		Teacher tc1 = new Teacher("binh", 35, "man" , "hue", 3);
		Teacher tc2 = new Teacher("tuan", 36 ,"man" , "hue", 3);
		Teacher tc3 = new Teacher("Nhi", 32 ,"man","hue", 3);
	}

}
