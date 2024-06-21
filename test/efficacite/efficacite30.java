package iut.sae.algo;


public class efficacite30{
    public static String RLE(String chaine){
        // Utilisation d'un StringBuilder (pour améliorer le temps d'execution) car l'object String ne concatène pas simplement plusieurs chaine.
        // Initialisation d'un compteur et d'un indice
        StringBuilder dBuilder = new StringBuilder();
        int cptChar = 1;
        char charC;
        int i = 0;

        while(i < chaine.length()){
            charC = chaine.charAt(i);

            while (i+1 < chaine.length() && charC == chaine.charAt(i+1)){
                cptChar++;
                i++;
                if (cptChar == 9) {
                    dBuilder.append(9).append(charC);
                    cptChar = 0;
                }
                
            } 
            if (cptChar > 0) {
                dBuilder.append(cptChar).append(charC);
            }
            cptChar = 1;
            i++;
        }
        // On retourne la méthode toString() du builder qui renvoie la chaîne compressée
        return dBuilder.toString();
    }

    
}

