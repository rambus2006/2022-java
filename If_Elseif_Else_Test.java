import java.util.Scanner ;
public class If_Elseif_Else_Test{
	public static void main(String args[]){
	
          //if,else if ,else��
	Scanner scan=new Scanner(System.in);
	System.out. print("������ �Է��ϼ��� :");		//���� : ������ �Է��ϼ���
	int money = scan.nextInt();		
	
						//�߰�ȣ�� �����ϰ� ������ �������� �鿩����
	if(money>=30000)	{			//���� money�� 30000�̻��̶��
		System.out.print("�ýø� ž�ϴ�.");      	//"�ýø� ž�ϴ�"�޼��� ���
	}
	
	else if(money>=10000){			//���� 30000�� �̸��̰�, 10000�̻��̶��
		System.out.print("������ ž�ϴ�.");	//"������ ž�ϴ�" �޼��� ���
	}	
	else{					//10000�̸��̶�� 
		System.out.print("�ɾ�ϴ�.");		//"�ɾ�ϴ�."�޼��� ���
	}
	
	
	

	}
}
