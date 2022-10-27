#include<stdio.h>

int main()
{
	int a[10];
	int n,loc,i,j;

	printf("Enter how many numbers:");
	scanf("%d",&n);

	for(i=0;i<n;i++)
		scanf("%d",&a[i]);

	printf("The Array is :\n");
	for(i=0;i<n;i++)
                printf("%d\t",a[i]);

	printf("\nWrite on which location you want to delete number:"); 
	scanf("%d",&loc);

	
	j=loc;

	while(j<=n)
	{
		a[j-1]=a[j];
		j++;
	}

	n=n-1;

	printf("\nAfter deletion Array is :\n");
	for(i=0;i<n;i++)
                printf("%d\t",a[i]);
        
	printf("\n");      
	
	return 0;
}
