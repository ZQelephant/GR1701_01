import java.util.ArrayList;
import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		
		ArrayList<Shop>arrayList= new ArrayList<Shop>();
		
		Scanner sc = new Scanner(System.in);
		
		ShopServoce shopServoce= new ShopServoce();
		
		boolean  key= true;
		
		shopServoce.helpinfo();
		
		String s;
		while (key) {
			s=sc.nextLine();
			switch (s) {
			case "1":
				System.out.println("¼����Ʒ��Ϣ������Ʒ��š����ơ��۸񡢳�ʼ����");
				shopServoce.addShop(arrayList, sc);;
				
				break;
			case "2":
				System.out.println("�����Ʒ ���磺��ţ���������");
				shopServoce.stockshop(arrayList, sc);
				break;
			case "3":
				System.out.println("�����Ʒ ���磺��ţ���������");
				shopServoce.sellshop(arrayList, sc);
				break;
			case "4":
				
				shopServoce.infoshop(arrayList);
				break;
			case "5":
				key=false;
			
				break;

			default:
				System.out.println("����");
				break;
			}
		}
		System.out.println("�˳�ϵͳ");
		
	}

}
