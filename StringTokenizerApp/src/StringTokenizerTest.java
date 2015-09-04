import java.util.StringTokenizer; 

public class StringTokenizerTest {

	public static void main(String[] args) { 
		/**
		 * definitions:
		 * 	parsing = dividing a string into tokens based on the given delimiters
		 *	token = one piece of information, a "word"
		 *	delimiter = one (or more) characters used to separate tokens
		 */
		
		String in = "2005-10-22 15:33:22";
		
		in = in.replace(" ","-");
		in = in.replace(":","-");
		
		System.out.println("The cleaned up string is " + in);
		StringTokenizer st = new StringTokenizer(in, "-"); 
		
		//nextElement returns Object. If you call nextToken
		//you would not need to cast.
			System.out.println(st.nextToken()); 
			System.out.println(st.nextToken()); 
			System.out.println(st.nextToken()); 
	
		//Alternatively, Strings in Java can be parsed using the split method of the String class. 
		/*
		 * Suppose we have a string containing several English sentences
		 * that uses only commas, periods, question marks, and 
		 * exclamation points as punctuation.  
		 * We wish to extract the individual words in the string 
		 * (excluding the punctuation).  
		 * In this situation we have several delimiters 
		 * (the punctuation marks as well as spaces) and we want 
		 * to treat consecutive delimiters as one
		 * 
		 * String s = string_to_parse;
		 * String delims = "[delimiters]+"; // use + to treat consecutive
		 * String[] tokens = s.split(delims);
		 */
		String str = "This is a sentence.  This is a question, right?  Yes!  It is.";
		String delims = "[ .,?!]+";
		String[] tokens = str.split(delims);	
		
		for (int i = 0; i < tokens.length; i++)
		    System.out.println(tokens[i]);
		
			
	} 
}
