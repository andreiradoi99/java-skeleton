package answers;

public class Question1{
public static int bestMergedPortfolio(int[] portfolios) {
        int maxim=0;
        int n=portfolios.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int ans=(int)(portfolios[i]^portfolios[j]);
                if(maxim<ans) maxim=ans;
            }
        }
        return maxim;
    }
}
