public class Stats {
    public static void main(String[] args) {
        int[] data = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};

        // Calculate mean
        double sum = 0;
        for (int num : data) {
            sum += num;
        }
        double mean = sum / data.length;
        System.out.println("Mean: " + mean);

        // Calculate median
        int middle = data.length / 2;
        double median;
        if (data.length % 2 == 0) {
            median = (data[middle - 1] + data[middle]) / 2.0;
        } else {
            median = data[middle];
        }
        System.out.println("Median: " + median);

        // Calculate standard deviation
        double variance = 0;
        for (int num : data) {
            variance += Math.pow(num - mean, 2);
        }
        double standardDeviation = Math.sqrt(variance / data.length);
        System.out.println("Standard Deviation: " + standardDeviation);
    }
}
