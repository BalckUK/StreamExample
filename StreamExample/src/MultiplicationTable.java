import java.util.stream.IntStream;

public class MultiplicationTable {
	public static void main(String[] args) {
		
		//for문을 이용하는 방법
		for(int i = 1; i<11; i++) {
			System.out.println(i+"단");
			for(int j = 1; j<11; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
		
		//Stream이용방법
		IntStream intstream = IntStream.range(1,9);
		
		
		
		
		//Stream을 이용하되 forEach를 사용하지 않음
	}
}
