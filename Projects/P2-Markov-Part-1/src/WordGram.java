
/**
 * A WordGram represents a sequence of strings
 * just as a String represents a sequence of characters
 * 
 * @author Michelle Qiu
 *
 */
public class WordGram {
	
	private String[] myWords;   
	private String myToString;  // cached string
	private int myHash;         // cached hash value
	/**
	 * Create WordGram by creating instance variable myWords and copying
	 * size strings from source starting at index start
	 * @param source is array of strings from which copying occurs
	 * @param start starting index in source for strings to be copied
	 * @param size the number of strings copied
	 */
	public WordGram(String[] source, int start, int size) {
		myWords = new String[size];
		for (int i = start; i<start + size; i++){
			myWords[i - start] = source [i];
		}
		myToString = myWords.toString();
		//myToString = source[start];
		myHash = hashCode();

		// TODO: initialize all instance variables
	}

	/**
	 * Return string at specific index in this WordGram
	 * @param index in range [0..length() ) for string 
	 * @return string at index
	 */
	public String wordAt(int index) {
		if (index < 0 || index >= myWords.length) {
			throw new IndexOutOfBoundsException("bad index in wordAt "+index);
		}
		return myWords[index];
	}

	/**
	 * Complete this comment
	 * @return
	 */
	public int length(){
		return myWords.length;
	}


	/**
	 * Complete appropriate comment here
	 * @param other
	 * @return
	 */
	@Override
	public boolean equals(Object other) {
		if (! (other instanceof WordGram) || other == null){
			return false;
		}
		// TODO: Complete this method
		else if (other instanceof WordGram){
			WordGram wg = (WordGram) other;
			if (wg.length() != this.myWords.length){
				return false;
			}
			else {
				if (wg.toString().equals (myToString)){
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public int hashCode(){
		if (myHash == 0){
			myHash = this.toString().hashCode();
		}
		// TODO: complete this method: assign to myHash as needed
		return myHash;
	}
	

	/**
	 * Create and complete this comment
	 * @param last is last String of returned WordGram
	 * @return
	 */
	public WordGram shiftAdd(String last) {
		String [] word = new String [myWords.length];
		for (int i = 0; i<word.length - 1; i++){
			String w = myWords[i + 1];
			word[i] = w;
		}
		word [ word.length - 1] = last;
		WordGram wg = new WordGram(word,0,myWords.length);

		// TODO: Complete this method

		return wg;
	}

	@Override
	public String toString(){
		myToString = String.join(" ", myWords);

		// TODO: Complete this method, assign to myToString as needed
		return myToString;
	}
}
