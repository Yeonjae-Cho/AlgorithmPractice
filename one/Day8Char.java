package one;

import java.util.Scanner;

public class Day8Char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 2675 ���ڿ��ݺ�
	    int T=sc.nextInt(); // �׽�Ʈ ���̽� 

	    for(int i=0;i<T;i++){
	    	int cnt=sc.nextInt();
		    String S=sc.nextLine();
		    String sum="";
		    
	        for(int j=0; j<S.length(); j++){
	          for(int k=0; k<cnt; k++) {
	            sum += S.charAt(j); 
	          }
	        }
	        sum = sum.trim();
	        System.out.println(sum);
		}
		
	    // 1152 �ܾ��� ����
	    String str= sc.nextLine();
	    String[] strArr = str.trim().split(" ");

		sc.close();
		if(str.trim().isEmpty()) {
			System.out.println(0);
		}
		else {
			System.out.println(strArr.length);
		}
		
	}

}
