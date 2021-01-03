package me.jenny;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // annotation processor mvn clean install 후 여기서 mvn clean compile 해준 뒤,
        // target/generated-sources/annotations Sources Root로 지정해주면 (패키지명) 짧게 쓸 수 있다.
        Moja moja = new MagicMoja();  // MagicMoja 클래스파일을 @Magic 이 생성해주고 있다.
        System.out.println("Hello World! " + moja.pullOut());
    }
}
