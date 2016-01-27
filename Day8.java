import java.util.*;

public class Day8 {

    public static void main(String[] args) {

    	String txt= "Start";
    	Scanner input = new Scanner(System.in);
    	String[] list = new String[1000];
        int[][] totList = new int[1000][3];
    	int counter = 0;
        int litCount = 0;
        int total=0;

        //take whole input
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
    	}

        for (int i = 0; i < counter; i++){
            System.out.println(list[i]);
            System.out.println(totList[i][0]);
        }

        //check for '\\' and '\"'

        for(int i = 0; i< counter; i++){
            String current = list[i];

            for(int j = 0; j < current.length()-1; j++){

                char first = current.charAt(j);
                char second = current.charAt(j+1);

                if((first == '\\') && ((second == '\\') || (second == '\"'))){
                    litCount++;
                }
            }
            
            totList[i][1] = litCount;
            System.out.println(litCount);
            litCount = 0;
        }

        //check for hex chars.
        for(int i = 0; i< counter; i++){
            String current = list[i];
            litCount = 2;
            for(int j = 0; j < current.length()-3; j++){
                char first = current.charAt(j);
                char second = current.charAt(j+1);

                if((first == '\\') && (second == 'x')){
                    first = current.charAt(j+2);
                    second = current.charAt(j+3);

                    if(((58 > first)&&(first > 47)) &&((58 > second)&&(second > 47))){
                        litCount= litCount+3;
                    }
                }
            }
            totList[i][1] = totList[i][1] + litCount;
            System.out.println(tot);
            
        }

        for (int i = 0; i< counter; i++){
            totList[i][2]= ((totList[i][0] - totList[i][1]));
            total = total + totList[i][2];
        }
        System.out.println(total);
    }
}