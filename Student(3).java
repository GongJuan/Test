package servlet;

public class Student extends Person{
	private int num;
	public Student(String name, int age, String sex,int num) {
		
		super(name, age, sex);
		this.num=num;
	
	}

public void showof()
{
	System.out.println("ѧ�ţ�"+num);
}
	public void show()
	{
		System.out.println("��ʼ��ѧ�ţ�"+"20160101001\n");
	}
	
	public static void main(String[] args)
	{	
		Student student=new Student("С��\n", 18, "Ů\n",12342);
	    student.shows();
		student.show();
		student.showinfo();
		student.showof();
		
		
		
		
	}
}
