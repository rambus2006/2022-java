import java.util.Scanner ;
public class If_Nested{
	public static void main(String args[]){
	
          //��ø�� if��
	Scanner scan=new Scanner(System.in);
	System.out. print("������ �Է��ϼ��� :");
	int money = scan.nextInt();		
	
	if(money>=30000)	{			//�߰�ȣ�� ���� �鿩���⵵ ���ִ� ���� �ֻ�  
                 if(money>=50000){
			System.out.println("����ýø� Ÿ�� ���ϴ�.");
                 }
                 else{
			System.out.println("�Ϲ��ýø� Ÿ�� ���ϴ�.");
	     }
	}
	else if(money>=10000){			//else if �� ��� �ٿ��� ���� ����
		System.out.print("������ ž�ϴ�.");
	}
	else{
		System.out.print("�ɾ�ϴ�.");
	}
	
	
	

	}
}



















