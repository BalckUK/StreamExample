import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * 내부 반복자를 사용하므로 병렬 처리가 쉽다
 *  - 외부 반복자 : 개발자가 코드로 직접 컬렉션 요소를 반복해서 요청하고 가져오록 코드 패턴  -> Iterator
 *  - 내부 반복자 : 컬렉션 내부에서 요소들을 반복시키고 개발자는 요소당 처리해야할 코드만 제공하는 코드 패턴 -> Stream
 *  
 *  내부 반복자의 이점
 *  - 개발자는 요소 처리 코드에만 집중
 *  - 멀티 코어 cpu를 최대한 활용하기 위해 요소들을 분배시켜 병렬 처리 작업을 할 수 있다
 *  
 *  - 병렬처리
 *  한가지 작업을 서브 작업으로 나누고, 서브 작업들을 분리된 스레드에서 병렬적으로 처리한 후, 서브 작업들의 결과들을 최종 결합하는 방법
 *  자바는 ForkJoinPool 프레임워크를 이요해서 병렬 처리를 한다
 * */
public class ParallelExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동","신용권","김자바","람다식", "박병렬");
		
		//순차처리
		Stream<String> stream = list.stream();
//		stream.forEach(name->print(name));
		stream.forEach(ParallelExample::print);
		
		System.out.println();
		
		//병렬처리
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelExample::print);
	}

	private static void print(String str) {
		System.out.println(str +":" + Thread.currentThread().getName());
	}
	
	
}
