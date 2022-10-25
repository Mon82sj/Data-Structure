#include<stdio.h>
#include<stdlib.h>
#define MAX 10
int arr[MAX];
int i;
int n;
void insert(int num)
{
    if(n<MAX)
    {
        arr[n]=num;
        n++;
    }
    else
        printf("\nArray is full");
}
void makeheap()
    {
    for(i=1;i<n;i++)
    {
        int val=arr[i];
        int j=i;
        int f=(j-1)/2;
        while(j>0 &&arr[f]<val) //creating a MAX heap
        {
            arr[j]=arr[f];
            j=f;
            f=(j-1)/2;
        }
        arr[j]=val;
    }
}
void display()
{
    printf("\n");
    for(i=0;i<n;i++)
    printf("\t%d",arr[i]);
}
int main()
{
    insert(14);
    insert(12);
    insert(9);
    insert(8);
    insert(7);
    insert(10);
    insert(18);
    printf("\nThe elements are...");
    display();
    makeheap();
    printf("\nHeapified");
    display();
    return 0;
}
