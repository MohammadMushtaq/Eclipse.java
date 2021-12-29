package com.xworkz.sys.dto.Runner;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.sys.dto.PalacesDto;
import com.xworkz.sys.dto.StateDto;

public class StateTester {

	public static void main(String[] args) {
		StateDto stateDto1 = new StateDto("karanataka",28,340,1500465.50f,true);
		StateDto stateDto2 = new StateDto("andrapradesh",24,340,1500465.50f,true);
		StateDto stateDto3 = new StateDto("tamil nadu",28,340,1500465.50f,true);
		StateDto stateDto4 = new StateDto("kerala",28,340,1500465.50f,true);
		StateDto stateDto5 = new StateDto("maharastra",28,340,1500465.50f,true);
		StateDto stateDto6 = new StateDto("punjab",28,340,1500465.50f,true);
		StateDto stateDto7 = new StateDto("up",28,340,1500465.50f,true);
		StateDto stateDto8 = new StateDto("bihar",28,340,1500465.50f,true);
		StateDto stateDto9 = new StateDto("rajastan",28,340,1500465.50f,true);
		StateDto stateDto10 = new StateDto("gujrat",28,340,1500465.50f,true);
		
		List<StateDto> list= new ArrayList<StateDto>(); 
		list.add(stateDto1);
		list.add(stateDto2);
		list.add(stateDto3);
		list.add(stateDto4);
		list.add(stateDto5);
		list.add(stateDto6);
		list.add(stateDto7);
		list.add(stateDto8);
		list.add(stateDto9);
		list.add(stateDto10);
		
		boolean  remove =list.remove(stateDto1);
		System.out.println(remove);
		
		boolean contain =list.contains(stateDto10);
		System.out.println(contain);
		
	//	list.clear();
		
		int size =list.size();
		System.out.println(size);
		
		Iterator<StateDto> it=  list.iterator();
		while (it.hasNext()) {
			StateDto stateDto = it.next();
			System.out.println(stateDto);
		}
		
		
	}

}
