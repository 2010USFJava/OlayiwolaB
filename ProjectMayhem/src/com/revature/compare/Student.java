package com.revature.compare;

public class Student<implement> implements Comparable<Student>{
	//list method of comparing-implement comparable
		private int studentID;
		private String label;
		private double GPA;
		
		public Student() {
			
		}
		public Student(int studentID, String label, double gPA) {
			this.studentID = studentID;
			this.label = label;
			GPA = gPA;
		}
		
		public int getStudentID() {
			return studentID;
		}
		public void setStudentID(int studentID) {
			this.studentID = studentID;
		}
		public String getLabel() {
			return label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
		public double getGPA() {
			return GPA;
		}
		public void setGPA(double gPA) {
			GPA = gPA;
		}
		
		@Override
		public String toString() {
			return "Student [studentID=" + studentID + ", label=" + label + ", GPA=" + GPA + "]";
		}
		//Compare studentID
		@Override
		public int compareTo(Student arg0) {
			// TODO Auto-generated method stub
			return this.getStudentID()-arg0.getStudentID();
		}
}