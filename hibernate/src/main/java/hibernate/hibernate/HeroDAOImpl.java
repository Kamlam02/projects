package hibernate.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.impl.SQLQueryImpl;

public class HeroDAOImpl implements HeroDao {

	private SessionFactory sf = HibernateUtils.getSessionFactory();
	private Session session;

	public HeroDAOImpl() {
		session = sf.openSession(); // session per request
	}

	public void create(Hero hero) {
		Transaction tx = session.beginTransaction();
		try {
			session.save(hero);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}

	public Hero findOne(int pk) {
		Hero hero = (Hero) session.load(Hero.class, pk); // generate SELECT
		return hero;
	}

	public void update(Hero hero) {
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(hero);
		tx.commit();
	}

	public void delete(Hero hero) {
		Transaction tx = session.beginTransaction();
		session.delete(hero);
		tx.commit();
	}

	public Hero findByName(String name) {
		// object oriented (use class & property names, not table/column)
		// if you dont have select it will get all field
		// name parameters!! use : to indicate a param
		/*String hql = "from hibernate.hibernate.Hero where name = :param";
		Query query = session.createQuery(hql);
		query.setString("param", name);*/
		//uniqueResult return one and only one value
		//return (List<Hero>) query.list(); // return multiple Heros
		
		//calling the Query from the bean by name
		Query query = session.getNamedQuery("findByName"); // no HQL written here
		query.setString("param", name);
		// 100% sure you're only getting back 1 value if not you will get exception
		return (Hero)query.uniqueResult(); 
	}


				@SuppressWarnings("unchecked")
				public List<Hero> assemble() {
					//criteria is a builder object
					//programmatically building query, Restrictions == where clause
					Criteria criteria = session.createCriteria(Hero.class);
					return criteria.add(Restrictions.gt("hp", 150))
					.add(Restrictions.ge("mp", 300))
					.add(Restrictions.between("level", 300, 1300))
					.list();
					
			
		}

				 @SuppressWarnings("unchecked")
				    public List<Hero> findHighLevel() {
				        //SQLQuery query = session.createSQLQuery("SELECT * FROM ....")
				        Query query = session.getNamedQuery("findHighLevel");
				        return query.list();
				    }

				public int highestHpRaid() {
					Criteria criteria = session.createCriteria(Hero.class);
					return (Integer) criteria.add(Restrictions.gt("hp", 150))
					.add(Restrictions.ge("mp", 300))    //WHERE
					.add(Restrictions.between("level", 300, 1300))    
							.setProjection(Projections.max("hp")) // aggregate function
							.uniqueResult();
				}
				
				public int highestHp() {
					return (Integer) session.createCriteria(Hero.class)
							.setProjection(Projections.max("hp"))
							.uniqueResult();
				}

				
				@SuppressWarnings("unchecked")
				public List<Hero> findAll() {
					
					
					//return session.createQuery("from Hero").list();
					
					return session.createCriteria(Hero.class).list();
				}

}
