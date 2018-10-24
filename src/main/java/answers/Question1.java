package answers;


public class Question1 {

	public static int bestMergedPortfolio(int[] portfolios) {
		int maxim=0;
        int n=portfolios.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int ans=0,t1=portfolios[i],t2=portfolios[j],p2=1;
                while((t1!=0)||(t2!=0))
                {
                    if((t1%2+t2%2)==1) ans+=p2;
                    p2*=2;
                    t1/=2;
                    t2/=2;
                }
                if(maxim<ans) maxim=ans;
            }
        }
		return maxim;
	}

}
