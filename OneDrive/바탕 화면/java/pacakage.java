//package 최상위 패키지.상위 패키지.하위 패키지; 로 형식을 선언해준다. 소스 파일의 맨 첫 번째 부분에서 선언해줌
package com.codechobo.book;

public class pacakage {
    //패키지 : 서로 관련된 클래스의 묶음
    //클래스는 클래스 파일이라고 생각하면 되고 , 패키지는 폴더, 하위 패키지는 하위 폴더를 의미한다.
    //클래스의 실제 이름은 패키지를 선언한다.
    //패키지는 소스파일의 첫 번째 문장으로 단 한 번 선언해준다.
    //같은 소스 파일의 클래스는 모두 같은 패키지에 속하게 된다.
    //패키지 선언이 없으면 이름없는 패키지(default package)에 속한다.
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    //bin 폴더 : 컴파일 된 클래스(*.class)가 있는 폴더
    //src 폴더 : 소스 파일(*.java)가 있는 폴더

    //클래스 패스(classpath) : 클래스 파일(*.class)의 위치를 알려주는 경로(path)
    //환경 변수 (classpath)로 관리하며, 경로간의 구분자는 ;을 사용한다.
    //환경변수(classpath)에 패키지의 루트를 등록해줘야지 사용이 제대로 가능하다.
    //환경변수 등록하는 방법
    //제어판 -> 환경 변수 ->  환경변수 등록 ->







}
