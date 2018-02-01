/*
	Name: Ryan Wang
	Date: 01/30/18
	Project: TwoDimArrays_HW1
	
	The purpose of this project is to get some practice writing code to do
	basic tasks with two dimensional arrays.  
	
	Please do not alter the main() method or the printArray method.
	
	Please complete the following methods and turn your project in to the google
	classroom when complete.
		sumArray
		sumRow
		sumColumn
		rowIndexWithLargestNumber
		columnIndexWithLargestNumber
		sumAroundLargest

	*****************************************************************************************
	Expected Output - here is what I get when I implement the methods:
	
		***********************************
		numbers1: 
		   3   5   7   9  11  13  15
		   2   4   6   8 -10  12  14
		   1   1   2   3   5   7  12
		
		sumArray: 130
		sumRow 1: 36
		sumColumn 3: 20
		rowIndexWithLargestNumber: 0
		columnIndexWithLargestNumber: 6
		sumAroundLargest: 89
		
		***********************************
		numbers2: 
		   3   5   7   9  11  13  15
		   2   4 120   8  10  12  14
		   1   1   2   3   5   7  12
		
		sumArray: 264
		sumRow 2: 31
		sumColumn 5: 32
		rowIndexWithLargestNumber: 1
		columnIndexWithLargestNumber: 2
		sumAroundLargest: 179
		
		***********************************
		numbers3: 
		 3 5
		 2 9
		 1 1
		
		sumArray: 21
		sumRow 0: 8
		sumColumn 0: 6
		rowIndexWithLargestNumber: 1
		columnIndexWithLargestNumber: 1
		sumAroundLargest: 17
		
		***********************************
		numbers4: 
		 -3 -5
		 -2 -9
		 -1 -6
		
		sumArray: -26
		sumRow 1: -11
		sumColumn 1: -20
		rowIndexWithLargestNumber: 2
		columnIndexWithLargestNumber: 0
		sumAroundLargest: -12
 */
public class TwoDimArrays_HW1
{
	public static int sumArray(int[][] nums)
	{
		int sum = 0;
		for (int row = 0; row < nums.length; row++)
		{
			for (int col = 0; col < nums[row].length; col++)
			{
				sum += nums[row][col];
			}
		}
		return sum;
	}
	
	public static int sumRow(int[][] nums, int row)
	{
		int sum = 0;
		for (int col = 0; col < nums[row].length; col++)
		{
			sum += nums[row][col];
		}
		return sum;
	}
	
	public static int sumColumn(int[][] nums, int col)
	{
		int sum = 0;
		for (int row = 0; row < nums.length; row++)
		{
			sum += nums[row][col];
		}
		return sum;
	}
	
	public static int rowIndexWithLargestNumber(int[][] nums)
	{
        int largest = nums[0][0];   
        int value = 0;
        
        for (int row = 0; row < nums.length; row++)
		{
			for (int col = 0; col < nums[row].length; col++)
			{
				if(nums[row][col] > largest)
				{
		        	largest = nums[row][col];
		        	value = row;
				}	
			}
		}
		 return value;
	}
	
	public static int columnIndexWithLargestNumber(int[][] nums)
	{
		int largest = nums[0][0];   
        int value = 0;
        
        for (int row = 0; row < nums.length; row++)
		{
			for (int col = 0; col < nums[row].length; col++)
			{
				if(nums[row][col] > largest)
				{
		        	largest = nums[row][col];
		        	value = col;
				}	
			}
		}
		 return value;
	}

	public static int sumAroundLargest(int [][] nums)
	{
		int largest = nums[0][0];   
        int rowValue = 0;
        int colValue = 0;
        
        for (int row = 0; row < nums.length; row++)
		{
			for (int col = 0; col < nums[row].length; col++)
			{
				if(nums[row][col] > largest)
				{
		        	largest = nums[row][col];
		        	colValue = col;
		        	rowValue = row;
				}	
			}
		}
        
        int sum = 0;
        for (int col = 0; col < nums[rowValue].length; col++)
        {
        	sum += nums[rowValue][col];
        }
        
        for (int row = 0; row < nums.length; row ++)
        {
        	sum += nums[row][colValue];
        }
        sum -= largest;
		return sum;
	}
	
	/*********************************************
	 * DO NOT ALTER ANY CODE BELOW THIS LINE!!!!!*
	 *********************************************/
	
