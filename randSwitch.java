
import java.util.Random;
interface constants{
	int no=0;
	int yes=1;
	int maybe=2;
	int never=3;
}
class quest implements constants{
	Random rand=new Random();
	int check()
	{
	int val=(int)(100*rand.nextDouble());
	if(val<25)
		return no;
	else if(val<50)
		return yes;
	else if(val<75)
		return maybe;
	else
		return never;
	}
}
class randSwitch implements constants{
	static void Switch(int a)
	{
		switch(a)
		{
			case 0: System.out.println("No");
					break;
			case 1: System.out.println("Yes");
					break;
			case 2: System.out.println("Maybe");
					break;
			case 3: System.out.println("Never");
					break;
		}
	}
	public static void main(String args[])
	{
		quest a=new quest();
		Switch(a.check());
		Switch(a.check());
		Switch(a.check());
	}
}