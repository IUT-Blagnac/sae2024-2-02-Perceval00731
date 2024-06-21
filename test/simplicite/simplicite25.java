package iut.sae.algo;


public class simplicite25 {
    public static String RLE(String in){
        
        // Cas chaîne vide
        if(in == null || in.isEmpty()) {
            return "";
        }

        int cpt = 0; // Compteur de caractères
        char dernierChar = in.charAt(0); // Dernier caractère
        StringBuilder resultat = new StringBuilder(); // Résultat

        for(int i = 0; i < in.length(); i++) { // Parcours de la chaîne
            if(in.charAt(i) == dernierChar) { // Si le caractère i est le même que le dernier
                if (cpt >= 9) { // Si le compteur est supérieur ou égal à 9
                    resultat.append(cpt).append(dernierChar); // On ajoute 9 et le dernier caractère au résultat
                    cpt = 0; // On réinitialise le compteur
                }
                cpt++; // On incrémente le compteur 
            } else { // Sinon
                resultat.append(cpt).append(dernierChar); // On ajoute le compteur et le dernier caractère au résultat
                dernierChar = in.charAt(i); // On met à jour le dernier caractère
                cpt = 1; // On réinitialise le compteur
            }
        }

        resultat.append(cpt).append(dernierChar); // On ajoute le dernier compteur et le dernier caractère au résultat
        
        return resultat.toString(); // On retourne le résultat
    }

    
}

