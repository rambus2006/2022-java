public class Switch_Grade{
	public static void main (String args[]){

		char grade='C';
		switch(grade){
			case'A':					//*�Ʒ� case�� �����ϰ� ����Ǳ⸦ ���ϸ� ����θ� �ȴ�.
			case 'B':
				System.out.println("���߽��ϴ�.");
				break;
			case 'C': 
			case 'D':
				System.out.println("�� �� ����ϼ���.");
				break;
			case 'F': 
				System.out.println("�ٽ� �����ϼ���.");
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�");
				break;
		}
			
	}
}