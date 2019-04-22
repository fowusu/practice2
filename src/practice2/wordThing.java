package practice2;

public class wordThing {

	public static void main(String abc[]){
		
		readWord obj1 = new readWord();
		obj1.longestWord("hello shafeeq lives in manchesterUK");
	}
}

class readWord{
	
	public void longestWord(String msg) {
		
		String current = ""; 
		String longest = ""; 
		int i = 0;
		int newPosition=-1;
		
		for (; i <= msg.length(); i++) {
			if (i == msg.length() || msg.substring(i, i + 1).equals(" ") ) {
				
				current = msg.substring(newPosition+1,i);
				System.out.println(current+"..."+current.length());
				if(current.length()>longest.length()) {
					longest=current;
					current="";
					
				}
				
				newPosition = i; 
				
				}
			
			
			}
		System.out.println(longest);
}
}

