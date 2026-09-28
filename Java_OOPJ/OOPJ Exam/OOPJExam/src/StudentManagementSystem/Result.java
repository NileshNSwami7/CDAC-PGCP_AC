package StudentManagementSystem;

import java.time.LocalDate;
import java.util.Objects;

public class Result {
	
	private int studentId;
	private String name;
	private String subject;
	private int marks;
	private Grade grade; 
	private LocalDate date;
	
	public Result(int studentId, String name, String subject, int marks) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.subject = subject;
		this.marks = marks;
		this.grade = GradeCal(marks);
		this.date = LocalDate.now();
	}
	

	public Grade GradeCal(int marks) {
		if(marks>=75) {
			return Grade.DISTINCTION;
		}else if(marks>=65&& marks<75) {
			return Grade.FIRST_CLASS;
		}else if(marks>=50&& marks<45) {
			return Grade.SECOND_CLASS;
		}else if(marks>=45) {
			return Grade.PASS;
		}else {
			return Grade.FAIL;
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	

	public Grade getGrade() {
		return grade;
	}


	public void setGrade(Grade grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "Result [studentId=" + studentId + ", name=" + name + ", subject=" + subject + ", marks=" + marks
				+ ", grade=" + grade + ", date=" + date + "]";
	}

	
	
	
	

}
