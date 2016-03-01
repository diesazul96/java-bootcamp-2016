package TDD;

import java.util.*;

public class RecentFileList {

	public ArrayList<String> clearlist(ArrayList<String> listToClean){
		listToClean.clear();
		System.out.println("List is empty");
		return listToClean;
	}
	
	public ArrayList<String> addToList(ArrayList<String> listToReceive, String file){
		int z=0;
		int m=0;
		
		if(listToReceive.size()==15 && listToReceive.get(14)!=null){
			listToReceive.remove(14);
			listToReceive.add(0, file);
			m++;
		}
		
		if(m==0){
			for(int x=0;x<listToReceive.size();x++) {
			  	if(listToReceive.get(x)==file){
				  	listToReceive.add(0, file);
				  	listToReceive.remove(x+1);
				  	z++;
				  	break;
			  }
			}
		}
		
		if(z==0 && m==0){
				  listToReceive.add(file);
				  System.out.println("The file "+file+" has been open it");
			  }
			
		
		return listToReceive;
	}
	
	
}
