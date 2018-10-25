package answers; 

public class Question1 {
    /*public static void main(String []args)
    {
        int []v;
        v=new int[65536];
        for(int i=0;i<65536;i++) v[i]=i;
        System.out.println(bestMergedPortfolio(v));
    }*/
    public static int bestMergedPortfolio(int[] portfolios) {
        int []fiu0;
        int []fiu1;
    fiu0=new int [1600];
    fiu1= new int[1600];
    int firstempty=1;
    for(int i=0;i<1600;i++)
    {
        fiu1[i]=0;
        fiu0[i]=0;
    }
        int maxim=0;
        int n=portfolios.length;
        for(int i=0;i<n;i++)
        {
            int val=portfolios[i];
            int nod=0,ans=0;
            if(i>0)
            {
                for(int j=15;j>=0;--j)
                {
                    if(val>=(1<<j))
                    {
                        val-=(1<<j);
                        if(fiu0[nod]!=0)
                        {
                            ans+=(1<<j);
                            nod=fiu0[nod];
                        }
                        else nod=fiu1[nod];
                        
                    }
                    else
                    {
                        if(fiu1[nod]!=0)
                        {
                            ans+=(1<<j);
                            nod=fiu1[nod];
                        }
                        else nod=fiu0[nod];
                    }
            //        System.out.println(ans);
                }
                if(maxim<ans) maxim=ans;
            }
            nod=0; val=portfolios[i];
            for(int j=15;j>=0;--j)
            {
                if(val>=(1<<j))
                {
                    val-=(1<<j);
                    if(fiu1[nod]==0) fiu1[nod]=++firstempty;
                    nod=fiu1[nod];      
                }
                else
                {
                    if(fiu0[nod]==0) fiu0[nod]=++firstempty;
                    nod=fiu0[nod];
                }
            }
        }
    return maxim;
    }

}
