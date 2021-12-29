package com.xworkz.maps;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.xworkz.maps.mapdto.AddressDTO;
import com.xworkz.maps.mapdto.PersonDTO;

public class PersonScanner {

	public static void main(String[] args) {
		
		PersonDTO personDTO1 = new PersonDTO(1,"ravi",24f,"ravi1995@gmail.com");
		PersonDTO personDTO2 = new PersonDTO(2,"manoj",22f,"manoj007@gmail.com");
		PersonDTO personDTO3 = new PersonDTO(3,"sunil",23f,"sunil123@gmail.com");
		PersonDTO personDTO4 = new PersonDTO(11,"arif",25f,"arifdoc@gmail.com");
		PersonDTO personDTO5 = new PersonDTO(12,"suresh",24f,"suree@gmail.com");
		PersonDTO personDTO6 = new PersonDTO(5,"fuzail",25f,"fuzail786@gmail.com");
		PersonDTO personDTO7 = new PersonDTO(19,"asif",28f,"asif@gmail.com");
		PersonDTO personDTO8 = new PersonDTO(6,"sam",27f,"irfankalwad@gmail.com");
		
		AddressDTO addressDTO1 = new AddressDTO(01,25,"btm 1st stage","bangalore",5483465l);
		AddressDTO addressDTO2 = new AddressDTO(02,35,"btm 2st stage","south bangalore",2544331);
		AddressDTO addressDTO3 = new AddressDTO(003,15,"rajaji nagar","bangalore",54545465l);
		AddressDTO addressDTO4 = new AddressDTO(11,10,"shivaji nagar","bangalore",5544213365l);
		AddressDTO addressDTO5 = new AddressDTO(12,12,"chandapura","attibelle",65431326l);
		AddressDTO addressDTO6 = new AddressDTO(5,30,"mysore bank","bangalore",569734l);
		AddressDTO addressDTO7 = new AddressDTO(19,55,"gudhatti","anekal",575446l);
		AddressDTO addressDTO8 = new AddressDTO(6,67,"electronic city","bangalore",565776l);

		
		Map<PersonDTO, AddressDTO> storeDto= new HashMap<PersonDTO, AddressDTO>();
		
		storeDto.put(personDTO1, addressDTO1);
		storeDto.put(personDTO2, addressDTO2);
		storeDto.put(personDTO3, addressDTO3);
		storeDto.put(personDTO4, addressDTO4);
		storeDto.put(personDTO5, addressDTO5);
		storeDto.put(personDTO6, addressDTO6);
		storeDto.put(personDTO7, addressDTO7);
		storeDto.put(personDTO8, addressDTO8);
	
		
		Set<PersonDTO> person=storeDto.keySet();
		person.forEach((e) ->System.out.println(e));
		
		System.out.println(System.lineSeparator());
		
		Collection<AddressDTO> address = storeDto.values();
		address.forEach((e) ->System.out.println(e));
		
		System.out.println(System.lineSeparator());
		
	Set<Entry<PersonDTO, AddressDTO>> person_map=storeDto.entrySet();
	person_map.forEach((e) ->System.out.println(e));
		
	
		Comparator<PersonDTO> comparator1= (e1,e2) ->{
			float  s1=e1.getAge();
			float  s2=e2.getAge();
			if(s1==s2) { return 0;}
			if(s1<s2) {return 10;}
			if(s1>s2) {return -1;}
			return 0;
		};
		
		Comparator<PersonDTO> comparator= (e1,e2) ->{
			int  s1=e1.getId();
			int  s2=e2.getId();
			if(s1==s2) { return 0;}
			if(s1>s2) {return 10;}
			if(s1<s2) {return -1;}
			return 0;
		};
		Comparator<PersonDTO> name= (f1,f2)->{
			String name1 = f1.getName();
			String name2 = f2.getName();
			  return name1.compareTo(name2);	
		};
		
		System.out.println(System.lineSeparator());
		person.stream().sorted(comparator).forEach((e) ->System.out.println(e.getId()+" "+e.getName()));
		
		System.out.println(System.lineSeparator());
		
		person.stream().sorted(name).forEach((e) ->System.out.println(e.getId()+" "+e.getName()));	
		
		System.out.println(System.lineSeparator());
		person.stream().sorted(name.reversed()).forEach((e) ->System.out.println(e.getName()));
		
		System.out.println("ascending using comparable...");
		Set<PersonDTO> set3=storeDto.keySet();
		person.stream().sorted().map(j->j).forEach(d->System.out.println(d));
		
		System.out.println("descending using comparable...");
		Set<PersonDTO> set4=storeDto.keySet();
		person.stream().sorted(Comparator.reverseOrder()).forEach(u->System.out.println(u));
	}
}
