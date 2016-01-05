public class Sorts{
    public static void printArray(int[]data){
	String ans = "";
	for(int i = 0 ; i < data.length; i ++){
	    ans += data[i] + ", ";
	}
	System.out.println("[" + ans + "]");
       
    }
    public static void insertionSort(int[]data){
	for(int a = 0; a < data.length; a ++){
	    for(int i = 0; i < data.length - 1; i ++){
		int current = i;
		int nextindex = i + 1;
		int position = 0;
		if(data[current] >= data[nextindex] ){
		    int hold = data[current];
		    data[current] = data[nextindex];
		    data[nextindex] = hold;
		}
	    }
	}
    }
    public int min(int[]data){
	int small = data[0];
	for(int i = 0; i < data.length; i ++){
	    if(data[i] <= small){
		small = data[i];
	    }
	}
	return small;
    }
    public static void selectionSort(int[]data){
	int current =0;
	int index = 0;
	int small = data[0];
	int save = 0;
	for( int i =0;i < data.length - 1; i ++){
	    index = i;
	    current = data[index];
	    for(int j = i + 1; j < data.length; j ++){
		if(data[j] < current){
		    index = j;
		    current = data[index];
		}
	    }
	    save = data[index];
	    data[index] = data[i];
	    data[i] = save;
	}
    }
    

    public static void main(String[]args){
	int[] a1 = { 0, 1, 2, 3, 4, 5, 9};
	//	printArray(a1);
	selectionSort(a1);
	printArray(a1);
	int[] a2 = { 10, 1, 22, 32, 5, 100, 8};
	selectionSort(a2);
	//	printArray(a2);
		printArray(a2);
	int[] a3 = { 14, 13, 12, 11, 10, 9, 8};
	//	printArray(a3);
	selectionSort(a3);
		printArray(a3);
	int[] a4 = { 12, 16, 3, 13, 13, 100, 25};
	//	printArray(a4);
	selectionSort(a4);
		printArray(a4);
    }
	
	
	
}
	    
		    
	    

	


		

