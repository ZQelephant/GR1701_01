import java.util.ArrayList;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Student>arrayList=new ArrayList<Student>();
		ScoreService service = new ScoreService();
		boolean isquit = true;
		boolean issubquit=false;
		int key=0;
		service.helpInfo();
		while (isquit) {
			key=sc.nextInt();
			switch (key) {
			case 1:
				service.addStudent(arrayList, sc);
				break;
			case 2:
				service.infoStudent(arrayList);
				break;
			case 3:
				service.helpsubInfo();
				issubquit=true;
				while (issubquit) {
					key=sc.nextInt();
					switch (key) {
					case 1:
						service.getMax(arrayList, "�ܳɼ�");
						break;
					case 2:
						service.getMax(arrayList, "���ĳɼ�");
						break;
					case 3:
						service.getMax(arrayList, "��ѧ�ɼ�");
						break;
					case 4:
						service.getMax(arrayList, "Ӣ��ɼ�");
						break;
					case 5:
						issubquit=false;
						
						break;

					default:
						break;
					}
				}
			case 4:
				isquit=false;
				break;

			default:
				break;
			}
		}
		System.out.println("�˳�ϵͳ");
	}
}
