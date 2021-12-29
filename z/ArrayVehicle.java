package com.xworkz.wrapperClass;

public class ArrayVehicle {

	public static void main(String[] args) {

		String musht= "ka 34 ef 1948";
		String ravi ="ka 34 df 1954";
		String navee="ka 55 de 1758";
		String ravish ="ka 57 ff 1455";
		String fuzail="ka 45 fj 2154";
		String balu="ka 56 fd 4878";
		String navid= "ka 63 as 1457";
		String hanry="ka 55 fd 4845";
		String ganesh ="ka 45 dd 7455";
		String javid ="ka 24 ff 4525";
		
		
		String[] vehiclesNum= new String[10];
		
		for (int i = 0; i < vehiclesNum.length; i++) {
			System.out.println(vehiclesNum[i]);
			vehiclesNum[0]=ravi;
			vehiclesNum[1]=ravish;
			vehiclesNum[2]=hanry;
			vehiclesNum[3]=javid;
			vehiclesNum[4]=javid;
			vehiclesNum[5]=javid;
			vehiclesNum[7]=javid;
			vehiclesNum[8]=javid;
			vehiclesNum[9]=javid;
		}
			System.out.println(vehiclesNum[1]);
			System.out.println(vehiclesNum[0]);
			System.out.println(vehiclesNum[4]);
			System.out.println(vehiclesNum[6]);
			System.out.println(vehiclesNum.length);
			
		//pancard
			
			String mushtaq= "ABCDTE1245E";
			String ravis ="FGERTS1248D";
			String naveen="FHGHGFH1758D";
			String ravisha ="HKSNXKF14559";
			String fuz="ASGJRTT2154J";
			String bavesh="HGSGDSJK4878R";
			String naveed= "BDOLlDK1457Q";
			String harsh="JSFSSKD4845O";
			String gita ="KADFGGGD7455M";
			String javeed ="KSDKJKL4525N";	
		
			
			String[] panNum= {mushtaq,ravis,naveed,naveen,bavesh,gita
					,javeed,harsh,fuz,ravisha};
			System.out.println(panNum.length);
			for (int i = 0; i < panNum.length; i++) {
				System.out.println(panNum[i]);
			}
			
			
		//password
			String mushtaq12= "ABCDTE@11245E";
			String ravis13 ="FGERTS#@1248D";
			String naveen13="FHGHGFH1@758D";
			String ravisha12 ="HKSNXKF@14559";
			String fuz12="ASGJRTT@2154J";
			String bavesh22="HGSGDSJK@4878R";
			String naveed45= "BDOLlDK@1457Q";
			String harsh45="JSFSSKD@4845O";
			String gita65 ="KADFGGGD@7455M";
			String javeed45 ="KSDKJKL@4525N";	
			
		String[] password=new String[10];
		password[0]=mushtaq12;                  
		password[1]=gita65;   	
		password[2]=harsh45;   
		password[3]=javeed45;   
		password[4]=bavesh22;   
		
		
		System.out.println(password.length);
		System.out.println(password[2]);
		
		
		
		
		                                   
	}
}
