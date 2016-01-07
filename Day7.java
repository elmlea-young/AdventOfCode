import java.util.*;

public class Day7 {

    public static void main(String[] args) {

    	String txt= "Start";
    	Scanner input = new Scanner(System.in);
    	String[][] list = new String[1000][5];
    	int counter = 0;

    	while (!(txt.equals("E"))){

			txt = input.nextLine();
    		String[] temp = txt.split(" ");

            if(!(txt.equals("E"))){
                for (int i = 0; i<temp.length; i++){
				    list[counter][i] = temp[i];
                }
                counter++;
			}

			for (int i = 0; i < counter; i++){
				for( int j = 0; j < list[i].length; j++){
					System.out.println(list[i][j]);
				}
			}
    	}
    }
}