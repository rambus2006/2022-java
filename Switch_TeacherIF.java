import java.util.Scanner;
public class Switch_TeacherIF{
	public static void main(String args[]){
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ��� : ");
		int teacher=scan.nextInt();
		
		if(teacher==1){						//�鿩���� ����!
				System.out.println("������ ������");
		}
		else if(teacher==2){
				System.out.println("���ָ�������");
		}
		else if(teacher==3){
				System.out.println("����ȯ ������");
		}
		else if(teacher==4){
				System.out.println("�迵ö ������");
		}
		else{
				System.out.println("�߸��Է��ϼ̽��ϴ�");
		}
		
	}
}