package spring.Spring_Exp01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import shapes.Triangle;

public class DrawingAppln {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
		Triangle tr= (Triangle) context.getBean("triangle");
		tr.draw();	
		System.out.println(tr.getType());
		System.out.println(tr.getSides());
		System.out.println(tr.getPointA());
		System.out.println(tr.getPointB());

	}

}

