package ex;
import java.util.*;
/*
 * Topic: 輸入一個字元，判斷是大寫或小寫或是其他字元。
 * Date: 2016/10/03
 * Author: 105021027 陳宴湘
 */

public class ex02_105021027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     char ch1 = sc.next().charAt(0);
     int v1 = ch1 - 'a';
     if(v1>=0 &&v1<26){
    	 System.out.print("小寫");
     }else{
    	v1 = ch1 - 'A';
    	if(v1>=0 && v1<26){
    		System.out.print("大寫");
    		
    		}else System.out.print("其他字元");
     }
	}

}