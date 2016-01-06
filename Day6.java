import java.util.Scanner;

public class Day6 {

    public static void main(String[] args) {

    	Scanner input = new Scanner(System.in);
    	String[][] list = new String[1000][4];
    	int counter = 0;
    	String txt = input.nextLine();

    	while (!(txt.equals("E"))){
			
    		if(txt.contains("turn")){
    			txt = txt.replace("turn ", "");
    		}
    		System.out.println(txt);
    		String[] temp = txt.split(" ");

    		for (int i = 0; i<4; i++){
				list[counter][i] = temp[i];
			}

    		System.out.println(list[counter][0] + " " + list[counter][1] + " " + list[counter][2] + " " + list[counter][3]);
			counter++;
			txt = input.nextLine();
    	}

    }
}