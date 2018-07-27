public static void subArrayWithGivenSum(int[] arr, int length, int targetSum){
		
		int min_length = Integer.MAX_VALUE;
		
		int current_sum = arr[0];
		int startIndex = 0;
		
		int i = 0;
		
		for(i = 1; i < arr.length; i++){
			
			while(current_sum > targetSum && startIndex < i - 1){
				current_sum = current_sum - arr[startIndex];
				startIndex++;
			}

			if(current_sum == targetSum){
				min_length = Math.min(min_length, i - 1 - startIndex);
			}
			
			if(i < length){
				current_sum = current_sum + arr[i]; 
			}
		}
		
		while(current_sum > targetSum && startIndex < i - 1){
			current_sum = current_sum - arr[startIndex];
			startIndex++;
		}
		
		if(current_sum == targetSum){
			min_length = Math.min(min_length, i - 1 - startIndex);
		}
		
		System.out.println(min_length);
	}