import java.util.Scanner;
public class Constant2_1409{
	public static void main(String args[]){
	
		Scanner scan= new Scanner(System.in);	//��ɹ� main���� �������� ���� ��//
		System.out.print("������ : ");
		
		final double p = 3.14;
		int r = scan.nextInt();
	
		System.out.println ("������ "+ r +"�� ���� �ѷ� : "+(2*r*p));	//���ϱ�� ���� ��ȣ�� ���� �ʾƵ� ��, ���� ���ϱ⳪ ������ ��ȣ�� ����� ��//
		System.out.println("������ "+ r+"�� ���� ���� : "+(r*r*p));		//�������� r���� �翩����
	}
}
