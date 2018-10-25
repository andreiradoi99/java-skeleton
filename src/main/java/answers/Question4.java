package answers;



public class Question4 {
    public static int getnum(String s)
    {
        int nr=Integer.parseInt(s);
        return nr;
    }
	public static int selectionFailedTradedesks(String[][] rows, int numberMachines) {
		int n=rows.length;
		int minim=0;
		for(int i=0;i<n;i++)
		{
		    int m=rows[i].length;
		    int t=numberMachines,sum=0;
		    for(int j=0;j<m;j++)
		    {
		        if("X"==rows[i][j])
		        {
		            t=numberMachines;
		            continue;
		        }
		        sum+=getnum(rows[i][j]);
		        --t;
		        if(t==0)
		        {
		            if(minim==0) minim=sum;
		            else if(minim>sum) minim=sum;
		            sum-=getnum(rows[i][j-numberMachines+1]);
		            t=1;
		         }
		    }
		  }
		return minim;
	}

}

