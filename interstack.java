package p1;
interface stk{
	void push(int val);
	int pop();
}
class newstk implements stk{
	private int stack[];
	private int tos;
	newstk(int len)
	{
		tos=-1;
		stack=new int[len];
	}
	public void push(int val)
	{
		if(tos>=stack.length-1)
		{
			System.out.println("Stack overflow.");
		}
		else
		{
			stack[++tos]=val;
		}
	}
	public int pop()
	{
		if(tos<0)
		{
			System.out.println("Stack underflow.");
			return 0;
		}
		else
			return stack[tos--];
	}
}
class interstack{
	public static void main(String args[])
	{
		newstk x=new newstk(8);
		int i;
		for(i=0;i<8;i++)
			x.push(i);
		for(i=0;i<8;i++)
			System.out.println(x.pop());
	}
}