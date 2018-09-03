package main;

public class BitwiseOperator {
	public int or(int x,int y) {
		return x|y;
	}
	public int and(int x,int y) {
		return x&y;
	}
	public int not(int x) {
		return ~x;
	}
	public int xor(int x,int y) {
		return x^y;
	}
	public int leftShift(int num,int shift) {
		return num<<shift;
	}
	public int rightShift(int num,int shift) {
		return num>>shift;
	}
}
