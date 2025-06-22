package fileIO;

import java.io.*;

public class FileTest {

    public static void writeFile(String fileName, String contents) {
        try ( FileOutputStream fos = new FileOutputStream(fileName) )
        {
            byte [] buffer = contents.getBytes();
            fos.write( buffer );
        } catch (IOException e) {
            System.out.println( e.getMessage());
        }
    }

    public static void readFile(String fileName) throws IOException{
        File file = new File(fileName); // file의 정보를 구하기 위한 클래스의 인스턴스를 생성
        long size = file.length();      // 파일의 사이즈(크기)를 바이트 단위로 구함

        try ( FileInputStream fis = new FileInputStream(fileName) )
        {
            byte [] buffer = new byte[ (int)size ]; // 바이트 단위로 파일 크기만큼 배열을 할당함
            int ret = fis.read( buffer );           // 버퍼의 크기만큼 파일로부터 데이터를 읽어 들임
            String str = new String( buffer );
            System.out.println( str );
         }

    }


    public static void main(String[] args) {
//        String str = "Hello Java\n안녕하세요\nJava를 이용하여 저장한 파일입니다.";
//        writeFile("test.txt", str );

        try {
            readFile("test.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
