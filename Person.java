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
			System.out.println("��ʼ����"+"����,"+18+",��");
	}
	
	public void showinfo()
	{
	
		System.out.println("����:"+name+"����:"+age+"\n�Ա�:"+sex);
		
	}


}
