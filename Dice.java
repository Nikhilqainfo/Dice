package first;

public class Dice {

	int faces;
	
	Dice(int face)
	{
		this.faces=face;
	}
	public String play()
	{
		
		 int random = (int )(Math. random() * this.faces + 1);
		 String result;
		 if (this.faces==2)
			 {
			 	if(random==1)
			 	{
			 		result="Head";
			 	}
			 	else {
			 		result="Tail";
			 	}
			 }
		 else {
			 
			 result=Integer.toString(random);
		 }
		 
		return result;
	}
	public static void main(String[] args)
	{
		Dice a=new Dice(6);
		
		System.out.println(a.play());
			
	}
}	
