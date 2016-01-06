import java.util.*;

public class Day5Part2 {

    public static void main(String[] args) {

    	Scanner input = new Scanner(System.in);
    	boolean result = true;
    	int nicetotal = 0;

		String txt = input.nextLine();

    	while (!(txt.equals("E"))){

    	   if ((result = nice(txt)) == true){
    			nicetotal++;
    		}
    	   txt = input.nextLine();
    	}

    	System.out.println(nicetotal);
    }

    public static boolean nice(String text){
    	String current;
    	String next;
    	boolean check = true;
    	boolean duplicate = false;
        String comp1;
        String comp2;

    	for (int i = 0; i < text.length()-2; i++){
    		current = Character.toString(text.charAt(i));
    		next = Character.toString(text.charAt(i+2));
    		if (current.equals(next)){
    			duplicate = true;
    		}
    	}
    	if (duplicate==false){
    		check=false;
    	}

        if(check==true){
            duplicate=false;

            for (int i = 0; i<text.length()-2;i++){

                current = Character.toString(text.charAt(i));
                next = Character.toString(text.charAt(i+1));

                for (int j = i+2; j<text.length()-1; j++){

                    comp1 =Character.toString(text.charAt(j));
                    comp2 = Character.toString(text.charAt(j+1));

                    if (comp1.equals(current)&&comp2.equals(next)){
                        duplicate = true;
                    }
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
}