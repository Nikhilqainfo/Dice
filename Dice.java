package first;

public class Dice {

	int faces;
	Dice(int face)
	{
		this.faces=face;
	}
	public void play()
	{
		
		 int random = (int )(Math. random() * this.faces + 1);
		 if (this.faces==2)
			 {
			 	if(random==1)
			 	{
			 		System.out.println("Head");
			 	}
			 	else {
			 		System.out.println("Tail");
			 	}
			 }
		 else {
			 System.out.println(random);
		 }
		 
		
	}
	public static void main(String[] args)
	{
		Dice a=new Dice(2);
		
			a.play();
	}
}	
