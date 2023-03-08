package com.tester;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class BallDemo extends Frame implements Runnable, ActionListener {

	Thread t1, t2, t3;
	int x1, x2, x3;

	public BallDemo() {

		t1 = new Thread(this);
		t2 = new Thread(this);
		t3 = new Thread(this);

		t1.start();
		t2.start();
		t3.start();

		x1 = x2 = x3 = 50;
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub

		g.setColor(Color.red);
		g.fillOval(x1, 50, 50, 50);
		g.setColor(Color.green);
		g.fillOval(x2, 200, 50, 50);
		g.setColor(Color.blue);
		g.fillOval(x3, 350, 50, 50);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for (;;) {
				if (Thread.currentThread() == t1) {
					if (x1 == 400) {
						synchronized (this) {
							wait();
						}
					} else
						x1++;
					Thread.sleep(10);
					repaint();
				}
				if (Thread.currentThread() == t2) {
					if (x2 == 400) {
						synchronized (this) {
							wait();
						}
					} else
						x2++;
					Thread.sleep(25);
					repaint();
				}
				if (Thread.currentThread() == t3) {
					if (x3 == 400) {
						synchronized (this) {
							x1 = x2 = x3 = 410;
							// notify();
							notifyAll();
						}
					} else
						x3++;
					Thread.sleep(25);
					repaint();
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public static void main(String[] args) {
	BallDemo ob=new BallDemo();
	ob.setSize(600, 500);
	ob.setLocationByPlatform(true);
	ob.setVisible(true);

}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
