package Hakerrank;

import java.util.*;

public class Analytics {

    private final IAnalyticsStore analyticsStore;
    private final int k;

    private final Queue<ActionEnum> buffer;
    private final Map<ActionEnum, Integer> frequencyMap;

    private int totalLoggedActions;

    public Analytics(IAnalyticsStore analyticsStore, int k) {
        if (analyticsStore == null)
            throw new IllegalArgumentException("AnalyticsStore cannot be null");
        if (k <= 0)
            throw new IllegalArgumentException("k must be greater than 0");

        this.analyticsStore = analyticsStore;
        this.k = k;

        this.buffer = new LinkedList<>();
        this.frequencyMap = new HashMap<>();
        this.totalLoggedActions = 0;
    }

    public void registerAction(ActionEnum action) {
        if (action == null)
            throw new IllegalArgumentException("Action cannot be null");

        buffer.offer(action);

        frequencyMap.put(action, frequencyMap.getOrDefault(action, 0) + 1);

        totalLoggedActions++;

        if (buffer.size() == k) {
            analyticsStore.storeAction(new LinkedList<>(buffer));
            buffer.clear();
        }
    }

    public int getNumberOfActionRegisteredButNotSentToAnalyticsStore() {
        return buffer.size();
    }

    public int getTotalNumberOfLoggedActions() {
        return totalLoggedActions;
    }
    public List<ActionEnum> getMostFrequentlyUsedActions() {

        if (frequencyMap.isEmpty())
            return new ArrayList<>();

        int maxFrequency = Collections.max(frequencyMap.values());

        List<ActionEnum> result = new ArrayList<>();

        for (Map.Entry<ActionEnum, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                result.add(entry.getKey());
            }
        }
        result.sort(Comparator.comparing(Enum::name));
        return result;
    }
}

