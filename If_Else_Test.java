import java.util.Scanner ;
public class If_Else_Test{
	public static void main(String args[]){
	
	//java������ if �� else��
	Scanner scan=new Scanner(System.in);
	System.out. print("������ �Է��ϼ��� :");
	int score = scan.nextInt();		
	
	if(score>=80)			//�ڵ尡 ������ ���� �߰�ȣ ���� �ʴ´�.(��� �鿩���� �ؾ���)
		System.out.print("�հ��Դϴ�.");		//���� score�� 80 ���̻��̸� "�հ��Դϴ�."�޼��� ���
	
	else					//���� �ƴ϶��(score�� 79�� �����̸� ) "���հ��Դϴ�."�޼��� ���
		System.out.print("���հ��Դϴ�.");
	
	
	

	}
}
