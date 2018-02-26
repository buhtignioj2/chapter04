package lang;

public class SBTest {

	public static void main(String[] args) {
		//생성
		StringBuffer sb = new StringBuffer("this");
		System.out.println( sb.length() + ":" + sb.capacity() );
		System.out.println(sb);
		
		//문자열 추가
		sb.append( " is pencil" );
		System.out.println(sb);
		
		//삽입
		sb.insert(7, " my");
		System.out.println(sb);
		
		//치환
		sb.replace( 8, 10, "your");
		System.out.println(sb);
		
		
		//버퍼크기조정
		sb.setLength( 3 );
		System.out.println( sb );
		
		String s1 = "hello " + "world" + 10 + true;
		String s2 = new StringBuffer("Hello").append("world").append(10).append(true).toString();
		System.out.println(s1);
	}
}
