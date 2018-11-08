package com.company;
import java.util.Random;

public class Application {

	public static void main(String[] args) {

		System.out.println("***************************");
		System.out.println("First part of task with *");
		System.out.println("***************************");
		System.out.println();

		// Random mark generator
		Random rnd= new Random();
		Student st=new Student();

		Ticket ticket=new Ticket();
		ticket.fillTickets(); // genarating pool of tickets

		int sum=0;
		double average=0;

		//Form group of Students (array of 5 students)
		String students[]=new String[5];

		//Student's results array
		int results[]=new int[5];

		for (int i=0;i<5;i++){
			//System.out.println(i);
			students[i]=st.getStudent();
			results[i]=st.getMark();
			//sum=sum+results[i];
			System.out.println("Student: "+ students[i] +", mark is: " + results[i]+", Ticket was: " + ticket.getTicket(rnd.nextInt(10)));
		}

		for (int i=0;i<5;i++) {
			sum = sum + results[i];
		}
		average=(double)sum/5;
		System.out.println("Average mark is: "+ average);

		// Second part of task with *
		System.out.println();
		System.out.println("***************************");
		System.out.println("Second part of task with *");
		System.out.println("***************************");
		System.out.println();
		Group gr1=new Group();
		gr1.createGroup();
		System.out.println("First Group's average mark is: "+ gr1.groupAverage());

		Group gr2=new Group();
		gr2.createGroup();
		System.out.println("Second Group's average mark is: "+ gr2.groupAverage());

		if(gr2.getBestMark()>gr1.getBestMark()){
			System.out.println("Best Student is: "+ gr2.getBestStudent()+ ", his mark is: "+ gr2.getBestMark());
		}
		else System.out.println("Best Student is: "+ gr1.getBestStudent()+ ", his mark is: "+ gr1.getBestMark());

		if(gr1.getWorstMark()>gr2.getWorstMark()){
			System.out.println("Worst Student is: "+ gr2.getWorstStudent()+ ", his mark is: "+ gr2.getWorstMark());
		}
		else System.out.println("Worst Student is: "+ gr1.getWorstStudent()+ ", his mark is: "+ gr1.getWorstMark());


	}






}
