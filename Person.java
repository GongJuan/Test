package servlet;

public class Person {
	private String name;
	private int age;
	private String sex;
	protected int num;
	public Person(String name,int age,String sex)
	{
		this.name=name;
		this.age=age;
		this.sex=sex;
		
	}
	public void shows()
	{
			System.out.println("初始化："+"张三,"+18+",男");
	}
	
	public void showinfo()
	{
	
		System.out.println("姓名:"+name+"年龄:"+age+"\n性别:"+sex);
		
	}


}
