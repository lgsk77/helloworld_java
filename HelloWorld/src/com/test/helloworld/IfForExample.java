package com.test.helloworld;

import java.util.Scanner;

//숫자입력 받아서 *만드는 example

public class IfForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in=new Scanner(System.in);
			Scanner Sin=new Scanner(System.in);
			
			int Numin;
			String end = "Y";
			
			while(!end.equals("N")){
				if(!end.equals("Y"))
					System.out.println("Y나 N을 입력해주세요.");
				else{
					System.out.println("숫자를 입력하세요.");
					Numin=in.nextInt();
					if(Numin==1){
						for(int i=5;i>=1;i--){
							for(int j=i;j<=5;j++)
								System.out.print("*");
							System.out.println("");
						}
					}
					else if(Numin==2){
						for(int i=5;i>=1;i--){
							for(int j=i-1;j>=1;j--)
								System.out.print(" ");
							for(int j=i;j<=5;j++)
								System.out.print("*");
							System.out.println("");
						}
					}
					else if(Numin==3){
						for(int i=1;i<=5;i++){
							for(int j=i-1;j>=1;j--)
								System.out.print(" ");
							for(int j=i;j<=5;j++)
								System.out.print("*");
							System.out.println("");
						}
					}
					else if(Numin==4){
						for(int i=1;i<=5;i++){
							for(int j=i;j<=5;j++)
								System.out.print("*");
							System.out.println("");
						}
					}
					else{
						System.out.println("잘못된 숫자를 입력하셧습니다.");
					}
				}
				System.out.print("계속 하시겠습니까? (Y/N)");
				end=Sin.nextLine();
			}
	}

}
