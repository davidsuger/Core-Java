package CollectionsFramework_13_Complex_Data_Structures;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class App {

	public static String[] vehicles = { "ambulance", "helicopter", "lifeboat" };

	public static String[][] drivers = { { "Fred", "Sue", "Pete" }, { "Sue", "Richard", "Bob", "Fred" },
			{ "Pete", "Mary", "Bob" } };

	public static void main(String[] args) {
		Map<String, Set<String>> personnel = new HashMap<>();

		for (int i = 0; i < vehicles.length; i++) {
			Set<String> set = new LinkedHashSet<String>();
			for (int j = 0; j < drivers[i].length; j++) {
				set.add(drivers[i][j]);
			}
			personnel.put(vehicles[i], set);
		}

		// Iterator through while thing
		for (Entry<String, Set<String>> entry : personnel.entrySet()) {
			System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

		Set<String> driversList = personnel.get("helicopter");
		for (String driver : driversList) {
			System.out.println(driver);
		}
	}
}
