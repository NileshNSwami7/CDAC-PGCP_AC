public class GradeSystem{
	public static void main(String args[]){
	 int marksMaths = 80;
	 int marksScience = 85;
	 int marksHistory = 90;
	 
	 int totalMarks = (marksMaths + marksScience + marksHistory) / 3;
	 
	 if(totalMarks>=95){
		System.out.println("Grade A");
		}
		else if(totalMarks>=70 && totalMarks<=89){
			System.out.println("Grade B");
		}
		else if(totalMarks>70 && totalMarks<89){
			System.out.println("Grade C");
		}
		else if(totalMarks>50 && totalMarks<69){
			System.out.println("Grade D");
		}else if(totalMarks<30){
			System.out.println("GRADE Fail");
		}
	}
}		