	public static void main(String[] args) 
	{
		int[][] numbers1 = {
							{ 3, 5, 7, 9,  11, 13, 15 },
							{ 2, 4, 6, 8, -10, 12, 14 }, 
							{ 1, 1, 2, 3,   5,  7, 12 }
						   };

		int[][] numbers2 = {
							{ 3, 5,   7, 9, 11, 13, 15 },
							{ 2, 4, 120, 8, 10, 12, 14 }, 
							{ 1, 1,   2, 3,  5,  7, 12 }
						   };
		
		int[][] numbers3 = {
							{ 3, 5 },
							{ 2, 9 }, 
							{ 1, 1 }
						   };

		int[][] numbers4 = {
							{ -3, -5 },
							{ -2, -9 }, 
							{ -1, -6 }
						   };

		// Test all methods on numbers1
		System.out.println("***********************************");
		System.out.println("numbers1: ");
		printArray(numbers1);
		System.out.println("sumArray: " + sumArray(numbers1));
		System.out.println("sumRow 1: " + sumRow(numbers1, 1));
		System.out.println("sumColumn 3: " + sumColumn(numbers1, 3));
		System.out.println("rowIndexWithLargestNumber: " + rowIndexWithLargestNumber(numbers1));
		System.out.println("columnIndexWithLargestNumber: " + columnIndexWithLargestNumber(numbers1));
		System.out.println("sumAroundLargest: " + sumAroundLargest(numbers1));
		System.out.println();
		
		// Test all methods on numbers2
		System.out.println("***********************************");
		System.out.println("numbers2: ");
		printArray(numbers2);
		System.out.println("sumArray: " + sumArray(numbers2));
		System.out.println("sumRow 2: " + sumRow(numbers2, 2));
		System.out.println("sumColumn 5: " + sumColumn(numbers2, 5));
		System.out.println("rowIndexWithLargestNumber: " + rowIndexWithLargestNumber(numbers2));
		System.out.println("columnIndexWithLargestNumber: " + columnIndexWithLargestNumber(numbers2));
		System.out.println("sumAroundLargest: " + sumAroundLargest(numbers2));
		System.out.println();

		// Test all methods on numbers3
		System.out.println("***********************************");
		System.out.println("numbers3: ");
		printArray(numbers3);
		System.out.println("sumArray: " + sumArray(numbers3));
		System.out.println("sumRow 0: " + sumRow(numbers3, 0));
		System.out.println("sumColumn 0: " + sumColumn(numbers3, 0));
		System.out.println("rowIndexWithLargestNumber: " + rowIndexWithLargestNumber(numbers3));
		System.out.println("columnIndexWithLargestNumber: " + columnIndexWithLargestNumber(numbers3));
		System.out.println("sumAroundLargest: " + sumAroundLargest(numbers3));
		System.out.println();
	
		// Test all methods on numbers4
		System.out.println("***********************************");
		System.out.println("numbers4: ");
		printArray(numbers4);
		System.out.println("sumArray: " + sumArray(numbers4));
		System.out.println("sumRow 1: " + sumRow(numbers4, 1));
		System.out.println("sumColumn 1: " + sumColumn(numbers4, 1));
		System.out.println("rowIndexWithLargestNumber: " + rowIndexWithLargestNumber(numbers4));
		System.out.println("columnIndexWithLargestNumber: " + columnIndexWithLargestNumber(numbers4));
		System.out.println("sumAroundLargest: " + sumAroundLargest(numbers4));
		System.out.println();
	}

	public static void printArray(int[][] grid)
	{
		int maxValue = Integer.MIN_VALUE;
		int minValue = Integer.MAX_VALUE;
		
		for (int row = 0; row < grid.length; row++)
		{
			for (int col = 0; col < grid[row].length; col++)
			{
				maxValue = Math.max(maxValue, grid[row][col]);
				minValue = Math.min(minValue, grid[row][col]);
			}
		}
		
		int digits = Math.max((2 + (int)Math.log10(Math.abs(maxValue)) + ((maxValue < 0 ? 1 : 0))),
							  (2 + (int)Math.log10(Math.abs(minValue)) + ((minValue < 0 ? 1 : 0))));
		
		for (int row = 0; row < grid.length; row++)
		{
			for (int col = 0; col < grid[row].length; col++)
			{
				System.out.print(String.format("%1$" + digits + "s", grid[row][col]));
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
