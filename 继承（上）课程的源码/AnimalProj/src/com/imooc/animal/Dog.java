package com.imooc.animal;

public class Dog extends Animal {
	private String sex;//性别
	
	public Dog(){
		
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	//睡觉的方法
	 public void sleep(){
		 super.eat();//调用的哪个eat();
		 super.species="犬科";
		 System.out.println(this.getName()+"现在"+this.getMonth()+"个月大，它在睡觉~~");
	 }
	 
	 /*
	  * 方法重载：
	  * 1、同一个类中
	  * 2、方法名相同，参数列表不同（参数顺序、个数、类型）
	  * 3、方法返回值、访问修饰符任意
	  * 4、与方法的参数名无关
	  * 
	  * 方法重写
	  * 1、有继承关系的子类中
	  * 2、方法名相同，参数列表相同（参数顺序、个数、类型），方法返回值相同
	  * 3、访问修饰符，访问范围需要大于等于父类的访问范围
	  * 4、与方法的参数名无关
	  * */
	 
//	 private String sleep(String name){
//		 return "";
//	 }
//	 public void sleep(String name,int month){
//		 
//	 }
//	 public void sleep(int month,String name){
//		 
//	 }
//	 public void sleep(int name,String month){
//		 
//	 }
	 
	 //子类重写父类吃东西方法
//	 public void eat(){
//		 System.out.println(this.getName()+"最近没有食欲~~");
//	 }
	 
	 public void eat(String month){
		 System.out.println(month+"最近没有食欲~~");
	 }

	 @Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}
}
