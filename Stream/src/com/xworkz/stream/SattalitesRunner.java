package com.xworkz.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SattalitesRunner {

	public static void main(String[] args) {
		String sattalite1="GSLV-F10 / EOS-03 ";
		String sattalite2="Ariane-5 VA-251 ";
		String sattalite3="PSLV-C48/RISAT-2BR1 ";
		String sattalite4="PSLV-C50/CMS-01 ";
		String sattalite5="PSLV-C48/RISAT-2BR1 ";
		String sattalite6="GSLV-Mk III - M1 / Chandrayaan-2 Mission ";
		String sattalite7="GSLV-F11 / GSAT-7A Mission ";
		String sattalite8="PSLV-C43 / HysIS Mission ";
		String sattalite9=" GSLV Mk III-D2 / GSAT-29 Mission";
		String sattalite10=" GSLV-F08/GSAT-6A Mission";
		String sattalite11=" PSLV-C40/Cartosat-2 Series Satellite Mission";
		String sattalite12="PSLV-C37 / Cartosat -2 Series Satellite ";
		String sattalite13=" PSLV-C37 / Cartosat -2 Series Satellite";
		String sattalite14=" GSLV-F05 / INSAT-3DR";
		String sattalite15=" PSLV-C33/IRNSS-1G";
		String sattalite16=" GSLV-D6";
		String sattalite17=" PSLV-C19/RISAT-1";
		String sattalite18="GSLV-D3 / GSAT-4 ";
		String sattalite19=" Ariane-44L H10+";
		String sattalite20=" Delta";
		
		Stream<String> t= Stream.of(sattalite1,sattalite2,sattalite3,sattalite4,sattalite5,sattalite7,sattalite6,
				sattalite8,sattalite9,sattalite10,sattalite11,sattalite12,sattalite13,sattalite14,sattalite15,sattalite16,
				sattalite16,sattalite17,sattalite18,sattalite19, sattalite20);
		List<String> temp= t.sorted((e1,e2) -> e2.compareTo(e1)).collect(Collectors.toList());
		temp.forEach((e) -> System.out.println(e.toLowerCase()));
		
		System.out.println(" ");
		Stream<String> t1= Stream.of(sattalite1,sattalite2,sattalite3,sattalite4,sattalite5,sattalite7,sattalite6,
				sattalite8,sattalite9,sattalite10,sattalite11,sattalite12,sattalite13,sattalite14,sattalite15,sattalite16,
				sattalite16,sattalite17,sattalite18,sattalite19, sattalite20);
		
		List<String> temp1= t1.sorted((e1,e2) -> e2.compareTo(e1)).collect(Collectors.toList());
		temp1.forEach((e) -> System.out.println(e));
	}

}
