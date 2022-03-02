import java.util.Arrays;
import java.util.List;

/*
 * 스트림은 중간 처리와 최종 처리를 할 수 있다
 * 중간 처리 : 요소들의 매칭, 필터링, 정렬
 * 최종 처리 : 반복, 카운트, 평균, 총합
 * 
 * */

public class MapAndReduceExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동",10),
				new Student("신용권",20),
				new Student("유미선",30)
		);
		
		double avg = studentList.stream()
		.mapToInt(Student::getScore)
		.average()
		.getAsDouble();
		
		System.out.println("평균 점수 : "+ avg);
		
	}
}
