
public class Test {
	public static void main(String[] args) {
		Cat cat=new Cat("��������",75,3, "��Ȯ", 4);
	    cat.type ="��������";
	    System.out.println(cat.type);
		cat.eat("food");
	    cat.climbtree();
	    cat.sleep();
	    cat.setColor("è");
	    System.out.println(cat.getColor());
	    
	    cat.color();
	    
	    Animal a=new Animal("��ɫ",70);
	    Object object=new Object(); 
	    System.out.println(Math.PI);
	  
	    Cat cat_a=new Cat("��������",75, 3, "��Ȯ",4);
	    Cat cat_b=new Cat("��������",75, 3, "��Ȯ",4);
	    boolean isqual;
	    //boolean isquel = (cat_a==cat_b)?true:false;
	   isqual=cat_a.equals(cat_b);
	    
	    //System.out.println(isquel);
	    System.out.println(cat_a);
	    System.out.println(cat_b);
	    
	}

}
