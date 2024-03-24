public class Program_3_2 {
    public static void main(String[] args) {
        // Define the size of the 2D array
        int rows = 3;
        int cols = 3;
        
        // Create a 2D array filled with random integers
        int[][] array = generateRandomArray(rows, cols);
        
        // Print the original 2D array
        System.out.println("Original 2D array:");
        printArray(array);
        
        // Find the maximum and minimum elements of the 2D array
        int max = findMax(array);
        int min = findMin(array);
        
        // Define the size of the 1D array
        int size = rows * cols;
        
        // Create a 1D array filled with alternating maximum and minimum elements
        int[] resultArray = generateResultArray(size, max, min);
        
        // Print the 1D result array
        System.out.println("\nResult 1D array:");
        printArray(resultArray);
    }
    
    // Function to generate a 2D array filled with random integers
    public static int[][] generateRandomArray(int rows, int cols) {
        int[][] array = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = random.nextInt();
            }
        }
        return array;
    }
    
    // Function to print a 2D array
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
    // Function to find the maximum element in a 2D array
    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int[] row : array) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }
    
    // Function to find the minimum element in a 2D array
    public static int findMin(int[][] array) {
        int min = array[0][0];
        for (int[] row : array) {
            for (int num : row) {
                if (num < min) {
                    min = num;
                }
            }
        }
        return min;
    }
    
    // Function to generate a 1D array filled with alternating maximum and minimum elements
    public static int[] generateResultArray(int size, int max, int min) {
        int[] resultArray = new int[size];
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                resultArray[i] = max;
            } else {
                resultArray[i] = min;
            }
        }
        return resultArray;
    }
    
    // Function to print a 1D array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
