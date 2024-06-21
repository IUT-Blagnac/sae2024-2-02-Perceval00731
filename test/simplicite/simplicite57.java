package iut.sae.algo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe contenant des méthodes simples pour l'encodage et le décodage selon l'algorithme Run-Length Encoding (RLE).
 */
public class simplicite57 {

    /**
     * Méthode RLE pour compresser une chaîne selon l'algorithme Run-Length Encoding.
     * @param in Chaîne à compresser
     * @return Chaîne compressée en utilisant RLE
     */
    public static String RLE(String in) {
        if (in == null || in.isEmpty()) {
            return "";  // Retourne une chaîne vide si l'entrée est nulle ou vide
        }

        StringBuilder sb = new StringBuilder();
        char currentChar = in.charAt(0);
        int count = 1;

        // Parcourt la chaîne d'entrée à partir du deuxième caractère
        for (int i = 1; i < in.length(); i++) {
            if (in.charAt(i) == currentChar) {
                count++;  // Incrémente le compteur si le caractère est le même que le précédent
            } else {
                // Ajoute le nombre d'occurrences et le caractère au StringBuilder
                appendRLE(sb, count, currentChar);
                currentChar = in.charAt(i);  // Met à jour le caractère courant
                count = 1;  // Réinitialise le compteur pour le nouveau caractère
            }
        }

        // Ajoute le dernier groupe de caractères à la fin de la boucle
        appendRLE(sb, count, currentChar);

        return sb.toString();  // Retourne la chaîne compressée
    }

    
}
