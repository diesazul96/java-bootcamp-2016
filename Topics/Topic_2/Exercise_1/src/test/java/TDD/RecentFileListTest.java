package TDD;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class RecentFileListTest {
    
	@Test
	public void WhenTheArrayRunTheArrayIsEmpty(){
		RecentFileList list = new RecentFileList();
		ArrayList<String> newList = new ArrayList<String>(15);
		newList.add("1 File");
		newList.add("2 File");
		ArrayList<String> emptyList = new ArrayList<String>(15);
		assertEquals(emptyList,list.clearlist(newList));
	}
	
	@Test
	public void WhenOpenFileAddToList(){
		RecentFileList list2 = new RecentFileList();
		ArrayList<String> newList = new ArrayList<String>(Arrays.asList("1 File","2 File"));
		newList=list2.addToList(newList,"3 File");
		ArrayList<String> newListTest = new ArrayList<String>(Arrays.asList("1 File","2 File","3 File"));
		assertEquals(newListTest,newList);
	}
	
	@Test
	public void WhenExistFileOpenBumpedToTop(){
		RecentFileList list3 = new RecentFileList();
		ArrayList<String> newListToEdit = new ArrayList<String>(Arrays.asList("1 File","2 File","3 File"));
		newListToEdit=list3.addToList(newListToEdit, "2 File");
		ArrayList<String> newListToEditTest = new ArrayList<String>(Arrays.asList("2 File","1 File","3 File"));
		assertEquals(newListToEditTest,newListToEdit);
	}
	
	@Test
	public void WhenArrayFullDeleteOlderItem(){
		RecentFileList list4 = new RecentFileList();
		ArrayList<String> fullList = new ArrayList<String>(Arrays.asList("1 File","2 File","3 File","4 File","5 File","6 File","7 File","8 File"
				,"9 File","10 File","11 File","12 File","13 File","14 File","15 File"));
		fullList=list4.addToList(fullList, "16 File");
		ArrayList<String> fullListTest = new ArrayList<String>(Arrays.asList("16 File","1 File","2 File","3 File","4 File","5 File","6 File","7 File","8 File"
				,"9 File","10 File","11 File","12 File","13 File","14 File"));
		assertEquals(fullListTest,fullList);
	}
	
}
