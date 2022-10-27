#include<stdio.h>
#include<stdlib.h>

void generate(int arr[50],int n);
void display(int arr[50],int n);
void insertion_sort(int arr[50],int n);

int main()
{
	int arr[50],n;

	printf("Enter how many numbers:");
	scanf("%d",&n);

	generate(arr,n);
	display(arr,n);

	printf("\ninserstion sorted array is:\n");
	insertion_sort(arr,n);
	display(arr,n);
	printf("\n");
	return 0;
}

void generate(int arr[50],int n)
{
	int i;
	for(i=0;i<n;i++)
	{
		arr[i]=rand()%100;
	}
}

void display(int arr[50],int n)
{
	int i;
	for(i=0;i<n;i++)
		printf("%d\t",arr[i]);
}

void insertion_sort(int arr[50],int n)
{
	int i,j,temp;
	for(i=1;i<=n-1;i++)
	{
		temp=arr[i];
		j=i-1;
		while(j>=0 && arr[j]>temp)
		{
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=temp;
	}
}
	
