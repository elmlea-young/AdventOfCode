import java.util.*;

public class Day5 {

    public static void main(String[] args) {

    	Scanner input = new Scanner(System.in);
    	boolean isNice = true;
    	int naughtytotal = 0;
    	int nicetotal = 0;
    	int neutral = 0;

		String txt = input.nextLine();

    	while (!(txt.equals("E"))){

    		if ((isNice = naughty(txt)) == true){
    			naughtytotal++;
    		}
    		else{
    			if ((isNice = nice(txt)) == true){
    				nicetotal++;
    			}
    			else{
    				neutral++;
    			}
    		}

    		txt = input.nextLine();
    	}

    	System.out.println(nicetotal);
    	System.out.println(naughtytotal);
    	System.out.println(neutral);
    }

    public static boolean nice(String text){
    	int vowels=0;
    	String current;
    	String next;
    	boolean check = true;

    	for(int i = 0; i< text.length();i++){
    		if ((text.contains("a")) || (text.contains("e")) || (text.contains("i")) || (text.contains("o")) || (text.contains("u"))){
    			vowels++;
    		}	
    	}

    	if (vowels < 3){
    		check=false;
    	}

    	if(check==true){
    		boolean duplicate = false;
    		for (int i = 0; i < text.length()-1; i++){
    			current = Character.toString(text.charAt(i));
    			next = Character.toString(text.charAt(i+1));
    			if (current.equals(next)){
    				duplicate = true;
    			}
    		}
    		if (duplicate==false){
    			check=false;
    		}
    	}

    	if (check==true){
    		return true;
    	}
    	else{ 
    		return false;
    	}
    }

    public static boolean naughty(String text){

    	String str1 = "ab";
    	String str2 = "cd";
    	String str3 = "pq";
    	String str4 = "xy";

    	if ( text.contains(str1) || text.contains(str2) || text.contains(str3) || text.contains(str4) ){
    		return true;
    	}
    	else{
    		return false;
    	}
    	
    }
}