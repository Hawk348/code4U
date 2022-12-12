package base;

/**
 * Exemples de récursivité
 * 
 * @author physcrowley (2022-10)
 */
public class Recursion {

    /** Utilise les méthodes de la classe */
    public static void main(String[] args) {

        int[] nums = { -7, 0, 1, 2, 3, 20, 40 };

        System.out.println("Factoriel ");
        for (int n : nums) {
            long result = factorial(n);
            String err = "";
            if (result == -1)
                err = "erreur de nombre négatif";
            else if (result < 0)
                err = "erreur de résultat trop grand";
            System.out.printf("%6d -> %d %s\n", n, result, err);
        }
        System.out.println("\nOreils de lapin");
        // ne pas faire le cas négatif
        for (int i = 1; i < nums.length; i++) {
            int n = nums[i];
            System.out.printf(
                    "%6d lapins -> %d oreils\n", n, bunnyEars(n));
        }
        System.out.println("\nFibonacci");
        for (int n : nums) {
            int result = fibonacci(n);
            String err = result == -1 ? "erreur de nombre négatif" : "";
            System.out.printf(
                    "    n=%2d -> %d %s\n", n, result, err);
        }

    }

    /**
     * Implémentation récursive du factoriel d'un nombre positif
     * 
     * @param n un entier positif
     * @return -1 si {@code n} est négatif, sinon le factoriel de {@code n}
     */
    static long factorial(int n) {
        // cas de base (on a fini ici)
        // il y a deux possibilités afin de donner une réponse si n=0
        // mais autrement l'algorithme arrête quand n=1
        if (n == 1 || n == 0)
            return n;

        // cas d'erreur
        if (n < 0)
            return -1;

        // cas récursif (on continue avec l'appel récursif)
        return n * fibonacci(n - 1);
    }

    /**
     * Une implémentation possible du 2e problème sur CodingBat.com, soit
     * celui-ci : https://codingbat.com/prob/p183649
     * 
     * @param bunnies le nombre de lapins (un entier positif)
     * @return le nombre d'oreils sur ces lapins
     */
    static int bunnyEars(int bunnies) {
        // cas de base (plus de lapins)
        if (bunnies == 0)
            return 0;

        // cas récursif (ajoute 2 et répète avec 1 lapin de moins)
        return 2 + bunnyEars(bunnies - 1);
    }

    /**
     * Une implémentation possible du 3e problème sur CodingBat.com, soit
     * celui-ci : https://codingbat.com/prob/p120015
     * 
     * @param n le numéro du terme à calculer dans la séquence
     * @return -1 si n est négatif, autrement le n-ième nombre Fibonnaci
     */
    static int fibonacci(int n) {
        // deux cas de base parce qu'il faut ajouter
        // les deux premiers termes pour avoir le prochain
        if (n == 1 || n == 0)
            return n;

        // cas d'erreur
        if (n < 0)
            return -1;

        // cas récursif (la somme des deux valeurs précédentes)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
