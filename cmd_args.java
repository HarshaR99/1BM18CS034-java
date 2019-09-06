class cmd_args
{
public static void main(String args[])
{
int l=args.length;
int arr[] = new int[l];
int big = arr[0],temp;
for(int i=0;i<l;i++)
{
arr[i]=Integer.parseInt(args[i]);
if(arr[i]>big)
{
big = arr[i];
}
}
System.out.println("The Lagrest number is:"+big);
}
}
