package COM.GLH;
/** 
 * @author  ���� E-mail:2379675496@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public abstract class Shape {

	int side;
	double limit;
	double area;
	
	abstract double getArea();

	@Override
	public String toString() {
		return "Shape [side=" + side + ", limit=" + limit + ", area=" + area
				+ "]";
	}
	
}
