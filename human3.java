class human
{
	double weight;
	double height;
	double age;
	double ratio()
	{
		return weight/height;
	}
	void dispAge()
	{
		System.out.println("The age is:"+age);
	}
	human()
	{
		weight=65;
		height=5.9;
		age=32;
	}}
	class Human3
	{
		public static void main(String args[])
		{
		human h1=new human();
		h1.dispAge();
		System.out.println("The ratio is"+h1.ratio());

}}
