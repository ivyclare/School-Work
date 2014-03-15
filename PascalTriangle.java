/*
 * Applying Pascal's Triangle
 * 
 */
package permutation;


/**
 *
 * @author Ivoline Ngong
 */
public class Permutation {
    private static int[] perm;

    public static void main(String[] args){
    int[] perm = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
 
int count = 1;
int numPerm = 1000000;
 
while(count<=numPerm) {
int N = perm.length;
int i = N-1;
while (perm[i - 1] >= perm[i]) {
        i = i - 1;
    }
 
    int j = N;
    while (perm[j - 1] <= perm[i - 1]) {
        j = j - 1;
    }
 
    // swap values at position i-1 and j-1
    swap(i - 1, j - 1);
 
    i++;
    j = N;
    while (i < j) {
        swap(i - 1, j - 1);
        i++;
        j--;
    }
    count++;
}
 


String permNum = "";
for (int k=0; k< perm.length; k++) {
    permNum = permNum + perm[k];
}
   public static void swap(int i, int j) {
    int k = perm[i];
    perm[i] = perm[j];
    perm[j] = k;
}
}

  }

