import java.util.*;

enum Actions {
	Register1, Register2, Register3, Register4
}

class AnalyticsStore {
	private int totalStoredActions = 0;

	public void storeActions(Queue<Actions> pending, int K) {
		totalStoredActions += pending.size();
		while (!pending.isEmpty() && totalStoredActions > K) {
			System.out.print(pending.poll() + " ");
		}
		pending.clear();
		if(totalStoredActions>K)
			System.out.println();
	
	}

	public int getTotalStoredActions() {
		return totalStoredActions;
	}

}

class Analytics {
	private int K;
	private AnalyticsStore store;
	private HashMap<Actions, Integer> hm = new HashMap<>();
	Queue<Actions> pendingActions = new LinkedList<>();

	public Analytics(AnalyticsStore store, int K) {
		this.K = K;
		this.store = store;
	}

	void registerAction(Actions action) {
		hm.putIfAbsent(action, hm.getOrDefault(action, 0) + 1);
		pendingActions.add(action);
		if (pendingActions.size() == K)
			store.storeActions(pendingActions, K);

	}

	int loggedActions() {
		return store.getTotalStoredActions()+ pendingActions.size();
	}

	int notSentToStore() {
		return pendingActions.size();
	}

	List<Actions> getMostFrequent() {
		int max = 0;
		List<Actions> freqAct = new ArrayList<>();
		for (int i : hm.values())
			max = Math.max(max, i);
		for (Map.Entry<Actions, Integer> temp : hm.entrySet()) {
			if (temp.getValue() == max)
				freqAct.add(temp.getKey());
		}
		freqAct.sort(Comparator.comparing(Enum::name));
		return freqAct;
	}

}

public class MockTest {
	public static void main(String[] args) {
		AnalyticsStore store = new AnalyticsStore();
		Analytics analytics = new Analytics(store, 3);
		analytics.registerAction(Actions.Register1);
		analytics.registerAction(Actions.Register2);
		System.out.println(analytics.notSentToStore());
		analytics.registerAction(Actions.Register2);
		analytics.registerAction(Actions.Register1);
		System.out.println(analytics.loggedActions());
		System.out.println(analytics.getMostFrequent());
		analytics.registerAction(Actions.Register3);
		analytics.registerAction(Actions.Register3);
		

	}
}
