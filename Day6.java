import java.util.Scanner;

public class Day6 {

    public static void main(String[] args) {

    	Scanner input = new Scanner(System.in);
    	String[][] list = new String[1000][4];
        int[][] lights = new int[1000][1000];
    	int counter = 0;
    	String txt = "start";
        String action;
        int lightsOn = 0;

        //read in all inputs
    	while (!(txt.equals("E"))){

			txt = input.nextLine();

            //remove 'turn' so the action is always the first word
    		if(txt.contains("turn")){
    			txt = txt.replace("turn ", "");
    		}

            //can now split line equally on a space
    		String[] temp = txt.split(" ");

            //add the new line into the list array
            if(!(txt.equals("E"))){
                for (int i = 0; i<4; i++){
				    list[counter][i] = temp[i];
                }
                counter++;
			}
    	}

        //initialise lights grid
        for (int i = 0; i< 1000; i++){
            for (int j = 0; j< 1000; j++){
                lights[i][j] = 0;
            }
        }

        //start processing data
        for (int i = 0; i<counter; i++){

            action = list [i][0];
            int[] coords = getCoords(list, i);

            switch(action){
                case "toggle":
                    toggle(lights, coords);
                    break;
                case "on":
                    on(lights, coords);
                    break;
                case "off":
                    off(lights, coords);
                    break;
            }

            //System.out.println(list[i][0] + list[i][1] + list[i][2] + list[i][3]);
        }
        //count lights on
        for (int i = 0; i< 1000; i++){
            for (int j = 0; j< 1000; j++){
                if (lights[i][j] == 1){
                    lightsOn++;
                }
            }
        }

        System.out.println(lightsOn);
    }

    public static int[][] toggle(int[][] grid, int[] points){
        int x1 = points[0];
        int y1 = points[1];
        int x2 = points[2];
        int y2 = points[3];

        //loop through lights within coords, change them.
        for (int i = x1; i < x2; i++){
            for (int j = y1; j< y2; j++){
                if (grid[i][j] == 0){
                    grid[i][j] = 1;
                }
                else{
                    grid[i][j] = 0;
                }
            }
        }

        return grid;
    }

    public static int[][] on(int[][] grid, int[] points){
        int x1 = points[0];
        int y1 = points[1];
        int x2 = points[2];
        int y2 = points[3];

        //loop through lights within coords, change them.
        for (int i = x1; i < x2; i++){
            for (int j = y1; j< y2; j++){
                grid[i][j]= 1;
            }
        }

        return grid;
    }

    public static int[][] off(int[][] grid, int[] points){
        int x1 = points[0];
        int y1 = points[1];
        int x2 = points[2];
        int y2 = points[3];

        //loop through lights within coords, change them.
        for (int i = x1; i < x2; i++){
            for (int j = y1; j< y2; j++){
                grid[i][j]= 0;
            }
        }

        return grid;
    }

    public static int[] getCoords(String[][] instructions, int j){
        int[] points = new int[4];

        String[] tempA = new String[2];
        String[] tempB = new String[2];

        //split the two coordinate cells into these arrays
        tempA = instructions[j][1].split(",");
        tempB = instructions[j][3].split(",");

        //out all coords into this array and convert to integers
        points[0] = Integer.parseInt(tempA[0]);
        points[1] = Integer.parseInt(tempA[1]);
        points[2] = Integer.parseInt(tempB[0])+1;
        points[3] = Integer.parseInt(tempB[1])+1;

        return points;
    }
   
}