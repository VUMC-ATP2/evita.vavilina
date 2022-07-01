package classHomework;

public class main {
    public static void main(String[] args) {
        //---------------- 1. uzd -------------
        trīsstūris pirmaisTrīsstūris = new trīsstūris();
        pirmaisTrīsstūris.trīsstūrisInfo();
        pirmaisTrīsstūris.malaA = 2;
        pirmaisTrīsstūris.malaB = 2;
        pirmaisTrīsstūris.malaC = 2;
        pirmaisTrīsstūris.trīsstūraLaukums(pirmaisTrīsstūris.malaA, pirmaisTrīsstūris.malaB, pirmaisTrīsstūris.malaC);
        pirmaisTrīsstūris.irVienādsānuTrīsstūris();
        pirmaisTrīsstūris.irVienādmaluTrīsstūris();

        //---------------- 2. uzd --------------
        trīsstūris otraisTrīsstūris = new trīsstūris();
        otraisTrīsstūris.trīsstūrisInfo();
        otraisTrīsstūris.trīsstūraLaukums(5, 4, 6);
        otraisTrīsstūris.irVienādsānuTrīsstūris();
        otraisTrīsstūris.irVienādmaluTrīsstūris();
    }
}
