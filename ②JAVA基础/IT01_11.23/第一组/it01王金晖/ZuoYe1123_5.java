package jtc;

public class ZuoYe1123_5 {

	public static void main(String[] args) {
		//for����
		int sum = 0;
		for(int a = 1;a <=100;a++){
		    sum += (a%2!=0)?a:0;
		}
		System.out.println("1-100�������͵��ڣ�"+sum);
		System.out.println();
		int he = 0;
		int b = 1;
		while(b <= 100){
			he += (b%2 != 0)?b:0;
			b++;
		}
		System.out.println("1-100�������͵��ڣ�"+he);
	}
}
