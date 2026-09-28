package StudentManagementSystem;


import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StudentMain {
	static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {
		List<Result>studentslist = new ArrayList<>(); 
		int num=0;
		do {
			
			System.out.println("1.Add new Entry.");
			System.out.println("2.Display Result.");
			System.out.println("3.Calculate Avarage Marks.");
			System.out.println("4.Find top Scorer.");
			System.out.println("5.Disaply Sorted Marks.");
			System.out.println("6.Exit.");
			num = sc.nextInt();
			
			switch(num) {
				case 1:{
					addStudents(studentslist);
					break;
				}
				case 2:{
					displayResult(studentslist);
					break;
				}
				case 3:{
					calculateAvarage(studentslist);
					break;
				}
				case 4:{
					topScorer(studentslist);
					break;
				}
				case 5:{
					sortedByMarks(studentslist);
					break;
				}
				case 6:{
					System.exit(0);
				}
			}
		}while(num != 6);
		
	}
	
	public static void addStudents(List<Result>studentslist) {
	
		for(int i=0;i<3;i++) {
			String studId ="";
			int Id=0;
			studId += (int)(Math.random()*1000);
			if(studId.length()<2)
				studId+="0";
			Id = Integer.parseInt(studId);
			System.out.println("Add Name");
			String name=sc.next();
			System.out.println("Add Subject");
			String subject=sc.next();
			System.out.println("Add Marks");
			int marks=sc.nextInt();
			Result students = new Result(Id,name,subject,marks);
			studentslist.add(students);
		}
		System.out.println("Result added Successfully.");
		for(Result r : studentslist) {
			System.out.println(r);
		}
	}
	
	public static void displayResult(List<Result>studentslist) {
		String g = sc.next().toUpperCase();
		Predicate<Result>namedByGrade = r->r.getGrade()==Grade.valueOf(g);
		studentslist.stream().filter(namedByGrade).forEach(System.out::println);		
	}
	
	public static void calculateAvarage(List<Result>studentslist) {
		System.out.println("Give Subject name.");
		String sub = sc.next();
		Predicate<Result>namedbySubject = r->r.getSubject().equalsIgnoreCase(sub);
		OptionalDouble marks = studentslist.stream().filter(namedbySubject).mapToDouble(Result::getMarks)
		.average();
		if(marks.isPresent()) {
			System.out.printf("%.2f",marks.getAsDouble());
			System.out.println();
		}
		
	}
	
	public static void topScorer(List<Result>studentslist) {
		Optional<Result> score = studentslist.stream().max(Comparator.comparingDouble(Result::getMarks));
		if(score.isPresent()) {
			System.out.println(score.get());
		}
	}
	
	public static void sortedByMarks(List<Result>studentslist) {
		
		List<Result>list=studentslist.stream().sorted(Comparator.comparingLong(Result::getMarks).reversed()).collect(Collectors.toList());
		
		for(Result r : list) {
			System.out.println(r);
		}
	}
}
