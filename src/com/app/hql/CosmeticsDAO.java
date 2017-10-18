package com.app.hql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CosmeticsDAO {

	public static void main(String[] args)
	{
		CosmeticsDTO  cosmetic=       new CosmeticsDTO(); 
		cosmetic.setBrand("Lakme");
		cosmetic.setType("suncreem");
		cosmetic.setColor("cream");
		cosmetic.setCost(285);
		
		
		Configuration    config=new Configuration();
		config.configure();
		
		config.addAnnotatedClass(CosmeticsDTO.class);
		//code optimisation
		//SessionFactory sf=config.buildSessionFactory();
		//Session sess= sf.openSession();
		
		Session sess=config.buildSessionFactory().openSession();
		
		//HQL 
		//step 1 create the query
		
		String qyery="select * from CosmeticsDTO where brand='Lakme'";
		 Query hql=sess.createQuery(qyery);
		 
		 
		 //2 process the result
		 
		 CosmeticsDTO cos1=(CosmeticsDTO)hql.uniqueResult();
		 System.out.println(cos1.getCost());
		 System.out.println(cos1.getColor());
		 System.out.println(cos1.getType());
		
	}

}
