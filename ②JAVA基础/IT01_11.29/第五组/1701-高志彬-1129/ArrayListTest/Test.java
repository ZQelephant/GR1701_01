import java.util.ArrayList;

/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��29�� ����10:15:18 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
		
		ArrayList<Employees> arrayList =new ArrayList<Employees>();
		Employees e =new Employees("0301", "��δ��", 4500, "2012.12.24", "���ز�");
		arrayList.add(e);
		arrayList.add(new Employees("0302", "����", 4700, "2012.12.24", "������"));
		arrayList.add(new Employees("0303", "���", 6500, "2011.11.11", "������"));
		arrayList.add(new Employees("0304", "������", 8500, "2006.06.06", "���в�"));
		arrayList.add(new Employees("0305", "������", 5500, "2017.07.07", "���鲿"));
		arrayList.add(new Employees("0306", "��ĬĬ", 3500, "2015.12.25", "���ز�"));
		
		System.out.println();
		System.out.println(arrayList.size());
		System.out.println();
		arrayList.get(1);
		e.setSalary(6000);
		arrayList.set(0, e);
		System.out.println();
		arrayList.remove(e);
		Employees e1 =arrayList.get(0);
		String s=e1.toString();
		System.out.println(s);
		
		System.out.println(arrayList);
		
		
		
		
		
	}

	private static Employees  toSting() {
		// TODO Auto-generated method stub
		return null;
	}

}
