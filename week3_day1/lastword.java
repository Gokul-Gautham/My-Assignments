package week3.week3_day1;

public class lastword {
	/*
	String getlastword(String sentance){
		int length = sentance.length();
		//System.out.println(length);
		int start = 0;
		for (int i = length-1; i >= 0; i--) {
			char n = sentance.charAt(i);
			//System.out.println(n);
			if (n==' '){
				//System.out.println(i);
				start=start+i;
				break;
			}
		}
		String output = sentance.substring(start+1,length);
		System.out.println("The last word is \" " + output + " \" with length " + (output.length()) );
		return sentance;
	}
*/
	public static void main(String[] args) {
	    /*
		lastword a=new lastword();
		a.getlastword("luffy is still joyboy");
		*/
		
		String word = "luffy is still joyboy";
		String[] split = word.split(" ");
		System.out.println(split[3]);
	}

}
