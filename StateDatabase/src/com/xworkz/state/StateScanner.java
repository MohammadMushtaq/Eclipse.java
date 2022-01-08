package com.xworkz.state;



import com.xworkz.state.dao.StateDAO;
import com.xworkz.state.dao.StateImpl;
import com.xworkz.state.entity.StateEntity;

public class StateScanner {

	public static void main(String[] args) {

		StateEntity stateEntity1 = new StateEntity(1,"karnataka","28","bangalore");
		StateEntity stateEntity2 = new StateEntity(2,"maharastra","27","mumbai");
		StateEntity stateEntity3 = new StateEntity(3,"tamilnadu","30","chennai");
		StateEntity stateEntity4 = new StateEntity(4,"AP","25","amravati");

		StateDAO stateDAO = new StateImpl();
	//	stateDAO.create(stateEntity1);
		stateDAO.create(stateEntity2);
		stateDAO.create(stateEntity3);
		stateDAO.create(stateEntity4);

	}

}