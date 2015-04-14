package maximo_comun_divisor;

public class Eucly {

	public int mcd(int m, int n){
		int r;
		if(n>m){
			r=m;
			m=n;
			n=r;
		}
		r = m%n;
		while(r!=0){
			m=n;
			n=r;
			r=m%n;
		}
		return n;
	}
	
	public int mcm(int num1, int num2){
		return (num1/mcd(num1, num2))*num2;
	}
}
