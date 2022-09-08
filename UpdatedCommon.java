import java.util.*;

class Employee{
	
	public String Emp_name,Address,Mail_id,Mobile_no;
	public int Emp_id;
	double netSalary,grossSalary,da,hra,pf,club,basicPay;
	public String companyName="Space Tech Solutions ";
	
	void calculationGross (double pay) {
		da= pay*0.97;
		hra= pay*0.1;
		pf=pay*0.12;
		club=pay*0.001;
		grossSalary=pay+da+hra+pf+club;
		}
	
	void calculationNet() {
		netSalary=grossSalary-pf-club;
	}
	
	public void show() {
		System.out.println("\n\n-------------PAY SLIP-------------");
		System.out.println("Name        : "+Emp_name);
		System.out.println("Employee id : "+Emp_id);
		System.out.println("Address     : "+Address);
		System.out.println("Mobile No   : "+Mobile_no);
		System.out.println("----------------------------------");
		System.out.println("Basic Pay             : "+basicPay);
		System.out.println("Dearness Allowances   : "+da);
		System.out.println("House Rent allowances : "+hra);
		System.out.println("----------------------------------");
		System.out.println("Gross Salary  : "+grossSalary);
		System.out.println("Net Salary    : "+netSalary+"\n\n");
	}
}
class Programmer extends Employee{
	public Programmer(double pay){
		Emp_name="Ajithnath";
		Address="Chennai";
		Mail_id="ak@gmail.com";
		Mobile_no="1234567890";
		Emp_id=1234;
		basicPay=pay;
		 
		super.calculationGross(pay);
		super.calculationNet(); 
		super.show();
		
	}	
}
class Assistant_Professor extends Employee{
	public Assistant_Professor(double pay){
		Emp_name="Divyesh Prasad";
		Address="Hyderabad";
		Mail_id="dp@gmail.com";
		Mobile_no="7362884927";
		Emp_id=1235;
		basicPay=pay;
		 
		super.calculationGross(pay);
		super.calculationNet(); 
		super.show();
		
	}
}
class Associate_Professor extends Employee{
	public Associate_Professor(double pay){
		Emp_name="Harish Narayanan";
		Address="Coimbatore";
		Mail_id="hn@gmail.com";
		Mobile_no="7489565472";
		Emp_id=1236;
		basicPay=pay;
		 
		super.calculationGross(pay);
		super.calculationNet(); 
		super.show();
		
	}
}
class Professor extends Employee{
	public Professor(double pay){
		Emp_name="Karthika";
		Address="Kanyakumari";
		Mail_id="kk@gmail.com";
		Mobile_no="7362884927";
		Emp_id=1008;
		basicPay=pay;
		 
		super.calculationGross(pay);
		super.calculationNet(); 
		super.show();
	}
}
public class Common {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while(true) {
				System.out.print("1.Programmer \n2.Assistant Professor \n3.Associate Professor\n4.Professor\n5.Exit\nEnter the choice to generate payslip...");
				int choice = sc.nextInt();
				switch(choice) {
				case 1: Programmer pr=new Programmer(34000);
						break;
						
				case 2: Assistant_Professor ap=new Assistant_Professor(45000);
						break;
						
				case 3: Associate_Professor asp=new Associate_Professor(54000);
						break;
						
				case 4: Professor p=new Professor(60000);
						break;
						
				case 5: System.exit(choice);
				
				default : System.out.println("Enter a valid choice ....\n\n");
				
				}
			}
		}		
	}
}
