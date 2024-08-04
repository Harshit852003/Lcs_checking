//package com.Technicalproject.views;

public class LCS2 
{
	//private LCS2() {};
	public  String lcs(String str1,String str2)
	{


		int m=str1.length();
		
		int n=str2.length();
		
		int lcs[][]=new int[m+1][n+1];
		

		
		for(int i=1;i<=m;i++)
		{
			lcs[i][0]=0;
			
			
		}
		for(int j=1;j<=n;j++)
		{
			lcs[0][j]=0;
			
			
		}
		 int i=1,j=1;
		
		for(i=1;i<=m;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(str1.charAt(i-1)==str2.charAt(j-1))
				{
					lcs[i][j]=1+lcs[i-1][j-1];
					
					//tracetable[i][j]=diagonalarrow;
				}
				else
				{
					lcs[i][j]=Math.max(lcs[i-1][j],lcs[i][j-1]);
				}
			}
		}
		
		StringBuilder result= printresult(m,n,lcs,new StringBuilder(),str1);
		return result.toString();

		
		

	}
public  StringBuilder printresult(int i, int j,int [][] lcs,StringBuilder sb,String str1) {
		
		
		if(i==0 || j==0)
		{
			return sb;
		}
		if(lcs[i-1][j]==lcs[i][j-1]  && lcs[i][j]==lcs[i-1][j-1]+1)
		{
			sb.insert(0, str1.charAt(i-1));
			return printresult(i-1,j-1,lcs,sb,str1);
		}
		if(lcs[i][j-1]>lcs[i-1][j])
		{
			return printresult(i,j-1,lcs,sb,str1);
		}
		else
		{
			return printresult(i-1,j,lcs,sb,str1);
		}

		
		
		
		
		
	}
	 


}