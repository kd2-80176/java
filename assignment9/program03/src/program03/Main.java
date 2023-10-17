package program03;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Student[] arr = new Student[5];
		arr[0] = new Student(1, "shekhar", "ahmednager", 96);
		arr[1] = new Student(2, "yash", "sangali", 69);
		arr[2] = new Student(4, "tanay", "jalna", 86);
		arr[3] = new Student(5, "dhanraj", "amravati", 69);
		arr[4] = new Student(4, "tanay", "sangali", 87);

		System.out.println("*************BEFORE SORTING****************");
		for (Student s : arr)
			System.out.println(s);
//		
//		Arrays.sort(arr);

//		System.out.println("after the sorting of student");
//		for (Student s : arr)
//			System.out.println(s);
//	

		class comparatorStudent implements Comparator<Student> {

			@Override
			public int compare(Student s1, Student s2) {

				int diff = -s1.getCity().compareTo(s2.getCity());
				if (diff == 0)
					diff = -(s1.getMarks().compareTo(s2.getMarks()));
				if (diff == 0)
					diff = s1.getName().compareTo(s2.getName());
				return diff;
			}
		}
		comparatorStudent studentName = new comparatorStudent();
		Arrays.sort(arr, studentName);
		System.out.println("*************AFTER SORTING****************");
		for (Student student : arr) {
			System.out.println(student);
		}

	}
}
