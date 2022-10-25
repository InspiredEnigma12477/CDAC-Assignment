package com.code;

public class Box {
	private int h, w, l;

	public Box() {
		System.out.println("---default---");
		h = w = l = 1;
	}

	public Box(int w, int h, int l) {
		System.out.println("---box(w,h,l)----");
		this.h = h;
		this.l = l;
		this.w = w;
	}

	public Box(int i) {
		this(i, i, i);
		System.out.println("---box(l)----");

	}
	public void display()
	{
		System.out.println("Box ="+h+" "+w+"  "+l);
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public boolean isSame(Box b)
	{
		if(this.h==b.h && this.w==b.w &&  this.l==b.l)
			return true;
		else
			return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
