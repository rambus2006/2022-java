import java.util.Scanner;
  public class S_Grade_2 {
   	public static void main(String args[]){		//�Է¹޾� ����ϴ� grade

      	Scanner scan=new Scanner(System.in);		//�Է¹�

     	 System.out.print("�̸��� �Է��ϼ��� : ");
      	 String name= scan.next();			//name�� �Է¹޾� ����

     	 System.out.print("���� ������ �Է��ϼ��� : ");
      	int project= scan.nextInt();			//project�� �Է¹޾� ����


      	System.out.print("���ʽ� ������ �Է��ϼ��� : ");
      	int bonus= scan.nextInt();			//bonus�� �Է¹޾� ����

            int sum=project+bonus;			//sum�� project�� bonus �� ���� �� ����

            System.out.println("----------�ڹٽ���----------");		
       	System.out.println("�̸�\t����\t���ʽ�\t�հ�");
	System.out.printf("%s\t%3d\t%3d\t%3d\n",name,project,bonus,sum);		//\t: ����,%s �� string �� ��� , %���� ���ڴ� ����


	
}