package answers;







public class Question4
{
    public static int selectionFailedTradedesks(String[][] rows, int numberMachines)
    {
        int n=rows.length;
        int minim=-1;
        for(int i=0; i<n; i++)
        {
            int m=rows[i].length;
            int t=numberMachines,sum=0;
            for(int j=0; j<m; j++)
            {
                if("X"==rows[i][j])
                {
                    t=numberMachines;
                    sum=0;
                }
                else
                {
                    sum+=Integer.parseInt(rows[i][j]);
                    --t;
                    if(t==0)
                    {
                        if(minim==-1) minim=sum;
                        else if(minim>sum) minim=sum;
                        sum-=Integer.parseInt(rows[i][j-numberMachines+1]);
                        t=1;
                    }
                }
            }
        }
        if(minim==-1) minim=0;
        return minim;
    }

}


