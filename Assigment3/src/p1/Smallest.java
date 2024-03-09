package p1;

public class Smallest {
	 int Smaller(int a, int b, int c)
	{
		if(a<b)
		{
			if(a<c)
			{
				int small = a;
				return small;
			}
			else
			{
				int small = c;
				return small;
			}
		}
		else if(b<c)
		{
			int small = b;
			return small;
		}
		else
		{
			int small = c;
			return small;
		}
	}
}
