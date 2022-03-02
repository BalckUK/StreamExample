import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * ���� �ݺ��ڸ� ����ϹǷ� ���� ó���� ����
 *  - �ܺ� �ݺ��� : �����ڰ� �ڵ�� ���� �÷��� ��Ҹ� �ݺ��ؼ� ��û�ϰ� �������� �ڵ� ����  -> Iterator
 *  - ���� �ݺ��� : �÷��� ���ο��� ��ҵ��� �ݺ���Ű�� �����ڴ� ��Ҵ� ó���ؾ��� �ڵ常 �����ϴ� �ڵ� ���� -> Stream
 *  
 *  ���� �ݺ����� ����
 *  - �����ڴ� ��� ó�� �ڵ忡�� ����
 *  - ��Ƽ �ھ� cpu�� �ִ��� Ȱ���ϱ� ���� ��ҵ��� �й���� ���� ó�� �۾��� �� �� �ִ�
 *  
 *  - ����ó��
 *  �Ѱ��� �۾��� ���� �۾����� ������, ���� �۾����� �и��� �����忡�� ���������� ó���� ��, ���� �۾����� ������� ���� �����ϴ� ���
 *  �ڹٴ� ForkJoinPool �����ӿ�ũ�� �̿��ؼ� ���� ó���� �Ѵ�
 * */
public class ParallelExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ȫ�浿","�ſ��","���ڹ�","���ٽ�", "�ں���");
		
		//����ó��
		Stream<String> stream = list.stream();
//		stream.forEach(name->print(name));
		stream.forEach(ParallelExample::print);
		
		System.out.println();
		
		//����ó��
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelExample::print);
	}

	private static void print(String str) {
		System.out.println(str +":" + Thread.currentThread().getName());
	}
	
	
}
