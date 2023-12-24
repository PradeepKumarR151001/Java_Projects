class pattern{
	public static void main(String[] args){
		
		int i,j,k,l,m,n=5;
		
		System.out.println("This is a pyramid : ");
		
		for(i=0;i<n;i++){
			for(j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		System.out.println();
		System.out.println("This is a Triangle :");
		
		for(k=0;k<n;k++){
			for(l=n-k;l>0;l--)
				System.out.print(" ");
			for(m=0;m<=k;m++)
				System.out.print("* ");
			System.out.println();
		}
	}
}