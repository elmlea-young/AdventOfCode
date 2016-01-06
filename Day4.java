import java.security.*;
import java.math.*;

public class Day4 {

    public static void main(String[] args) {
    	String prefix ="bgvyzdsv";
    	String result = "nope";
    	boolean found = false;
    	String num;
    	String test;
    	int i = 0;

    	while(found==false){
			i++;
    		num = Integer.toString(i);
    		test = prefix+num;
    		result = getHash(test);
    		found = zeros(result);
    	}

    	System.out.println(result);
    	System.out.println(i);
    }

    public static boolean zeros(String hash) {

    	boolean five0s = true;
    	String current;

    	for(int j = 0; j<6; j++){

    		current = Character.toString(hash.charAt(j));

    		if ( !(current.equals("0"))){
    			five0s = false;
    		}
    	}

    	if (five0s == true){
    		return true;
    	} else {
    		return false;
    	}
    }

     public static String getHash(String txt) {
        try {
                    java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
                    byte[] array = md.digest(txt.getBytes());
                    StringBuffer sb = new StringBuffer();
                    for (int i = 0; i < array.length; ++i) {
                        sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
                 }
                    return sb.toString();
            } catch (java.security.NoSuchAlgorithmException e) {
                //error action
            }
            return null;
    }
}