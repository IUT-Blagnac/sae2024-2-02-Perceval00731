public class sobriete12 {
    public static String RLE(String chaine) {
        if (chaine.length() == 0) {
            return "";
        }


        char premierCaractere = chaine.charAt(0);
        String resultat = "";
        int cpt = 1;

        for (int i = 1; i < chaine.length(); i++) {
            if (chaine.charAt(i) == premierCaractere) {
                cpt++;
                if (cpt == 9) {
                    resultat += cpt + String.valueOf(premierCaractere);
                    cpt = 0;
                }
            } else {
                if (cpt > 0) {
                    resultat += cpt + String.valueOf(premierCaractere);
                }
                premierCaractere = chaine.charAt(i);
                cpt = 1;
            }
        }

        if (cpt > 0) {
            resultat += cpt + String.valueOf(premierCaractere);
        }
        return resultat;
    }

    
}
