public class Example1 {
    public static void main(String[] args) {
        System.out.println("예제1");
        byte a = 1;
        //byte타입의 크기 (1바이트)만큼 메모리를 할당하고 그주소를 a라고 부른다.
        //a 위치에 숫자 1를 지정한다.
        byte b =2;
        int c = a + b;
        System.out.println(c);

        char ch1 ='A';//char 형은 문자 하나만 저장하고 단따움표 ('') 를 사용
        char ch2 ='B';
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch1+ch2); //산술연산자 + 때문에 숫자로 변화하여 뎃셈을 수행함
        System.out.println(""+ch1+ch2); //빈문자열이 포함되면서 숫자가 아닌 문자로 더함
        System.out.println(+ch1);// 유니코드 65 출력, +기호는 숫자로 변화하라는 뜻
        System.out.println(+ch1 + +ch2); //131

        String str = "서형원";
        System.out.println(str);






        }
}