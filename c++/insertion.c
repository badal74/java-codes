#include<stdio.h>

int main()
{
	int a[10];
	int n,index,i,j,num;

	printf("Enter how many numbers:");
	scanf("%d",&n);

	for(i=0;i<n;i++)
		scanf("%d",&a[i]);

	printf("The Array is :\n");
	for(i=0;i<n;i++)
                printf("%d\t",a[i]);

	printf("\nWrite on which index you want to add number:"); 
	scanf("%d",&index);

	printf("\nWrite the number you want to add :");
	scanf("%d",&num);
	
	j=n;
	n=n+1;

	while(j >= index)
	{
		a[j+1]=a[j];
		j--;
	}

	a[index]=num;

	printf("\nAfter insertion Array is :\n");
	for(i=0;i<n;i++)
                printf("%d\t",a[i]);
        
	printf("\n");      
	
	return 0;
}
