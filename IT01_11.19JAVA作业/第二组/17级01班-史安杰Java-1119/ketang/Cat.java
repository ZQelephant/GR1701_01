
public class  Cat extends Animal {
	
	
	String type;
	
	void climbtree(){
		System.out.println("����");
	}
	void sleep(){
		System.out.println("˯���þ�");
	}
	public Cat(String color, int weight, int age, String type, int a) {
		super(color,weight );
		this.type = type;
		
	}
	void color(){
		System.out.println("���ǰ�ɫ");
	}	
    public boolean equals(Cat obj) {
    	boolean isqual=false;
    	if(obj==null){
    		return false;
    	}
    	if(this.weight==obj.weight&&this.color.equals(color)&&this.type.equals(type))
		        return (this == obj);
		    
	               return true;
	}
}
