import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVSStreamExample {

	public static void main(String[] args) {

		//자바 7이전 코드에서는 아래와 클래스의 요소를 반복하기 위해서 Iterator를 사용하였다 
		List<String> list = Arrays.asList("홍길동","신용권","감자바");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println("이름1 : "+name);
		}
		
		//하지만 자바 7이후 코드에서 아래와 같이 바뀌었다
		List<String> list1 = Arrays.asList("홍길동","신용권","감자바");
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println("이름2 : "+name));
		
	}

}
