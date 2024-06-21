def RLE(chaine):
  #nombre de fois le caractere
  cpt = 1
  #chaine de sortie compressé
  chaine_rle = ""
  #compteur pour le parcours de la chaine
  i = 0

  #parcours de la chaine
  while i < len(chaine):

    #si on ne sort pas de la chaine et que le caractere est le meme que le suivant 
    if i+1 < len(chaine) and chaine[i] == chaine[i+1]:
      #si le compteur pour une lettre dépasse 9
      if(cpt >= 9):
        #on l'ajoute a la chaine de sortie
        chaine_rle += str(cpt) + chaine[i]
        #on remet le compteur a 0
        cpt = 0
      #on incrémente le compteur du caractere
      cpt += 1
      #on incrémente le compteur pour passer au caractere suivant
      i += 1
    #si on sort de la chaine ou que le caractere est different du suivant alors 
    else:
      #on l'ajoute a la chaine de sortie
      chaine_rle += str(cpt) + chaine[i]
      #on incrémente le compteur pour passer au caractere suivant 
      i+=1
      #on remet le compteur a 1 pour recommencer 
      cpt = 1

  return chaine_rle


