package hibernate.hibernate;


import java.util.List;
public interface HeroDao {
    public void create(Hero hero);
    public Hero findOne(int pk);
    public void update(Hero hero);
    public void delete(Hero hero);
    
    // HQL -- Hibernate Query Language object oriented extension to SQL
    
    public Hero findByName(String name);
    
    //Criteria -- programmatic SQL queries
    public List<Hero> assemble(); //assemble the world's finest heroes
    //Native query
    public List<Hero> findHighLevel();
    
    //Criteria
    public int highestHp();
    
    public List<Hero> findAll();
}

