public static int kadanesAlgo(int[] arr){
		
		int[] dp = new int[arr.length];
		Arrays.fill(dp, Integer.MIN_VALUE);
		dp[arr.length - 1] = arr[arr.length - 1];
		
		int max = Integer.MIN_VALUE;
		
		for(int i = arr.length -2; i >= 0; i--){
			if(dp[i + 1] + arr[i] >= arr[i]){
				dp[i] = dp[i + 1] + arr[i];
			}
			else{
				dp[i] = arr[i];
			}
			
			max = Math.max(max, dp[i]);
		}
		
		return max;
		
	}