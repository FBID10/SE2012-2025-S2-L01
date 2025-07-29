import java.util.Scanner;


public class Marks{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of students in the class");
		int n=sc.nextInt();
		int StudentSubject[][]=new int[n][3];
		String[] Subject={"Combined Maths","Physics","Chemistry"};
		Marks obj=new Marks();
		
        
	
		
		while(true){
			
			System.out.println("\n===== MENU =====");
            		System.out.println("1. Add");
           		System.out.println("2. Update");
			System.out.println("3. Subject Average");
            		System.out.println("4. Average Student");
			System.out.println("5. Total Marks of a Student");
            		System.out.println("6. Exit");
            		System.out.print("Enter your choice: ");
			int Menu=sc.nextInt();
		switch(Menu){
			
		
			case 1:
			for(int i=0;i<n;i++){
				System.out.printf("Enter Student %d subject marks\n",i+1);	
				obj.Marks(StudentSubject, sc, Subject, i);
				System.out.println("");
			}
			break;
			
			case 2:
			
			obj.Update(StudentSubject, sc,n);
			break;
			case 3:
			obj.AverageOfSubject(StudentSubject,sc,n);
			break;
			case 4:
			obj.AverageOfStudent(StudentSubject,sc,n);
			break;
			
			case 5:
			obj.TotalMarksStudent(StudentSubject,sc,n);
			break;
			case 6:
			System.out.println("Exiting");
			return;
			
			default:	
			System.out.println("Invalid");
			}
		}
			
		}	
	private void Marks(int StudentSubject[][],Scanner sc,String[] Subject,int i){
			
			
			for(int j=0;j<3;j++){
				System.out.printf("Enter %s marks: ",Subject[j]);
				StudentSubject[i][j]=sc.nextInt();
			
			
			}
		 
	}
	private void Update(int StudentSubject[][],Scanner sc,int n){
		
		System.out.println("Enter Student ID to be changed");
		int k=sc.nextInt()-1;
		System.out.println("Enter Subject ID to be changed");
		int l=sc.nextInt()-1;
		
		if((k>=0 && k<n)&&(l>=0 && l<3)){
			System.out.printf("Enter the Subject marks to be updated:\n");
			StudentSubject[k][l]=sc.nextInt();
			
		}else{
			System.out.println("Invalid subject ID or Student ID");
		}
		
	}
	private void AverageOfSubject(int StudentSubject[][],Scanner sc,int n){
		System.out.println("Enter the Subject id for the average");
		int j=sc.nextInt();

		int Total=0;
		if(j>0 && j<=3){ 
			j--;
			for(int i=0;i< n;i++){
				Total +=StudentSubject[i][j];
			}
		double Average=Total/n*1.0;
		System.out.printf("Average of the Subject %d is %.2f%n",j+1,Average);
		}else{
			System.out.println("Invalid Subject index");
		}
		
			
	}
	private void AverageOfStudent(int StudentSubject[][],Scanner sc,int n){
		System.out.println("Enter the student id for the average");
		int j=sc.nextInt();
		
		if(j>0 && j<=n){ 
		j--;
		int Total=0;


		for(int i=0;i<3;i++){
			Total +=StudentSubject[j][i];
			}
		double Average=Total/3.0;
		System.out.printf("Average of the student %d is %.2f%n",j+1,Average);
		}else{
			System.out.println("Invalid student index");
			}
		
		
	}
	private void TotalMarksStudent(int StudentSubject[][],Scanner sc,int n){
		System.out.println("Enter the student id for the Total");
		int j=sc.nextInt();
		
		if(j>0 && j<=n){ 
		j--;
		int Total=0;


		for(int i=0;i< 3;i++){
			Total +=StudentSubject[j][i];
			}
		
		System.out.printf("Total of the student %d is %d\n",j+1,Total);
		}else{
			System.out.println("Invalid student index");
			}
		
						
	}
}
		