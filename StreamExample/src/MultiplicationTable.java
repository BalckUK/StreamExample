import java.util.stream.IntStream;

public class MultiplicationTable {
	public static void main(String[] args) {
		
		//for���� �̿��ϴ� ���
		for(int i = 1; i<11; i++) {
			System.out.println(i+"��");
			for(int j = 1; j<11; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
		
		//Stream�̿���
		IntStream intstream = IntStream.range(1,9);
		
		
		
		
		//Stream�� �̿��ϵ� forEach�� ������� ����
	}
}
