package one;

import java.util.Scanner;

public class DaySevChar {

	public static void main(String[] args) {

	    Scanner sc=new Scanner(System.in);

	    // 11654 �ƽ�Ű�ڵ�
	    String s=sc.nextLine();

	    int ascii=s.charAt(0);
	    System.out.println(ascii);

	    // 11720 ��������
        int n = sc.nextInt();
        String nums = sc.next();

        int sum = 0;
        for( int i=0; i<n; i++ ) {
            sum += (int)nums.charAt(i) - '0';
        }
        System.out.println(sum);
        
        // 10809 ���ĺ� ã��
  	    String S=sc.next();

	    for(char alp='a';alp<='z';alp++) {
	    	System.out.print(S.indexOf(alp)+" ");
	    }
		
	    
	    sc.close();
	}

}
