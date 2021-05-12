package Ex01_DI;

import java.util.Date;

public class UnderstandDI {

	public static void main(String[] args) {
		// ��¥�� ���ϱ� ���ؼ��� Date Ŭ������ ����(���)�ؾ� ��
		Date date = new Date();
		System.out.println(date);
	}
	
	public static void getDate(Date d) {
		Date date = d;
		System.out.println(date);
	}
	
	public static void memberUse1() {
		// ���� ���� : ���� ����
		// �����ڰ� private�� �ٲ�� ���� �߻���
		Member m1 = new Member();
	}
	
	public static void memberUse2(Member m) {
		// ���� ���� : ������ ���� ���� => ���� ���� (Dependency Injection)
		// �����ڰ� private�� �ٲ� ���� ���� x
		Member m2 = m;
	}
}

// Member�� ����� ����Ѵ� -> Member�� ��ɿ� �����Ѵٴ� �ǹ�!
class Member {
	String name;
	String nickname;
	public Member() {}
}
