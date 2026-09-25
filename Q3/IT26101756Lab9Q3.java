public class IT26101756Lab9Q3
{
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int multiply(int a,int b)
	{
		return a*b;
	}
	public static int square(int a){
		return a*a;
	}
	public static void main(String[]args)
	{
		int part1= multiply(3,4);
		int part2= multiply(5,7);
		int sum1= add(part1,part2);
		int result1= square(sum1);
		int sum2= add(4,7);
		int square2= square(sum2);
		int sum3= add(8,3);
		int square3= square(sum3);
		int result2=add(square2,square3);
		System.out.println("Result of(3*4+5*7)^2\t:"+result1);
		System.out.println("Result of(4+7)^2+(8+3)^2\t:"+result2);
	}
}

		