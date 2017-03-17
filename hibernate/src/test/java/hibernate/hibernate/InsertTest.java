package hibernate.hibernate;



import java.util.Date;

import org.junit.Test;

public class InsertTest {

	@Test
	public void insert() {
		HeroDao dao = new HeroDAOImpl();
		Hero hero = new Hero("Madman", 2342, 2223, 1124, new Date());
		dao.create(hero);
		System.out.println("Success!!");
		hero = new Hero("CrazyMan", 6774, 2255, 45782, new Date());
		dao.create(hero);
		hero = new Hero("ThunderClap", 241, 12414, 1112, new Date());
		dao.create(hero);
		hero = new Hero("MagicMan", 2209, 33, 200055, new Date());
		dao.create(hero);
	}
	

}
