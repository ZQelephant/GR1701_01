package com.sxl;

public class Mouse implements A {
      String name;
      String variety;
      int legs;
	  private double weight;
	
	  
	  
	/**
	 * �޲ε�
	 */
	public Mouse() {
	}

	
	
	/**�вε�
	 * @param name
	 * @param variety
	 */
	public Mouse(String name, String variety) {
		this.name = name;
		this.variety = variety;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}



	@Override
	public void voice() {
		// TODO Auto-generated method stub

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub

	}

}
