package com.commodity;

import java.util.ArrayList;
import java.util.Scanner;

/*Author��������
  E-mail��15539919713@163.com
 */
public interface ICommoditySystem {

	void helpInfo();
	void add(ArrayList<Commodity> arrayList,Scanner sc);
	void stock(ArrayList<Commodity> arrayList,Scanner sc);
	void sell(ArrayList<Commodity> arrayList,Scanner sc);
	void info(ArrayList<Commodity> arrayList);
	
}
