package io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhoneList02 {
	public static void main(String[] args) {

		Scanner scanner = null;
		File file = new File("phone.txt");

		try {

			if (file.exists() == false) {
				System.out.println("파일이 존재하지 않습니다.");
				return;
			}

			System.out.println("===================파일정보===================");
			System.out.println("경로: " + file.getAbsolutePath());
			System.out.println("크기: " + file.length() + "Bytes");
			System.out.println(
					"마지막 수정일: " + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));

			System.out.println("===================전화번호===================");
			scanner = new Scanner( file );
			while( scanner.hasNextLine() ) {
				String name = scanner.nextLine();
				String phone01 = scanner.nextLine();
				String phone02 = scanner.nextLine();
				String phone03 = scanner.nextLine();
				
				System.out.println( name + ":" + phone01 + "-" + phone02 + "-" + phone03 );
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if( scanner != null ) {
				scanner.close();
			}
		}
	}
}
