package p1;

public class Greater {
	int Great(int a, int b, int c)
	{		
		if(a>b)
		{
			if(a>c)
			{
				int greatest = a;
				return greatest;
			}
			else
			{
				int greatest = c;
				return greatest;
			}
		}
		else if (b>c)
		{
			int greatest = b;
			return greatest;
		}
		else
		{
			int greatest = c;
			return greatest;
		}
	}
}
