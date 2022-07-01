package classHomework;

public class trīsstūris {
    int malaA;
    int malaB;
    int malaC;
    double laukums;

    public void trīsstūrisInfo() {
        System.out.println("\nTiek veidots jauns trīsstūris!\n");
    }

    public void trīsstūraLaukums(int malaA, int malaB, int malaC) {
        this.malaA = malaA;
        this.malaB = malaB;
        this.malaC = malaC;

        double s = (malaA + malaB + malaC) / 2;
        laukums = Math.sqrt(s * (s - malaA) * (s - malaB) * (s - malaC));
        System.out.printf("Trīsstūra laukums ir %.3f\n", laukums);
    }

    public boolean irVienādmaluTrīsstūris() {
        boolean irVienādmalu;
        if (malaA == malaB && malaB == malaC) {
            System.out.println("Trīsstūris ir vienādmalu!");
            irVienādmalu = true;
        } else {
            System.out.println("Trīsstūris nav vienādmalu!");
            irVienādmalu = false;
        }
        return irVienādmalu;
    }

    public boolean irVienādsānuTrīsstūris() {
        boolean irVienādsānu;
        if (malaA == malaB || malaB == malaC || malaA == malaC) {
            System.out.println("Trīsstūris ir vienādsānu!");
            irVienādsānu = true;
        } else {
            System.out.println("Trīsstūris nav vienādsānu!");
            irVienādsānu = false;
        }
        return irVienādsānu;
    }
}
