package yb;

public class Complex {
	
	double t;//실수 변수 
	double f;//허수 변수
	
	public Complex(double t) 
	{
		this(t, 0.0);} // 허수 부분이 0인 객체 생성자
	
	public Complex(double t, double f) 
	{
		this.t = t;//임의의 실수 부분
		this.f = f;} //임의의 허수 부분

	void print()
	{
		System.out.println(t + " + " + f + "i");
	} //화면 출력
}
