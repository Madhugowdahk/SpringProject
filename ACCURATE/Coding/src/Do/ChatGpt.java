package Do;

public class ChatGpt {
public static void main(String[] args) {
	int n = 10,sum;
    int a = 0, b = 1;
	for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
    
        if(i==j) {
			System.out.print(a+" ");
			sum=a+b;
			a=b;
			b=sum;
	break;
		}
        if(i==j) {
			System.out.print(a+" ");
			sum=a+b;
			a=b;
			b=sum;
	break;
		}
        System.out.println(" ");
    }
	}
	for (int i = n-1; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
        	if(i==j) {
    			System.out.print(a+" ");
    			sum=a+b;
    			a=b;
    			b=sum;
    	
    		}
            System.out.println(" ");
    }
	
}
}
}
