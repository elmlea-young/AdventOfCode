import java.util.*;

public class Day7 {

    public static void main(String[] args) {

    	String txt= "Start";
    	Scanner input = new Scanner(System.in);
    	String[] list = new String[1000];
        int[][] totList = new int[1000][2];
    	int counter = 0;

    	while (!(txt.equals("E"))){

			txt = input.nextLine();
    		String[] temp = txt.split(" ");

            if(!(txt.equals("E"))){
                for (int i = 0; i<temp.length; i++){
                    String s = temp[i];
				    list[counter] = s;
                    totList[counter][0] = s.length();
                    counter++;
                } 
			}

			for (int i = 0; i < counter; i++){
				System.out.println(list[i]);
                System.out.println(totList[i][0]);
			}
    	}
    }
}