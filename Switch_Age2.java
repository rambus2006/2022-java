import java.util.Scanner;
public class Switch_Age2{
	public static void main (String args[]){

		//���̸� �Է¹޾� ���
		Scanner scan=new Scanner(System.in);
		
		System.out.println("���̸� �Է��ϼ��� : ");
		int age=scan.nextInt();

		switch(age/10){
			case 10:
				System.out.println("100���Դϴ�.");
				break;
			case 9:				//����̸� ���� ���ں��� 	
			case 8:
			case 7:
			case 6:
				System.out.println("�����Դϴ�.");
				break;
			case 5:
			case 4:
			case 3:
			case 2:
				System.out.println("û���Դϴ�.");
				break;
			case 1:
				System.out.println("�л��Դϴ�.");
				break;
			case 0:
				System.out.println("�����Դϴ�.");
				break;
		
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			
		}
	}
}