package wangshenliang;
/** 
 * @author  ���� ������E-mail:793708547@QQ.com
 * @date    ����ʱ�䣺2017��11��14�� ����7:23:20 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Car {
		static int number=0;
		String color;
		int wheelNumber;
		float price;
		String id;
		
		public Car(){
			this.number++;
		}
		public static void main(String[] args) {
			Car car1=new Car();
			System.out.println("number:"+Car.number);
			
			Car car2=new Car();
			System.out.println("number:"+Car.number);
			
			Car car3=new Car();
			System.out.println("number:"+Car.number);
			
			Car car4=new Car();
			System.out.println("number:"+Car.number);
			
			Car car5=new Car();
			System.out.println("number:"+Car.number);
		}

}
