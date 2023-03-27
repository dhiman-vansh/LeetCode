
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // int i = 0;
        int temp = n;
        boolean flag = true;
        if(n%2!=0) n+=1;
        while (n / 2 != 0) {
            System.out.println(" in good version " + n/2);
            if (isBadVersion(n / 2)) {
                n = n / 2 + n / 4;
            } else {
                n = n / 2 - n / 4;

            }
        }

        return temp;
    }
}
