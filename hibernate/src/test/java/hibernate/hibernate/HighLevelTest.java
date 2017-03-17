package hibernate.hibernate;



import org.junit.Test;

public class HighLevelTest {

	@Test
	public void test() {
		System.out.println(new HeroDAOImpl().findHighLevel());
	}

}
