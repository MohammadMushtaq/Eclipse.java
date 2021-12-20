package com.xworkz.functional;

import com.xworkz.functional.DAO.BeerDao;
import com.xworkz.functional.DAO.TrainNos;
import com.xworkz.functional.find.Find;
import com.xworkz.functional.impliment.EndsWith;
import com.xworkz.functional.impliment.EqualContentImpliment;
import com.xworkz.functional.impliment.StartWith;

public class BeerScammer {

	public static void main(String[] args) {

		
				BeerDao beerDao = new BeerDao();
				
				Find enter = new EqualContentImpliment();
				boolean match= beerDao.find(enter, "Fisr");
				System.out.println(match);
							
				Find enter1 = new StartWith();
				boolean match1= beerDao.find(enter1, "5454564");
				System.out.println(match1);
				
				Find enter3 = new EndsWith();
				boolean match2= beerDao.find(enter3, "king");
				System.out.println(match2);
				
	}
		
	}
