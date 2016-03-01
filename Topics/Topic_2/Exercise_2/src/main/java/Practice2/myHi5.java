package Practice2;

import java.util.*;

public class myHi5 {
	
	ArrayList<String> postList=new ArrayList<String>();
	
	public ArrayList<String> newPost(String post){
		postList.add(post);
		return postList;
	}
	
	public ArrayList<String> deleteAPost(String deletedPost){
		postList.remove(deletedPost);
		return postList;
	}
	
	public ArrayList<String> topRecentPost(int top){
		
		ArrayList<String> theTopList=new ArrayList<String>(top);
		for (int i = 0; i < theTopList.size(); i++) {
			theTopList.add(i, postList.get(i));
		}
		
		return theTopList;
	}
}
