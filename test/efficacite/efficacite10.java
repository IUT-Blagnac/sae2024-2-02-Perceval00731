package iut.sae.algo;


public class efficacite10{
    public static String RLE(String in){
        // Provide your algo here
        String RLE="";
        int j;
        for (int i=0;i<in.length();i+=j){
            char lettre=in.charAt(i);
            j=1;
            while(j<9 && in.length()>i+j && lettre==in.charAt(i+j)) {
                j++;
            }
            RLE+=String.valueOf(j)+lettre;
        }
         return RLE;
    }
    
}

