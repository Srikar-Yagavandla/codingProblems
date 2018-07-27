public static void subArrayWithGivenSum(int[] arr, int length, int targetSum){
		
		int current_sum = arr[0];
		int startIndex = 0;
		
		int i = 0;
		
		for(i = 1; i < arr.length; i++){
			while(current_sum > targetSum && startIndex < i - 1){
				current_sum = current_sum - arr[startIndex];
				startIndex++;
			}
			
			if(current_sum == targetSum){
				System.out.println(startIndex+"  "+(i - 1));
			}
			
			if(i < length){
				current_sum = current_sum + arr[i]; 
			}
		}
	}