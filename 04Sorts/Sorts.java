public class Sorts{

	public static String name(){
		 return "09.Vidali.Giorgio";
}


public static void selectionSort(int[] data){
    int temp;
	for(int i = 0; i < data.length - 1; i++){
		for(int c = 0; c < data.length - 1;c++){

            if(data[c] > data[c - 1]){
		        temp = data[c];
                    	data[c] = data[c - 1];
            	        data[c-1] = temp;
		}
}
}
}



public static void insertionSort(int[] data){
	for(int i = 1; i < data.length; i ++){
	 	for(int c = 0; c < data.length; c++){
			int x = 0;
			if(data[i] < data[c]){
				x = data[i];
				data[i] = data[c];
				data[c] = x; 
		}	
			
}
}
}

public static void bubbleSort(int[] data){
	boolean swap = true;
	while(swap){
		swap = false;
        for(int i = 1; i < data.length;i++){    
            int temp = 0;
            if(data[i-1] > data[i]){
                temp = data[i - 1];
                data[i - 1] = data[i];
                data[i] = temp;
				swap = true;
            }
        }
    }
}


public static void main(String [] argghhhhh){
	int[] tester = {7,4,5,8,2,3};
	bubbleSort(tester);
	System.out.println(tester[0]);
	System.out.println(tester[1]);
	System.out.println(tester[2]);
	System.out.println(tester[3]);
	System.out.println(tester[4]);
	System.out.println(tester[5]);
}

}
