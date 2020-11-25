package com.atu.ureport;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	/**
	 * 穷举算法： 把所有的可能都罗列出来 找到答案
	 * 例子：鸡兔同笼的问题
	 * 没有明显规律可寻
	 */
	@Test
	void contextLoads() {
		int head = 35;//头数
		int foot = 94;//足数
		int c = 0;//鸡数
		int r = 0;//兔数
		for (int i = 1;i < 35;i++){
			c = i;
			r = head - c;
			if (c * 2 + r * 4 == foot){
				break;
			}
		}
		if (c != 0 && r != 0){
			System.out.println("鸡有"+c+"只,兔有" + r+"只");
		}
		else {
			System.out.println("无解");
		}
	}

	/**
	 * 递推算法
	 *
	 * 经典例子：斐波那契《算盘书》【兔子产仔问题】
	 * 如果一对两个月大的兔子以后每一个月都可以生一对小兔子，而一对新生的兔子出生两个月后才可以生小兔子。
	 * 也就是说，1 月份出生，3 月份才可产仔。那么假定一年内没有产生兔子死亡事件,那 么 1年后共有多少对兔子呢？
	 */

	@Test
	public void diTui(){
		int month = 3;
		System.out.println(String.format("%d个月一共有%d对兔子",month,fibonacci(month)));
	}

	private int fibonacci(int month) {
		int t1,t2;
		if (month == 1 || month == 2)
			return 1;
		else {
			t1 = fibonacci(month -1);
			t2 = fibonacci(month - 2);
			return t1 + t2;
		}
	}


	/**
	 * 递归思想  可以直接或间接条用自身
	 * 例子：阶乘
	 * n!=n*(n-1)*(n-2)*……*2*1
	 */
	@Test
	public void diGui(){
		int i = 11;
		System.out.println(String.format("%d阶乘的结果%d",i,testDiGui(i)));
	}

	private long testDiGui(int n){
		if (n <= 1) return 1;
		else return n * testDiGui(n -1);
	}

}
