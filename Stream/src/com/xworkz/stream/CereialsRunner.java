package com.xworkz.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CereialsRunner {

	public static void main(String[] args) {
		
		String serial1="koun ki saas bi bahu thi";
		String serial2="ush koi hai";
		String serial3="kaousiti zindagi gi";
		String serial4="koun ki saas bi bahu thi";
		String serial5="kahi tho hoga";
		String serial6="shakti man";
		String serial7="shakala bum bum";
		String serial8="kkichdi";
		String serial9="thoda sa pyar";
		String serial10="kahani ghar ghar ki";
		String serial11="son pari";
		String serial12="cid";
		String serial13="kapil show";
		String serial14="indian idol";
		String serial15="dance diwane";
		String serial16="dance india dance";
		String serial17="kbc";
		String serial18="family man";
		String serial19="fir";
		String serial20="dus ka dum";
		
		Stream<String> seraial= Stream.of(serial1,serial2,serial3,serial4,serial5,
				serial6,serial7,serial8,serial9,serial10,serial11,serial12,serial13,serial14,
				serial15,serial16,serial17,serial18,serial19,serial20);
		List<String> temp= seraial.sorted((e1,e2) -> e2.compareTo(e1)).collect(Collectors.toList());
		temp.forEach((e) -> System.out.println(e.toLowerCase()));
		

	}

}
