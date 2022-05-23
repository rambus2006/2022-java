public class BitwiseOperation{
	public static void main(String args[]){

		//비트연산자
		int a =3;
		int b =5;
		System.out.println(a&b);	//AND연산자 : a와 b, 두비트가 모두 1이면 1,하나라도 0 이면 0
		System.out.println(a|b);	//OR 연산자 : a와 b, 두비트가 모두 0이면 0
		System.out.println(a^b);	//eXcluesive OR : a 와 b, 두비트가 서로 다르면 1, 같으면 0
		System.out.println(~a);	//보수 : 0과 1을 반전
		
	}
}