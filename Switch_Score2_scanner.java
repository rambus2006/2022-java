import java.util.Scanner;
public class Switch_Score2_scanner{
	public static void main (String args[]){

		Scanner scan=new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int score=scan.newInt();

		switch(score/10){
			case 10:	
				System.out.println("�����Դϴ�.");				
			case 9:
				System.out.println("A�Դϴ�.");
				break;
			case 8:
				System.out.println("B�Դϴ�.");
				break;
			case 7:
				System.out.println("C�Դϴ�.");
				break;
		
			default:
				System.out.println("D�Դϴ�.");
				break;
		}		
	}
}