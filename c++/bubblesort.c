#include<stdio.h>
#include<stdlib.h>

int generate(int arr[50],int n);
int display(int arr[50],int n);
int bubble_sort(int arr[50],int n);

int main()
{
	int arr[50],n;

	printf("Enter how many numbers:");
	scanf("%d",&n);

	generate(arr,n);
	display(arr,n);

	printf("\nBubble Sorted array is:\n");
	bubble_sort(arr,n);
	printf("\n");

	return 0;
}

int generate(int arr[50],int n)
{
	int i;
	for(i=0;i<n;i++)
	{
		arr[i]=rand()%100;
	}
}

int display(int arr[50],int n)
{
	int i;
	for(i=0;i<n;i++)
		printf("%d\t",arr[i]);
}

int bubble_sort(int arr[50],int n)
{
	int i,temp,j;
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(arr[i]>arr[j])
			{	
			 	temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	display(arr,n);
}
