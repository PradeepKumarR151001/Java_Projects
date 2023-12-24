class alphabets{
public static void main(String[] args){
	char ch;
	int i;
	for(ch='a';ch<='z';ch++)
		System.out.print(ch+" ");
	System.out.println();
	System.out.println("Alphabets from (A-Z) using ASCII values");
        for (i = 65; i <= 90; i++)
            System.out.print((char)i + " ");
        System.out.println("\nAlphabets from (a-z) are:");
        for (i = 97; i <= 122; i++)
            System.out.print((char)i + " ");
}}
