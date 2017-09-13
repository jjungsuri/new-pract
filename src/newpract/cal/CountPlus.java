package newpract.cal;

public class CountPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountPlus ctp=new CountPlus();
          ctp.method1();
          ctp.method2(500);// unaffected
	}

	public void method1() {
	    int value = 5 + method2(5);
	    System.out.println(value);//value 60
	}

	public int method2(int y) {
	    return y+50;	    
	}
	
	
}
