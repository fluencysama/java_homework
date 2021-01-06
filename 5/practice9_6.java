public class practice9_6 {
	/** Main method */
	public static void main(String[] args) {
		// Create a StopWatch object
		StopWatch stopWatch = new StopWatch();      //StopWatch is below

		// create array of 100,000 random numbers
		int[] randomArray = getArray();

		// Invoke the start method in StopWatch class
		stopWatch.start();

		// Sort array
		selectionSort(randomArray);

		// Invoke the stop method in StopWatch class
		stopWatch.stop();

		// Display the execution time
		System.out.println("The execution time of sorting 100,000 " +
			"numbers using selection sort: " + stopWatch.getElapsedTime() +
			" milliseconds");
	}

	/** getArray creates and returns an array of 100,000 random numbers */
	public static int[] getArray() {
		// Create an array of length 100,000
		int[] array = new int[100000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100000);
		}
		return array;
	}

	/** selectionSort performs a selection sort on an array */
	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = array[i];
			int minIndex = i;

			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					minIndex = j;
				}
			}

			if (i != minIndex) {
				array[minIndex] = array[i];
				array[i] = min;
			}
		}
	} 
}



public class StopWatch {
	private long startTime; // Start time
	private long endTime;	// End time

	// no-arg constructor that initializes 
	// startTime with the current time
	StopWatch() {
		startTime = System.currentTimeMillis();
	}

	// Resets the startTime to the current time
	public void start() {
		startTime = System.currentTimeMillis();
	} 

	// Sets the endTime to the current time
	public void stop() {
		endTime = System.currentTimeMillis();
	}

	// Returns the elapsed time for 
	// the stopwatch in milliseconds
	public long getElapsedTime() {
		return getEndTime() - getStratTime();
	}

	// Return start time
	public long getStratTime() {
		return startTime;
	}

	// Return end time
	public long getEndTime() {
		return endTime;
	}
}
