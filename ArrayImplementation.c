#include<stdio.h>
#include<stdlib.h>
#define MAX_SIZE 50
int arr[MAX_SIZE];
int size = 0;


void display(){
    int i;
    for(i=0;i<size;i++)
        printf("%d\t",arr[i]);

}

void insertAtPos(int pos,int val){
    int i;

    for(i=size-1;i>=pos;i--){
        arr[i+1]=arr[i];
    }

    arr[pos]= val;
    size++;
    printf("Inserted %d at pos %d",val,pos);
}

void deleteFromBeginning(){
    int i;
    int del=arr[0];
    for(i=0;i<size;i++){
      arr[i]=arr[i+1];
    }
    size--;
    printf("Deleted %d from the beginning ",del);
}

void deleteFromPos(int pos){
    int i;
    int del = arr[pos];
    for(i=pos;i<size;i++){
        arr[i] = arr[i+1];
    }
    size--;
    printf("Deleted %d at pos %d",del,pos);
}

void deleteEnd(){
    int del=arr[size];
    size--;
    printf("Deleted %d from the end ",del);
}

int searchElement(int val){
    int i,found=1;
    for(i=0;i<size;i++){
        if(val==arr[i]){
            printf("Element found at %d ",i);
            found=0;
        }
    }
    return found;
}

int main(){
    int choice,val,pos;
    while(1){
        printf("\n -------- List Menu -----------\n");
        printf("1.Insert at end \n");
        printf("2.Insert at specified pos \n");
        printf("3.Delete at specified pos \n");
        printf("4.Display\n");
        printf("5.Read data from particular position \n");
        printf("6.Update a value at specified position \n");
        printf("7.Length of the array \n");
        printf("8.Search a data  \n");
        printf("9.Insert at beginning \n");
        printf("10.Delete at end \n");
        printf("11.Delete from beginning \n");
        printf("12.Exit\n");
        printf("\n--------------------------------------\n");
        printf("Enter your choice:\t");
        scanf("%d",&choice);
        switch(choice){
        case 1: if(size == MAX_SIZE){
                    printf("Array is full");
                    break;
                }
                printf("Enter the data: ");
                scanf("%d",&val);
                arr[size++] = val;
                break;

        case 2: if(size == MAX_SIZE){
                    printf("Array is full");
                    break;
                }
                printf("Enter the pos *pos starts at 0*:  ");
                scanf("%d",&pos);
                if(pos<0 || pos>=size)
                {
                    printf("Invalid position");
                    break;
                }
                printf("Enter the data: ");
                scanf("%d",&val);
                insertAtPos(pos,val);
                break;

        case 3: if(size==0){
                    printf("Array is empty");
                    break;
                }
                printf("Enter the pos: ");
                scanf("%d",&pos);
                if(pos<0 || pos>=size)
                    printf("Invalid position");
                else
                    deleteFromPos(pos);
                break;

        case 4: display();
                break;

        case 5: printf("Enter a position to view its value : ");
                scanf("%d",&pos);
                if(pos<0 || pos >size){
                        printf("Invalid operation");
                        break;
                }
                printf("Value at position %d is %d",pos,arr[pos]);
                break;
        case 6: printf("Enter a position to update : ");
                scanf("%d",&pos);
                if(pos<0 || pos>size){
                    printf("Invalid operation");
                    break;
                }
                printf("Enter the data : ");
                scanf("%d",&val);
                arr[pos]=val;
                break;
        case 7: if(size==0){
                    printf("Array is empty");
                    break;
                }
                printf("Length of the list : ",size);
                break;

        case 8: printf("Enter a data to search : ");
                scanf("%d",&val);
                if(size==0){
                    printf("Invalid operation : Array is empty");
                    break;
                }
                int search=searchElement(val);
                if(search==1){
                    printf("Element not found ");
                    break;
                }
                break;

        case 9: printf("Enter a data to insert at beginning : ");
                scanf("%d",&val);
                if(size== MAX_SIZE){
                    printf("Array is full");
                    break;
                }
                pos=0;
                insertAtPos(pos,val);
                break;

        case 10: if(size==0){
                    printf("Array is empty");
                    break;
                }
                deleteEnd();
                break;

        case 11: if(size==0){
                    printf("Array is empty ");
                    break;
                }
                deleteFromBeginning();
                break;

        case 12 : exit(0);

        default: printf("Wrong choice");
                 break;
        //read,update,search,length,deleteAtEnd,deleteFromBeginning,insertAtBeginning

        }
    }
    return 0;
}
