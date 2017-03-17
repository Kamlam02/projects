package hibernate.hibernate;

import static org.junit.Assert.*;

import org.junit.Test;

public class GetTest {

	@Test
	public void get() {
		System.out.println(new HeroDAOImpl().findOne(50));
		
	}

}
