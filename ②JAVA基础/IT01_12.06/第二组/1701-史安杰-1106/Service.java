import java.util.ArrayList;
import java.util.Scanner;

public class Service implements Addr {

	private static final Addr Addr = null;
	private static final ArrayList<Addr> ArrayListAddr = null;

	@Override
	public void addAddr(ArrayList<Address> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("������Ĳ���ȷ������������");

		} else {
			Address address = new Address(a[0], a[1], a[2]);
			arrayList.add(address);
			System.out.println(address.toString());

		}

	}

	@Override
	public void infoAddr(ArrayList<Address> arrayList) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arrayList.size(); i++) {
			Address address = arrayList.get(i);
			System.out.println(address.toString());

		}

	}

	@Override
	public ArrayList<Address> findBysex(ArrayList<Address> arrayLists,
			String sex) {
		// TODO Auto-generated method stub
		Address address2 = new Address();
		boolean iss = false;
		for (Address address : arrayLists) {
			String sex2 = address.getSex();
			if (sex2.equals(sex)) {
				address2.setSex(address.getSex());
				System.out.println(address.toString());
				iss = true;
			}

		}
		if (!iss) {
			System.out.println("��ʽ����ȷ������������");
		}

		return null;
	}

	@Override
	public Address findByname(ArrayList<Address> arrayList, String name) {
		// TODO Auto-generated method stub
		Address addr2 = new Address();
		boolean isn = false;
		for (Address addr : arrayList) {
			String string = addr.getName();
			if (string.equals(name)) {
				addr2.setName(addr.getName());
				System.out.println(addr.toString());
				isn = true;

			}
		}
		if (!isn) {
			System.out.println("���޴���");
		}
		return addr2;
	}

	@Override
	public Address findBycall(ArrayList<Address> arrayList, String call) {
		// TODO Auto-generated method stub
		Address address2 = new Address();
		boolean isc = false;
		for (Address address : arrayList) {
			String string = address.getCall();
			if (string.equals(call)) {
				address2.setCall(address.getCall());
				System.out.println(address.toString());
				isc = true;

			}
		}
		if (!isc) {
			System.err.println("û�д˺���");
		}

		return address2;
	}

	@Override
	public void help() {
		// TODO Auto-generated method stub

		System.out.println("------ͨѶ¼ϵͳ-----");
		System.out.println("¼��ͨѶ¼��������1");
		System.out.println("��ʾ������Ϣ��������2");
		System.out.println("����������������3");
		System.out.println("�Ա�������������4");
		System.out.println("�绰������������5");
		System.out.println("�˳�ϵͳ��������6");

	}

}
