package com.revature.compare;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareMain {

	public static void main(String[] args) {
		// TStudent<implement>o-generated method stub
		List<Student>studentList = new ArrayList<Student>();
		studentList.addAll(Arrays.asList(
				new Student[] {
						new Student(9,"matt",7.22),
						new Student(10,"ola",5.22),
						new Student(8,"yomi",4.22),
						new Student(7,"mic",6.22),
						new Student(5,"nikky",8.22),
						new Student(6,"solo",1.22),
						new Student(1,"deola",3.22),
						new Student(2,"ade",0.22)
		}));
		System.out.println("Original list");
		for(Student s: studentList) {
			System.out.println(s);
		}
		System.out.println("==============");
		Collections.sort(studentList);
		System.out.println("sorted by studentID");
		for(Student s: studentList) {
			System.out.println(s);
	}
		System.out.println("==============");
		Collections.sort(studentList, new StudentComparator());//arraylist, comparator method
		System.out.println("sorted by GPA");
		for(Student s: studentList) {
			System.out.println(s);
}
		System.out.println("==============");
		System.out.println("sorted by labeL using lambda");
		Collections.sort(studentList,(arg0,arg1)
				->{
					return arg0.getLabel().compareTo(arg1.getLabel());
				});
		for(Student s: studentList) {
			System.out.println(s);
}
		}
}