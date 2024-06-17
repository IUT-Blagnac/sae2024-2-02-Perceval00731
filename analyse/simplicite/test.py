import simplicite32 as simplicite

def test_simplicite():
    # Test de la fonction RLE
    print(simplicite.RLE("AAAABBBCCD"))
    # Test de la fonction unRLE
    print(simplicite.unRLE("4A3B2C1D"))
    # Test de la fonction RLE_recursif
    print(simplicite.RLE_recursif("AAAABBBCCD", 2))
    # Test de la fonction unRLE_recursif
    print(simplicite.unRLE_recursif("4A3B2C1D", 2))

if __name__ == "__main__":
    test_simplicite()