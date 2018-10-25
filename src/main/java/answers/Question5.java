package answers;

public class Question5 {

	public static int shareExchange(int[] allowedAllocations, int totalValue) {
		int []minways;
		minways = new int[1000004];
		minways[0]=0;
		for(int i=1;i<=totalValue;i++) minways[i]=1000000000;
		for(int i=0;i<=totalValue;i++)
		{
		    if(minways[i]==1000000000) continue;
		    for(int j=0;j<allowedAllocations.length;j++)
		    {
		        if(minways[i+allowedAllocations[j]]>minways[i]+1) minways[i+allowedAllocations[j]]=minways[i]+1;
		     }
		 }
		 
		return minways[totalValue];
}

}
