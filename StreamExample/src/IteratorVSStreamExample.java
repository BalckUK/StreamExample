import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVSStreamExample {

	public static void main(String[] args) {

		//�ڹ� 7���� �ڵ忡���� �Ʒ��� Ŭ������ ��Ҹ� �ݺ��ϱ� ���ؼ� Iterator�� ����Ͽ��� 
		List<String> list = Arrays.asList("ȫ�浿","�ſ��","���ڹ�");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println("�̸�1 : "+name);
		}
		
		//������ �ڹ� 7���� �ڵ忡�� �Ʒ��� ���� �ٲ����
		List<String> list1 = Arrays.asList("ȫ�浿","�ſ��","���ڹ�");
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println("�̸�2 : "+name));
		
	}

}
