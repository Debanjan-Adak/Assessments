package Hakerrank;

import java.util.Queue;

public class AnalyticsStoreImpl implements IAnalyticsStore {

    @Override
    public void storeAction(Queue<ActionEnum> actions) {

        System.out.println("Stored to Analytics Store: " + actions);
    }
}