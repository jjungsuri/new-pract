package newpract.cal;

import java.util.Scanner;

public class Sum {
public static void main(String[] args) {
 Sum su=new Sum();
	 System.out.println("숫자 2개를 입력하세요");
	 Scanner scan=new Scanner(System.in);
	 int i=scan.nextInt();
	
	 Scanner scanner=new Scanner(System.in);
	 scanner.close();
	 int a=scanner.nextInt();
	 int result=a*i;	   	
	System.out.println(result);
	
	 su.caculate(result);}
    
    
	 public  int  caculate(int result){
		int odd1=1;
		int odd2=2;				
		 int va=3; 
	  if((result%va)==2) System.out.println("1를 입력하세요"); 
	  if((result%va)==1) System.out.println("2을 입력하세요");
	  if((result%va)==0) System.out.println("Good ");	
 	  
	   Scanner sann= new Scanner(System.in);
        sann.close();
         int arr=sann.nextInt();	 
        if((odd1+arr)%va==0) System.out.println("allright");
        if((odd2+arr)%va==0) System.out.println(" ok");
     
        return 0;
         
	      
	 }		   
	 		 
	 }
	


	 
	 
	 
	   
	 	
	


