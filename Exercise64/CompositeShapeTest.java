package Exercise64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompositeShapeTest {
/**
 * this is testing for list composite shape
 */
	@Test
	public void test() {
		Square s1 = new Square(new CartPt(3,4),2);
		Square s2 = new Square(new CartPt(6,8),3);
		Square s3 = new Square(new CartPt(2,3),4);
		
		
		
		Circle c1 = new Circle(new CartPt(3,4),1);
		Circle c2 = new Circle(new CartPt(6,8),2);
		Circle c3 = new Circle(new CartPt(2,3),3);
		
		CompositeShape l5 = new CompositeShape(c3, c2);
		CompositeShape l4 = new CompositeShape(c1, l5);
		CompositeShape l3 = new CompositeShape(s3, l4);
		CompositeShape l2 = new CompositeShape(s2, l3);
		CompositeShape l1 = new CompositeShape(s1, l2);
		System.out.println(l1);
		
	}
/**
 * this is method within()
 */
	@Test
	public void testWithin() {
		CartPt cp1 = new CartPt(3,4); 
		CartPt cp2 = new CartPt(6,8); 
		CartPt cp3 = new CartPt(2,3); 
		CartPt cp4 = new CartPt(10,20); 
		Square s1 = new Square(new CartPt(3,4),2);
		Square s2 = new Square(new CartPt(6,8),3);
		Square s3 = new Square(new CartPt(2,3),4);
		
		
		
		Circle c1 = new Circle(new CartPt(3,4),1);
		Circle c2 = new Circle(new CartPt(6,8),2);
		Circle c3 = new Circle(new CartPt(2,3),3);
		
		CompositeShape l5 = new CompositeShape(c3, c2);
		CompositeShape l4 = new CompositeShape(c1, l5);
		CompositeShape l3 = new CompositeShape(s3, l4);
		CompositeShape l2 = new CompositeShape(s2, l3);
		CompositeShape l1 = new CompositeShape(s1, l2);
			assertTrue(l1.within(cp3));
			assertTrue(l1.within(cp2));
			assertTrue(l1.within(cp1));
			assertFalse(l1.within(cp4));
			System.out.println(l1.within(cp3));
			System.out.println(l1.within(cp4));
	}
/**
 * this is testing for method boundingBox()
 */
	@Test
	public void testBoundingBox() {
		Square s1 = new Square(new CartPt(3,4),2);
		Square s2 = new Square(new CartPt(6,8),3);
		Square s3 = new Square(new CartPt(2,3),4);
		
		
		
		Circle c1 = new Circle(new CartPt(3,4),1);
		Circle c2 = new Circle(new CartPt(6,8),2);
		Circle c3 = new Circle(new CartPt(2,3),3);
		
		CompositeShape l5 = new CompositeShape(c3, c2);
		CompositeShape l4 = new CompositeShape(c1, l5);
		CompositeShape l3 = new CompositeShape(s3, l4);
		CompositeShape l2 = new CompositeShape(s2, l3);
		CompositeShape l1 = new CompositeShape(s1, l2);
			assertEquals(s1.boundingBox(),new Square(new CartPt(3,4),2));
			assertEquals(s2.boundingBox(),new Square(new CartPt(6,8),3));
			assertEquals(s3.boundingBox(),new Square(new CartPt(2,3),4));
			
			assertEquals(c1.boundingBox(),new Square(new CartPt(2,3),2));
			assertEquals(c2.boundingBox(),new Square(new CartPt(4,6),4));
			assertEquals(c3.boundingBox(),new Square(new CartPt(-1,0),6));
		
	}
}
