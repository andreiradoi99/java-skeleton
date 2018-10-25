package answers;


public class Question6 {

	public static int shortestServerRoute(int numServers, int targetServer, int[][] times) {
		int n=numServers,s=0;
		int []ans=new int [n];
        for(int i=1;i<n;i++)
        {
            int dijk_node=0,minim=-1;
            for(int j=0;j<n;j++)
            {
                if(s==j) continue;
                if(times[s][j]==-1) continue;
                if(minim==-1)
                {
                    minim=times[s][j];
                    dijk_node=j;
                }
                else if(minim>times[s][j])
                {
                    minim=times[s][j];
                    dijk_node=j;
                }
            }
            ans[dijk_node]=minim;
            System.out.println(dijk_node+" "+ minim);
            times[s][dijk_node]=-1;
            for(int j=0;j<n;j++)
            {
                if(s==j) continue;
                if(times[s][j]==-1) continue;
                if(times[s][j]>minim+times[dijk_node][j]) times[s][j]=minim+times[dijk_node][j];
            }
        }
		return ans[targetServer];
	}

}
