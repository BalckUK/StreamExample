import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsExample {
	public static void main(String[] args) {
		
		//스트림이 제공하는 대부분의 요소 처리 메소드는 함수적 인터페이스 매개타입을 가진다
		//매개값으로 람다식 또는 메소드 참조를 대입할 수 있다
		List<Student> list= Arrays.asList(new Student("홍길동",90), new Student("신용권",92));
		
		Stream<Student> stream = list.stream();
		stream.forEach(s ->{
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + " - "+ score);
		});
	}
}
