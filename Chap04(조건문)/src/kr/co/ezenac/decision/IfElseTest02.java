package kr.co.ezenac.decision;

import java.util.Scanner;

public class IfElseTest02 {
	static final String ADMIN_ID = "admin";
	static final String ADMIN_PASSWORD = "0111";

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ID : ");
		String id = scan.nextLine();
		
		System.out.print("PW : ");		
		String pw = scan.nextLine();
		
		
		
		   if(id.equals(ADMIN_ID) && pw.equals(ADMIN_PASSWORD)) {
		    System.out.println("로그인 성공"); }
		   
		   else { 
			System.out.println("로그인 실패"); }
		
//		if(id.equals(ADMIN_ID)) {
//			System.out.println("ID 일치");
//			System.out.println("PASSWORD를 입력해주세요.");
//			
//			System.out.print("PW : ");
//			String pw = scan.nextLine(); 
//		  if (pw.equals(ADMIN_PASSWORD)) {
//			  System.out.println("PASSWORD 일치");
//			  System.out.println("로그인 성공!");
//			  
//		  } 
//		  else {
//			  System.out.println("PASSWORD 불일치");
//		  }			 
//		} 
//		else {
//			System.out.println("ID 불일치" );
//			scan.close();
//		}
		 
		
		

	}

}
