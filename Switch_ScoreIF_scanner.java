import java.util.Scanner;
public class Switch_ScoreIF_scanner{
	public static void main (String args[]){
	
		Scanner scan=new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int score=scan.nextInt();
		if(score>=90){
				System.out.println("A�Դϴ�.");
		}
		else if(score>=80){
				System.out.println("B�Դϴ�.");
		}
		else if(score>=70){					//��ȣ����, ��Ÿ����
				System.out.println("C�Դϴ�.");
		}
		else{
				System.out.println("D�Դϴ�.");	
		}		
	}
}