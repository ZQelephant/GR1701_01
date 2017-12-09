/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��12��7�� ����2:41:03 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
*/
package zk.qhit.com;

import java.util.ArrayList;
import java.util.Scanner;

public class ShangpinServer implements IShangpin {

	@Override
	public void help() {
		System.out.println("----���й���ϵͳ----");
		System.out.println("1.�����������밴��1\n(��ʽ�磺���,����,�۸�,����)");
		System.out.println("2.���������룺2\n(��ʽ�磺���,��������)");
		System.out.println("3.�������������룺3\n(��ʽ�磺��ţ���������)");
		System.out.println("4.���������룺4");
		System.out.println("5.�˳������룺5");

	}

	@Override
	public void addShangpin(ArrayList<Shangpin> arrayList, Scanner sc) {
		String string = sc.next();
		String[] s=string.split(",");
		if (s.length!=4) {
			System.out.println("����������ݲ���ȷ");
		} else {
		Shangpin shangpin = new Shangpin(s[0],s[1],Double.parseDouble(s[2]),Integer.parseInt(s[3]));
		arrayList.add(shangpin);
		System.out.println(shangpin.toString());
		}
		

	}

	@Override
	public void jinhuoShangpin(ArrayList<Shangpin> arrayList, Scanner sc) {
		String[] d = sc.next().split(",");
		boolean isq=true;
		if (d.length!=2) {
			System.out.println("����������ݲ���ȷ");
		}else{
		for (Shangpin shangpin : arrayList) {
			if (shangpin.getId().equals(d[0])) {
				int nubx=shangpin.getShuliang()+Integer.parseInt(d[1]);
				shangpin.setShuliang(nubx);
				System.out.println(shangpin.toString());
				isq=false;
			}
		}
		}
		if (isq) {
			System.out.println("����ʧ��");
		}
		}

	

	@Override
	public void chushoupin(ArrayList<Shangpin> arrayList, Scanner sc) {
		String[] d = sc.next().split(",");
		boolean isq=true;
		if (d.length!=2) {
			System.out.println("����������ݲ���ȷ");
		}else{
		for (Shangpin shangpin : arrayList) {
			if (shangpin.getShuliang()>Integer.parseInt(d[1])) {
				int rr=shangpin.getShuliang()-Integer.parseInt(d[1]);
				//int nubx=shangpin.getShuliang()+Integer.parseInt(d[1]);
				shangpin.setShuliang(rr);
				System.out.println(shangpin.toString());
				isq=false;
			}
		}
		}
		if (isq) {
			System.out.println("����ʧ��");
		}

	}

	@Override
	public void infoShangpin(ArrayList<Shangpin> arrayList) {
		for (Shangpin shangpin : arrayList) {
			System.out.println(shangpin.toString());
		}

	}

}
