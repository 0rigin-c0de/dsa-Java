import java.util.PriorityQueue;

public class ClosestStars {
    public static Star[] findClosestKStars(Star[] allStars, int k) {
        PriorityQueue<Star> minHeap = new PriorityQueue<>(k, (a, b) -> Double.compare(a.distanceFromEarth(), b.distanceFromEarth()));
        for (int i = 0; i < k; i++) {
            minHeap.offer(allStars[i]);
        }
        for (int i = k; i < allStars.length; i++) {
            Star current = allStars[i];
            if (current.distanceFromEarth() < minHeap.peek().distanceFromEarth()) {
                minHeap.poll();
                minHeap.offer(current);
            }
        }
        return minHeap.toArray(new Star[0]);
    }
}
