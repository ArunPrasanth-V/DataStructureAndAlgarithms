package linkedListsAndthereConcept;

import java.util.LinkedList;
import java.util.List;

public class ArrayTOlinkedList {

	public static void main(String[] args) {
		String []total= {"am","arun"," java","Coder"};
        List<String>con=new LinkedList<>();
        for(String word:total)
        {
        	con.add(word);
        }
        System.out.println(con);
	}

}
