@@ -6,7 +6,9 @@ public static void main(String[] args)
        Scanner s = new Scanner(System.in);
	System.out.print("Enter number:");        
	int n=s.nextInt();
        for(int i=1; i <= 10; i++)
    System.out.print("Enter till which to multiply: ");
    int m=s.nextInt();
        for(int i=1; i <=m; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
