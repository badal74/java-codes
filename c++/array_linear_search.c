#include<stdio.h>
#include<stdlib.h>
#include<time.h>

void generate(int *a , int n);
void linear_search(int a[50],int n,int x);

int main()
{
	int a[50],n,i,x;

	printf("Enter how many numbers:");
	scanf("%d",&n);
	
	generate(a,n);
	printf("My Random Array is:\n");
	for(i=0;i<n;i++)
		printf("%d\t",a[i]);

	printf("\nEnter a number :");
	scanf("%d",&x);
	linear_search(a,n,x);
}

void generate(int *a,int n)
{
	int i;
	//if(n>0)
	//{
	//	srand(time(NULL));
		for(i=0;i<n;i++)
			a[i]=rand()%100;
        //}
}

void linear_search(int a[50],int n,int x)
{
	int i,flag =-1;
	for(i=0;i<n;i++)
	{
		if(x == a[i])
		{
			printf("\n%d found at location %d\n",x,i+1);
			flag++;
			break;
		}
	}
	
	if (flag == -1)
		printf("\nNumber not found\n");
	else
		printf("\nNumber of iterations required for %d is %d\n ",x,i+1);

}


