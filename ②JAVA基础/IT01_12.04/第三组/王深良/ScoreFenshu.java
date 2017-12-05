import java.util.ArrayList;
import java.util.Scanner;

public class ScoreFenshu implements IFenshu {

	@Override
	public void in() {
		System.out.println("���������߿��ɼ�ϵͳ��������");
		System.out.println("[1]��¼��ɼ�������1");
		System.out.println("[2]����ѯ���гɼ���Ϣ������2");
		System.out.println("[3]����ѯ��߷�������3");
		System.out.println("[4]���˳�������4");

	}

	public void info() {
		System.out.println("����������߷�ϵͳ��������");
		System.out.println("[1]����ѯ�ܷ���߷�������1");
		System.out.println("[2]����ѯ������߷�������2");
		System.out.println("[3]����ѯ��ѧ��߷�������3");
		System.out.println("[4]����ѯӢ����߷�������4");
		System.out.println("[5]��������һ��������5");

	}

	@Override
	public void addFenshu(ArrayList<Kaoshen> arrayList, Scanner sc) {

		System.out.println("������ѧ���ɼ���Ϣ�ö��Ÿ���,��ʽΪ����������ţ����ĳɼ�����ѧ�ɼ���Ӣ��ɼ�");

		String s = sc.next();

		String[] a = s.split("��");

		if (a.length != 5) {
			System.out.println("���������Ϣ����");

		} else {

			Kaoshen kaoshen = new Kaoshen(a[0], a[1], Double.parseDouble(a[2]),
					Double.parseDouble(a[3]), Double.parseDouble(a[4]));

			arrayList.add(kaoshen);
			System.out.println(kaoshen.toString());
			System.out.println("��ӳɹ�");
		}

	}

	@Override
	public void infoFenshu(ArrayList<Kaoshen> arrayList) {

		for (int i = 0; i < arrayList.size(); i++) {

			Kaoshen kaoshen = arrayList.get(i);

			String string = kaoshen.toString();

			System.out.println(string);

		}

	}

	@Override
	public double setMAXFenshu(ArrayList<Kaoshen> arrayList, String sc) {
		Kaoshen kaoshen = null;

		double max = 0;
		// �ܷ����ֵ
		String scc = sc;
		switch (scc) {

		case "�ܳɼ�":

			max = arrayList.get(0).getTotalPoints();

			for (int i = 1; i < arrayList.size(); i++) {

				if (arrayList.get(i).getTotalPoints() > max) {

					max = arrayList.get(i).getTotalPoints();

				}

			}
			for (int i = 0; i < arrayList.size(); i++) {
				if (max == arrayList.get(i).getTotalPoints()) {
					kaoshen = arrayList.get(i);

				}

			}
			System.out.println(kaoshen);
			System.out.println(max);
			System.out.println("�ܳɼ�");

			break;
		case "����":

			max = arrayList.get(0).getLanguagee();
			for (int i = 1; i < arrayList.size(); i++) {

				if (arrayList.get(i).getLanguagee() > max) {

					max = arrayList.get(i).getLanguagee();
				}

			}
			for (int i = 0; i < arrayList.size(); i++) {
				if (max == arrayList.get(i).getLanguagee()) {
					kaoshen = arrayList.get(i);

				}

			}
			System.out.println(kaoshen);
			System.out.println(max);
			System.out.println("���ĳɼ�");

			break;
		case "��ѧ":

			max = arrayList.get(0).getMathematics();
			for (int i = 1; i < arrayList.size(); i++) {

				if (arrayList.get(i).getMathematics() > max) {

					max = arrayList.get(i).getMathematics();
				}

			}
			for (int i = 0; i < arrayList.size(); i++) {

				if (max == arrayList.get(i).getMathematics()) {
					kaoshen = arrayList.get(i);

				}

			}
			System.out.println(kaoshen);
			System.out.println(max);
			System.out.println("��ѧ�ɼ�");

			break;
		case "Ӣ��":

			max = arrayList.get(0).getEnglish();
			for (int i = 1; i < arrayList.size(); i++) {

				if (arrayList.get(i).getEnglish() > max) {

					max = arrayList.get(i).getEnglish();
				}

			}
			for (int i = 0; i < arrayList.size(); i++) {
				if (max == arrayList.get(i).getEnglish()) {
					kaoshen = arrayList.get(i);

				}

			}
			System.out.println(kaoshen);
			System.out.println(max);
			System.out.println("Ӣ��ɼ�");

			break;

		default:

			System.out.println("��������");

			break;
		}

		return max;
	}

}
