package answers;
import java.util.Arrays;

public class Question5 {

	public static int shareExchange(int[] allowedAllocations, int totalValue) {
		int []minways;
		minways = new int[totalValue];
		minways[0]=0;
		Arrays.sort(allowedAllocations);
		int n=allowedAllocations.length;
		for(int i=1;i<=totalValue;i++) minways[i]=1000000000;
		for(int j=n-1;j>=0;--j)
		for(int i=0;i<=totalValue;i++)
		{
		    if(minways[i]!=1000000000&&minways[i+allowedAllocations[j]]==1000000000) minways[i+allowedAllocations[j]]=minways[i]+1;
		 }
		return minways[totalValue];
}

}
