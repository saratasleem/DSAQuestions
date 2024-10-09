package StringQuestions;

public class ConversionLCtoUCandUCtoLC {

	public static void main(String[] args) {
		String s="Hi, I want to be an Astronaut & Guitarist";//because string is immutable
		StringBuffer sb= new StringBuffer(s);//so changes have to be done using string buffer
		for(int i=0;i<s.length();i++) {//a loop to traverse all through the length of string
			Character c=s.charAt(i);//converting string into character so that indexing can be achieved
			if(c.isLowerCase(c)) { //if that char on the particular index is lowercase then
				sb.setCharAt(i, c.toUpperCase(s.charAt(i)));//set charcater to uppercase on string buffer stored string
			} else {
				if(c.isUpperCase(c)) {
					sb.setCharAt(i, c.toLowerCase(s.charAt(i)));//same for uppercase to lowercase
				}
			}
		}
      System.out.println("The converted string is: "+sb);//printing
	}
}
//can use replace() method too rather than setCharAt()