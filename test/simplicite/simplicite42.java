package iut.sae.algo;

public class simplicite42 {
    public static String RLE(String in) {
        // Cas chaîne vide
        if (in.length() == 0)
            return "";

        char precedent = in.charAt(0);
        String ResultatCompresser = "";
        int iteration = 1;

        for (int i = 1; i < in.length(); i++) {
            // Cas caractère identique et nb iterations cohérent
            if (in.charAt(i) == precedent && iteration < 9) {
                iteration += 1;
                // Cas caractère différent ou nb itérations max atteint
            } else {
                ResultatCompresser += "" + iteration + precedent;
                iteration = 1;
            }
            // Prépare le caractère précédent pour comparaison
            precedent = in.charAt(i);
        }

        ResultatCompresser += "" + iteration + precedent;
        return ResultatCompresser.toString();
    }

    
}
