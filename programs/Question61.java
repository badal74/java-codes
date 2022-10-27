class Question61{  
    public static void binarySearch(int arr[], int first, int last, int key){  // function to find the key element from the array
      int mid = (first + last)/2;  // mid index of the array
      while( first <= last ){  
         if ( arr[mid] < key ){  
           first = mid + 1;     // searching right part of the array
         }else if ( arr[mid] == key ){  
           System.out.println("Element is found at index: " + mid);  // element found on the mid index
           break;  
         }else{  
            last = mid - 1;  // searching the left part of the array
         }  
         mid = (first + last)/2;  
      }  
      if ( first > last ){  
         System.out.println("Element is not found!");  
      }  
    }  
    public static void main(String args[]){  
           int arr[] = {10,20,30,40,50};  // array from which the target element is being searched
           int key = 30;   // target element to be searched
           int last=arr.length-1;  // end index of the array
           binarySearch(arr,0,last,key);     
    }  
   }  
