package iut.sae.algo;

public class sobriete51{
    public static String RLE(String in) {
        if (in == null || in.isEmpty()) {
            return "";
        }

        StringBuilder encoded = new StringBuilder();
        int count = 1;

        for (int i = 0; i < in.length(); i++) {
            char currentChar = in.charAt(i);
            int j = i + 1;
            while (j < in.length() && in.charAt(j) == currentChar) {
                count++;
                j++;
            }
            encoded.append(count).append(currentChar);
            count = 1;
            i = j - 1;
        }

        return encoded.toString();
    }
    

    
}

