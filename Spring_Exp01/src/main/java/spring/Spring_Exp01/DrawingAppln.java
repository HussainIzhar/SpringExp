package spring.Spring_Exp01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import shapes.Circle;
import shapes.Shape;
import shapes.Triangle;

public class DrawingAppln {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
		Shape sp= (Shape) context.getBean("Circle");
		sp.draw();	
	/*	System.out.println(sp.getType());
		System.out.println(sp.getSides());
		System.out.println("Point A : x"+sp.getPointA().getX()+" y:"+sp.getPointA().getY());
		System.out.println("Point B : x"+sp.getPointB().getX()+" y:"+sp.getPointB().getY());
*/
	}

}

