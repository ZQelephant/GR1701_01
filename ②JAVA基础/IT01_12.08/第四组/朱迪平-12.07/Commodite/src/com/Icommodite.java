package com;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ���� E-mail:������271406@163.com
 * @date ����ʱ�䣺2017��12��7�� ����2:29:29
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public interface Icommodite {
	void helpInfo();

	void addCommodite(ArrayList<Commodite> arrayList, Scanner sc);

	void stockCommodite(ArrayList<Commodite> arrayList, Scanner sc);

	void sellCommodite(ArrayList<Commodite> arrayList, Scanner sc);

	void InfoCommodite(ArrayList<Commodite> arrayList);

}
