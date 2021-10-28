package com.xworkz.DP;

import com.xworkz.DP.DTO.WebSeriesDTO;
import com.xworkz.DP.DAO.WebSeriesDAO;


public class webStarter {

	public static void main(String[] args) {
		
		WebSeriesDTO webDTO1=new WebSeriesDTO("A",Genre.HEASTRY,
				"749",40,5.0f,454,1020);
		WebSeriesDTO webDTO2=new WebSeriesDTO("B",Genre.ANIME,
				"749",50,5.0f,454,1020);
		WebSeriesDTO webDTO3=new WebSeriesDTO("C",Genre.THRILLER,
				"749",60,5.0f,454,1020);
		WebSeriesDTO webDTO4=new WebSeriesDTO("D",Genre.HEISTS,
				"749",70,5.0f,454,1020);
		WebSeriesDTO webDTO5=new WebSeriesDTO("E",Genre.HEISTS,
				"749",80,5.0f,454,1020);
		WebSeriesDTO webDTO6=new WebSeriesDTO("F",Genre.CREAME,
				"749",90,5.0f,454,1020);
		
		WebSeriesDAO refDAO=new WebSeriesDAO();
		
		refDAO.saveWebSeries(webDTO1);
		refDAO.saveWebSeries(webDTO2);
		refDAO.saveWebSeries(webDTO3);
		refDAO.saveWebSeries(webDTO4);
		refDAO.saveWebSeries(webDTO5);
		refDAO.saveWebSeries(webDTO6);
		refDAO.delete(2);
		refDAO.update(1, webDTO4);
	
		
		
		WebSeriesDTO[] term = new WebSeriesDAO().getdto();
		for (int i = 0; i < term.length; i++) {

			WebSeriesDTO gig =webDTO1 ;
			System.out.println("......................................");

			if (gig != null) {
				System.out.println(gig.getNoOfCharcacters());
				System.out.println(gig.getName());
				System.out.println(gig.getRating());
				System.out.println(gig.getGenre());
				System.out.println(gig.getCast());
				System.out.println(gig.getCurrentSesions());
				System.out.println(gig.getToalSesions());
				
				
			}
			WebSeriesDTO gig1 = webDTO2;
			System.out.println("......................................");

			if (gig != null) {
				System.out.println(gig1.getNoOfCharcacters());
				System.out.println(gig1.getName());
				System.out.println(gig1.getRating());
				System.out.println(gig1.getGenre());
				System.out.println(gig1.getCast());
				System.out.println(gig1.getCurrentSesions());
				System.out.println(gig1.getToalSesions());
			}
			WebSeriesDTO gig2 = webDTO3;
			System.out.println("......................................");

			if (gig != null) {
				System.out.println(gig2.getNoOfCharcacters());
				System.out.println(gig2.getName());
				System.out.println(gig2.getRating());
				System.out.println(gig2.getGenre());
				System.out.println(gig2.getCast());
				System.out.println(gig2.getCurrentSesions());
				System.out.println(gig2.getToalSesions());
			}


		} 
		
		
		
		
		

	}

}
