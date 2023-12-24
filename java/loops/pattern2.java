class pattern2{
	public static void main(String[] args){
		int i,j,n=6;
		
		for(i=0;i<n;i++){
			for(j=0;j<n+1;j++)
				if((i==0 && j%3!=0) || (i==1 && j%3==0) || (i-j==2) || (i+j==8))
				System.out.print("*");
				else
				System.out.print(" ");
		System.out.println();
		}
	}
}
