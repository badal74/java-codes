#include<stdio.h>
#include<stdlib.h>

void generate(int arr[50],int n);
void display(int arr[50],int n);
void quick_sort(int start,int end);

int arr[50];
int main()
{
	int n;

	printf("Enter how many numbers:");
	scanf("%d",&n);

	generate(arr,n);
	display(arr,n);

	printf("\nQuick sorted array is:\n");
	quick_sort(0,n-1);
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


void quick_sort(int start,int end)
{
	int pivot,i,j,temp;
	if(start<end)
	{
		pivot=start;
		i=start;
		j=end;
	
		while(i<j)
		{
			while( arr[i]<=arr[pivot]&& i<end)
				i++;
			while(arr[j]>arr[pivot])
				j--;
			if(i<j)
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			
			}
		}
		
		temp=arr[pivot];
		arr[pivot]=arr[j];
		arr[j]=temp;
		
		quick_sort(start,j-1);
		quick_sort(j+1,end);
	}		
}

	
