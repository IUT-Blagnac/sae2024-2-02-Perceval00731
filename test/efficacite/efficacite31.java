package iut.sae.algo;

public class efficacite31 {
    

    public static String RLE(String in){
       
        //On vérifie si la chaine en entrée est vide
        if (in == "" ){
            return "";
        }

        StringBuilder chaine = new StringBuilder();             //Initialisation d'un stringbuilder
        char caracCompare = in.charAt(0);                 //Premier caractère qui sera comparé
        int compteurDeCarac = 1;                                //Compteur du nombre de répétition d'un caractère


        //On commence à parcourir la chaine en partant du deuxieme caractère
        for (int i = 1; i < in.length(); i++) {

            //Si deux caractère consécutifs sont identiques alors on incrémente le compteur
            if (in.charAt(i) == caracCompare) {
                compteurDeCarac++;

                //Si le compteur dépasse 9, on ajoute "9" suivi du caractère dans la chaine
                if (compteurDeCarac == 10) {
                    chaine.append("9").append(caracCompare);
                    compteurDeCarac = 1;
                }
            } else {

                //Si le caractère suivant est différent alors on ajoute dans la chaine le compteur + le caractère
                chaine.append(compteurDeCarac).append(caracCompare);
                caracCompare = in.charAt(i);    //On met à jour le caractère comparé
                compteurDeCarac = 1;            //On reinitialise le compteur
            }
        }

    chaine.append(compteurDeCarac).append(caracCompare);

    return chaine.toString();
}

    
    
}



