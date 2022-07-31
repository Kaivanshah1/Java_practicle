import java.util.Arrays;

class Main {
	public static String[] wordsWithout(String[] x,String y) {
		//Logic to find the length of the corrected array.
		int nlen=0;
		for(int j=0; j<x.length;j++) {
			if(x[j].equals(y)) {
				nlen++;
			}
		}
		nlen=x.length-nlen;
		
		String[] correct=new String[nlen];
		int position=0;
		//copying the values of the x[] in correct[] except for the target string.
		for(int i=0 ; i<x.length; i++) {
			if(!x[i].equals(y)) {
				correct[position]= x[i];
				position++;
			}
	    }
		return correct;
	}
	public static void main(String[] args) {
		String[] m ={"a", "b", "c", "a"};
		String target ="a";
		
		System.out.println(Arrays.toString(wordsWithout(m, target)));
		
		String[] m1 ={"a", "b", "c", "a"};
		String target1 ="b";
		
		System.out.println(Arrays.toString(wordsWithout(m1, target1)));
		
		String[] m2 ={"a", "b", "c", "a"};
		String target2 ="c";
		
		System.out.println(Arrays.toString(wordsWithout(m2, target2)));
	}

}
