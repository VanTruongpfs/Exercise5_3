package Exercise62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IPhoneTest {
/**
 * this is testing for method whoseNumber()
 */
	@Test
	void testWhoseNumber() {
		new Phone(987654321, "Truong");
		new Phone(987654322, "Huy");
		new Phone(987654323, "Anh");
		Phone p1 = new Phone(987654321, "Truong");
		Phone p2 = new Phone(987654322, "Huy");
		Phone p3 = new Phone(987654323, "Anh");
		MTPhone mt = new MTPhone();
		ConsPhone l3 = new ConsPhone(p3, mt);
		ConsPhone l2 = new ConsPhone(p2, l3);
		ConsPhone l1 = new ConsPhone(p1, l2);
		assertEquals(l3.whoseNumber("Anh"), new ConsPhone(p3, mt));
		assertEquals(l2.whoseNumber("Huy"), new ConsPhone(p2, mt));
		assertEquals(l1.whoseNumber("Truong"), new ConsPhone(p1, mt));
		System.out.println(l3.whoseNumber("Anh"));
		System.out.println(l2.whoseNumber("Huy"));
		System.out.println(l1.whoseNumber("Truong"));
		System.out.println(l1);
	}
/**
 * this is testing for method phoneNumber()	
 */
		@Test
		void testPhoneNumber() {
			new Phone(987654321, "Truong");
			new Phone(987654322, "Huy");
			new Phone(987654323, "Anh");
			Phone p1 = new Phone(987654321, "Truong");
			Phone p2 = new Phone(987654322, "Huy");
			Phone p3 = new Phone(987654323, "Anh");
			MTPhone mt = new MTPhone();
			ConsPhone l3 = new ConsPhone(p3, mt);
			ConsPhone l2 = new ConsPhone(p2, l3);
			ConsPhone l1 = new ConsPhone(p1, l2);
			assertEquals(l3.phoneNumber(987654323), new ConsPhone(p3, mt));
			assertEquals(l2.phoneNumber(987654322), new ConsPhone(p2, mt));
			assertEquals(l1.phoneNumber(987654321), new ConsPhone(p1, mt));
			System.out.println(l3.phoneNumber(987654323));
			System.out.println(l2.phoneNumber(987654322));
			System.out.println(l1.phoneNumber(987654321));
			
	}

}
