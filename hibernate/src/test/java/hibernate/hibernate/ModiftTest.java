package hibernate.hibernate;

import org.junit.*;

public class ModiftTest {

	private static Hero toTest;
	private static HeroDAOImpl dao = new HeroDAOImpl(); 
	
	@BeforeClass
	public static void setup(){
		toTest = dao.findOne(50);
	}
	
	@Test
	public void test(){
		
		//update the database's hp
		System.out.println("Before modification: " + toTest);
		toTest.setHp(76);
		dao.update(toTest);
		System.out.println("Updated!");
		dao.delete(toTest);
		System.out.println("Deleted!");
	}
	
}

