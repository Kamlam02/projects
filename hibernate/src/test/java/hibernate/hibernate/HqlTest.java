package hibernate.hibernate;

import org.junit.Test;

public class HqlTest {

	@Test
	public void demo() {
		System.out.println(new HeroDAOImpl().findByName("Iceman"));
	}

}
