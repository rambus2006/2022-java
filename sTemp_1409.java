import java.util.Scanner;
public class sTemp_1409{
	public static void main ( String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �µ� �Է� : ");
		int c = scan.nextInt( ) ;		//���α׷��� �ϱ� �� �����ܰ���� ����Ǵ��� �� Ȯ���ϱ�!
		double F =(double)9.0/5*c+32 ;	//������ ���� ����� ������ �ν��ϹǷ� 9�� 5�߿� �ϳ��� �Ǽ��� �ٲٰų� �� �� �Ǽ������� �ٲٸ� �ȴ�.
						//���� ���� ����� ĳ�����ؼ� �� ��ȯ(��ǻ�ʹ� �������� ���� �ʴ´�.)

		
		System.out.print("���� : "+c+" ==> "+" ȭ�� : "+F);
	}
}