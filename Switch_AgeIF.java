import java.util.Scanner;
public class Switch_AgeIF{
	public static void main (String args[]){

		//���̸� �Է¹޾� ���
		Scanner scan=new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age=scan.nextInt();
		if(age<100 && age>=60){			//������ ���� �������� or���� �ȵ�,
			System.out.println("�����Դϴ�.");
		}
		else if(age>=20){
				System.out.println("û���Դϴ�.");
		}
		else if(age>=10){
				System.out.println("�л��Դϴ�.");
		}
		else if(age>=0){
				System.out.println("�����Դϴ�.");
		}
		else{
				System.out.println("�߸��� �Է��Դϴ�.");
		}
	}
}