package sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sortingtechniques {
	
	
	static void merge(int [] arr,int l,int m ,int r) {
		 int left=m-l+1;
		 int right=r-m;
		 int  [] leftArray=new int [left];
		 int [] rightArray=new int [right];
		  for(int i=0;i<left;i++) {
			  leftArray[i]=arr[l+i];
		  } 
		  for(int j=0;j<right;j++) {
			  rightArray[j]=arr[m+1+j];
		  }
		  int i=0,j=0,k=l ;
		  while(i<left&&j<right) {
			  if(leftArray[i]<=rightArray[j]) {
				  System.out.println("left  b4 k position "+k+" k value"+arr[k]);
				  arr[k]=leftArray[i];
				  System.out.println("left   after k position "+k+" k value"+arr[k]);

				  i++;
			  }
			  else {
				 arr[k] = rightArray[j];

				 j++;
			  }
			  k++;
		  }
		  while(i<left) {
			  arr[k]=leftArray[i];
				  i++;
				  k++;
			  }
			  while(j<right) {


					 arr[k] = rightArray[j];
				 j++;
			  
			  k++;
		  }
			  
		  
	}
	
	public static  void mergeSort(int [] arr,int l,int r) {
		if(l<r)
		{
			int m=l+(r-l)/2;
					mergeSort(arr,l,m)	;
			mergeSort(arr,m+1,r);
			merge(arr,l,m,r); 
			
		}
	}
	 static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	 
	 static void quickSort(int[] arr, int low, int high)
	    {
	        if (low < high) {
	 
	            // pi is partitioning index, arr[p]
	            // is now at right place
	            int pi = partition(arr, low, high);
	 
	            // Separately sort elements before
	            // partition and after partition
	            quickSort(arr, low, pi - 1);
	            quickSort(arr, pi + 1, high);
	        }
	    }
	 static int  partition(int []arr,int low,int high) {
		 
		 int pivot=arr[high];
		 int i=low-1;
		 for(int j=low;j<high ;j++) {

			 if(arr[j]<pivot) {
				 i++; 
				 swap(arr,i,j);
			 }
		 }
	        swap(arr, i + 1, high); 
return i+1;
				 
	 }
	   static void swap(int[] arr, int i, int j)
	    {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	   static void Insertionsort(int arr[]) {
	    	int n=arr.length;

	    	for(int i=1;i<n;i++)
	    	{ int key=arr[i];
	    	int j=i-1;
	    	while(j>=0&&arr[j]>key){
	    		arr[j+1]=arr[j];
	    		j--;
	    	}     
	    	arr[j+1]=key;
	    	
	    		}
	    }

	   
	   
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		 
        System.out.println("Given array is");
        printArray(arr);
 
        mergeSort(arr, 0, arr.length - 1);
 
        System.out.println("\nSorted array is");
        printArray(arr);
        int[] arr1 = { 10, 7, 8, 9, 1, 5 };
        int N = arr.length;
 
        // Function call
        quickSort(arr1, 0, N - 1);
        System.out.println("Sorted array:");
        printArray(arr1);
        int arr3 [] = { 12, 11, 13, 5, 6 };
        
        Insertionsort(arr3);
        printArray(arr3);
        int arr4[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        System.out.println("unSorted array: 012");
        printArray(arr3);

        int arr_size = arr4.length;
        sort012(arr4, arr_size);
        System.out.println("Sorted array: 012");

        printArray(arr4, arr_size);
        int arr5[] = { 0, 1, 1,  0, 0, 0, };

        sortArray(arr5);
    	printArray(arr5);
    	Subject subjec1=new Subject(80, "math");
    	Subject subjec2=new Subject(78, "sci");
    	Subject subjec3=new Subject(67, "eng");
    	List<Subject> s1sub=new ArrayList<Subject>();
    	s1sub.add(subjec3);
    	s1sub.add(subjec2);
    	s1sub.add(subjec1);
Student s1=new Student("abc",s1sub);
Student s2=new Student("s2",s1sub);
Student s3=new Student("s3",s1sub);
List<Student> listStd=new ArrayList<Student>();
listStd.add(s1);listStd.add(s2);listStd.add(s3);
Map map = listStd.stream()
.collect(Collectors.groupingBy(
    Student::getName, // key function
    Collectors.mapping(
        s -> s.getSubjects().stream()
            .mapToInt(Subject::getMarks) // get marks from each subject
            .sum(), // sum the marks of all subjects
        Collectors.toList() // collect the sums into a list
    )
));
System.out.println(map);
 //listStd.
//listStd.stream().forEach(e->e.getSubjects().stream().map(s->Collectors.toMap(e.getName(),s.getMarks())));
//.flatMap(List::stream).forEach(System.out::println);
//listStd.stream().collect(Collectors.toMap(s->s.getName(), s->s.getSubject()., null, null)
    }

	private static void sort012(int[] arr, int arr_size) {
		// TODO Auto-generated method stub
		int low=0;
		int high=arr.length-1;
		int mid=0;
		while(mid<=high) {
			switch(arr[mid]){
			case 0:
				{int temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
				break;}
			case 1:
				{
				mid++;
				break;}
			case 2:{
				int temp=arr[high];
				arr[high]=arr[mid];
				arr[mid]=temp;
				high-- ;
				break;
			}
			}
		}
	}

	
	 static void printArray(int arr[], int arr_size)
	    {
	        int i;
	        for (i = 0; i < arr_size; i++)
	            System.out.print(arr[i] + " ");
	        System.out.println("");
	    }
	 void segregate0and1(int arr[], int n) {
	        int i=0;
	        int j=n-1;
	        while(j>=i){
	            
	            if(arr[i]==1 && arr[j]==0){
	              //   swap(arr[i],arr[j]);
	                i++;
	                j--;
	            }
	            
	          else  if(arr[i]==0){
	                i++;
	            }
	            else if(arr[j]==1){
	                j--;
	            }
	        }}
	 public static void sortArray(int[] arr) {
		    int i = 0;
		    int j = arr.length - 1;
		    while (i < j) {
	            System.out.println(arr[j] + " j  i  "+arr[j]);
	            System.out.println("j --   "+j);
		        while (arr[i] == 0 && i < j) {

		            i++;
		        }
		        while (arr[j] == 1 && i < j) { 

		            j--;
		        }
	            System.out.println("i "+i+"  j --   "+j);

		        if (i < j) {

		            arr[i++] = 0;
		            arr[j--] = 1;
		        }
		    }
		}
	 
	 int binarySearch(int arr[], int x)
	    {
	        int l = 0, r = arr.length - 1;
	        while (l <= r) {
	            int m = l + (r - l) / 2;
	 
	            // Check if x is present at mid
	            if (arr[m] == x)
	                return m;
	 
	            // If x greater, ignore left half
	            if (arr[m] < x)
	                l = m + 1;
	 
	            // If x is smaller, ignore right half
	            else
	                r = m - 1;
	        }
	 
	        // If we reach here, then element was
	        // not present
	        return -1;
	    }
	 
	 

}
