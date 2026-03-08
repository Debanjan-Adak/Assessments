package Hakerrank;

public class Main {

    public static void main(String[] args) {

        IAnalyticsStore store = new AnalyticsStoreImpl();
        Analytics analytics = new Analytics(store, 3);

        analytics.registerAction(ActionEnum.FEATURE_BUTTON_1);
        analytics.registerAction(ActionEnum.REGISTER_BUTTON);
        analytics.registerAction(ActionEnum.FEATURE_BUTTON_1);

        analytics.registerAction(ActionEnum.PROCEED_BUTTON);
        analytics.registerAction(ActionEnum.FEATURE_BUTTON_1);

        System.out.println("Total Logged Actions: "
                + analytics.getTotalNumberOfLoggedActions());

        System.out.println("Unsent Actions Count: "
                + analytics.getNumberOfActionRegisteredButNotSentToAnalyticsStore());

        System.out.println("Most Frequently Used Actions: "
                + analytics.getMostFrequentlyUsedActions());
    }
}
