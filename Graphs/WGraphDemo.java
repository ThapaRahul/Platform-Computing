import java.util.Queue;

public class WGraphDemo {

	public static void main(String[] args) {
		
		WeightedGraph<String> graph = new WeightedGraph<String>();
		graph.addVertex("Philly");
		graph.addVertex("Denver");
		graph.addVertex("Chicago");
		graph.addVertex("San Francisco");
		
		graph.addEdge("Philly", "Denver", 2000);
		graph.addEdge("Denver", "Philly", 2000);
		graph.addEdge("Denver", "Chicago", 1000);
		graph.addEdge("Denver", "San Francisco", 1300);
		graph.addEdge("Chicago", "San Francisco", 1700);
		graph.addEdge("San Francisco", "Denver", 1300);
		
		//Where can I fly from Denver?
		
		Queue<String> denverFlights = graph.getToVertices("Denver");
		System.out.println(denverFlights);
		
		//How far is the flight from San Francisco to Denver
		System.out.println("Distance from SF to Denver: " + graph.weightIs("San Francisco", "Denver"));

	}

}
