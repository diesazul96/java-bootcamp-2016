package Practice2;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class myHi5Test {

	@Test
	public void PostMyFirstPost(){
		
		ArrayList<String> firstPost=new ArrayList<String>();
		myHi5 first=new myHi5();
		firstPost=first.newPost("Post #1");
		ArrayList<String> firstPostTest=new ArrayList<String>(Arrays.asList("Post #1"));
		assertEquals(firstPostTest,firstPost);
	}
	
	@Test
	public void DeleteThePost(){
		ArrayList<String> deletePost=new ArrayList<String>();
		myHi5 second=new myHi5();
		deletePost=second.newPost("Post #1");
		deletePost=second.newPost("Post #2");
		deletePost=second.newPost("Post #3");
		deletePost=second.deleteAPost("Post #2");
		ArrayList<String> deletePostTest=new ArrayList<String>(Arrays.asList("Post #1","Post #3"));
		assertEquals(deletePostTest,deletePost);
	}
	
	@Test
	public void ShowTheTop10(){
		ArrayList<String> topPost=new ArrayList<String>(15);
		ArrayList<String> topPostTest=new ArrayList<String>(10);
		myHi5 third=new myHi5();
		
		for (int i = 0; i < topPost.size(); i++) {
			topPost=third.newPost("Post #"+(i+1));
		}
		
		for (int i = 0; i < topPostTest.size(); i++) {
			topPostTest.add("Post #"+(i+1));
		}
		
		topPost=third.topRecentPost(10);
		
		assertEquals(topPostTest,topPost);
		
	}
}
