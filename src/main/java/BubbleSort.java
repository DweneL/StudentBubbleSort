public class BubbleSort {
    //Create a function that is going to implement the bubble sort algorithm
    public void bubble  (int [] arr){
        //a function will take on an int array
        // we are sorting an integer array

        //Declare the first variable we want to use
        int n = arr.length;
        //used to find the lenght of an int array
        int temp = 0;
        int count = 1;

        for (int i = 0; i < n; i ++){//Iterate through the array
            // create a flag to check unnecessary swaps
            boolean swapped = false;

            //J starts at index one because the number is index one
            //for example, 1,2,3,4. 2 is at index 1
            for(int j = 1; j < n; j++){
                //needs to check if the previous element is greater than the current element
                //5,3,8,1,2,9.  Check if 5 is greater than 3?
                //If 3 is in position one then it means 5 is at position 1 minus one
                //which is 0, cause array starts from zero
                //if 3 is at Position J, which is index 1, 5 is at position J - 1
                if (arr[j -1] > arr[j]){//if the previous element is smaller, needs to be in the previous index
                    temp = arr[j-1];
                    //store the bigger value in temp
                    //5 is greater than 3 so lets hold 5 temporarily

                    arr[j-1] = arr[j];
                    //arr j -1 where the bigger value was, want to be taken by smaller value
                    //If big val 5, the smaller val 3, temp will hold 5
                    // then the position where 5 was line 30, will now be taken by 3
                    arr[j] = temp;
                    //Then, the position where 3 was, arr[j] will now be taken by temp
                    swapped = true;
                }
            }
        }

    }
}
