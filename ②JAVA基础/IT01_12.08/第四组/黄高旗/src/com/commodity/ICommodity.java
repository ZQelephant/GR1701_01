package com.commodity;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ����: xuyunmeng
 * @date    ����ʱ�䣺2017��12��7�� ����2:29:51 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface ICommodity {
	void helpinfo();

	void addCommodity(ArrayList<Commodity> arrayList,Scanner sc);
	
	void stockCommodity(ArrayList<Commodity> arrayList,Scanner sc);
	
	void sellCommodity(ArrayList<Commodity> arrayList,Scanner sc);
	
	void infoCommodity(ArrayList<Commodity> arrayList);
}
