package iut.sae.algo;


public class efficacite26{
    public static String RLE(String in){
        // Provide your algo here
        if (in.isEmpty()) {
            return "";
        }
        StringBuilder chaineSortie = new StringBuilder();

        int nbCar = 1;
        int taille = in.length();
        for (int i=1; i<taille; i++) {
            if (in.charAt(i) == in.charAt(i-1)) {
                nbCar++;
                if (nbCar == 9) {
                    chaineSortie.append(nbCar);
                    chaineSortie.append(in.charAt(i-1));
                    nbCar = 0;
                }
            } else {
                chaineSortie.append(nbCar);
                chaineSortie.append(in.charAt(i-1));
                nbCar = 1;
            }
        }
        // Ajout du dernier groupe
        chaineSortie.append(nbCar);
        chaineSortie.append(in.charAt(taille-1));

        return chaineSortie.toString();
    }

    
}

