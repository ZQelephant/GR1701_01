import java.util.ArrayList;
import java.util.Scanner;


public class Test {

	public static void  main(String[] args) {
		
	ArrayList<Employees> arrayList =new ArrayList<Employees>();
	
	Employee emp=new Employee();
	
	Scanner sc = new Scanner(System.in);
	
		boolean isQuit=true;
		
		String key;
		emp.help();
		while (isQuit) {			
			key=sc.next();				
			switch (key) {							
				case "Add":		
					System.out.println("����ӹ�Ա��Ϣ");
					emp.addEmployee(arrayList, sc);
					emp.infoEmployee(arrayList);				
					break;				
				case "Remove":				
				    //emp.removeEmployee(arrayList, name);
					break;
				case "Set":
					emp.setEmployee(arrayList, sc);
					break;
				case "Find":					
					//emp.findEmployee(arrayList, name);					
					break;
				case "Info":
					emp.infoEmployee(arrayList);
					break;
				case "Exit":
					isQuit=false;
					break;

				default:
					System.out.println("���������Ϣ����");
					break;
			}
		}
		System.out.println("�ݰ�~");
		
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
