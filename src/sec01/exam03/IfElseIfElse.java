package sec01.exam03;

public class IfElseIfElse {

	public static void main(String[] args) {

		int score = 60;
		
		if(score>=90)
		{
			System.out.println("첫번째 이프");
		}
		else if(score>=80)
		{
			System.out.println("두번째 이프엘스");
		}
		else if(score>=70)
		{
			System.out.println("세번째 이프엘스");
		}		
		else {
			System.out.println("마지막 엘스");
		}
	}

}
