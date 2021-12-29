package com.xworkz.sys.dto.Runner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.sys.dto.ActorDto;


public class ActorTester {

	public static void main(String[] args) {
		ActorDto actorDto = new ActorDto("salman", 54, 400, true, "mumbai");
		ActorDto actorDto1 = new ActorDto("srk", 56, 500, true, "mumbai");
		ActorDto actorDto2 = new ActorDto("sudeep", 54, 150, true, "bangalore");
		ActorDto actorDto3 = new ActorDto("amitab bachan", 54, 500, true, "mumbai");
		ActorDto actorDto4 = new ActorDto("puneet", 45, 250, false, "bangalore");
		ActorDto actorDto5 = new ActorDto("govinda", 54, 500, true, "maharastra");
		ActorDto actorDto6 = new ActorDto("sohail", 54, 500, true, "mumbai");
		ActorDto actorDto7 = new ActorDto("ranbeer kapoor", 54, 500, true, "mumbai");
		ActorDto actorDto8 = new ActorDto("ranveer singh", 54, 500, true, "delhi");
		ActorDto actorDto9 = new ActorDto("rajnikanth", 54, 500, true, "tamilnadu");
		ActorDto actorDto10 = new ActorDto("surya", 54, 500, true, "kerala");
		
		List<ActorDto> list = new ArrayList<ActorDto>();
		list.add(actorDto);
		list.add(actorDto1);
		list.add(actorDto2);
		list.add(actorDto3);
		list.add(actorDto4);
		list.add(actorDto5);
		list.add(actorDto6);
		list.add(actorDto7);
		list.add(actorDto8);
		list.add(actorDto9);
		list.add(actorDto10);

		boolean  remove =list.remove(actorDto1);
		System.out.println(remove);
		
		boolean contain =list.contains(actorDto10);
		System.out.println(contain);
		
	//	list.clear();
		
		int size =list.size();
		System.out.println(size);
		
		Iterator<ActorDto> it=  list.iterator();
		while (it.hasNext()) {
			ActorDto actor = it.next();
			System.out.println(actor);
		}
		
	}

}
