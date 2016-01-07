import java.util.Scanner;
import java.util.ArrayList;
public class Day2 {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int l;
    	int w;
    	int h;
    	int count = 0;
    	int total = 0;
    	ArrayList<String> presents = new ArrayList<String>();

		String present = "start";

    	while (!(present.equals("E"))){

    		present = input.nextLine();
    		presents.add(present);
			count++;
    	}

		String[][] dimentions = new String[count][3];

    	for (int i = 0; i < count-1;i++){

			String current = presents.get(i);
			String[] temp = current.split("x");
			

			for (int j = 0; j<3; j++){
				dimentions[i][j] = temp[j];
			}
		}

		/*for (int i = 0; i<count-1; i++){
			l= Integer.parseInt(dimentions[i][0]);
			w= Integer.parseInt(dimentions[i][1]);
			h= Integer.parseInt(dimentions[i][2]);

			int side1=(l*w);
			int side2=(w*h);
			int side3=(h*l);

			int smallest;

			if(side1 <= side2){
				smallest=side1;
			}
			else{
				smallest=side2;
			}
			if (smallest>= side3){
				smallest=side3;
			}

			int surfacearea = ((2*side1) + (2*side2) + (2*side3) + smallest);

			total = total + surfacearea;
			
		}
		System.out.println(total);
		*/
		int ribbontotal = 0;
		for (int i = 0; i<count-1; i++){
			l= Integer.parseInt(dimentions[i][0]);
			w= Integer.parseInt(dimentions[i][1]);
			h= Integer.parseInt(dimentions[i][2]);

			int biggest;
			int ribbon =0;

			if(l >= w){
				biggest=l;
			}
			else{
				biggest=w;
			}
			if (biggest<= h){
				biggest=h;
			}

			if (biggest==l){
				ribbon = ((w+h)*2);
			}
			if (biggest==w){
				ribbon = ((l+h)*2);
			}
			if (biggest==h){
				ribbon = ((w+l)*2);
			}

			ribbon = ribbon + (l*w*h);

			ribbontotal = ribbontotal + ribbon;
			
		}

		System.out.println(ribbontotal);

    }
}