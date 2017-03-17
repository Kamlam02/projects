package hibernate.hibernate;

import org.junit.Test;
import java.util.*;
public class CriteriaTest {

    @Test
    public void test(){
        List<Hero> heroes = new HeroDAOImpl().assemble();
        
        for(Hero h : heroes){
            System.out.println(h + "youre invited!");
        }
    }
    
}