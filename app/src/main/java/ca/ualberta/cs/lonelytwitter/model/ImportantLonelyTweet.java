package ca.ualberta.cs.lonelytwitter.model;

public class ImportantLonelyTweet extends Tweet {
    @Override
    public boolean isValid() {
        if (getTweetBody().trim().length() == 0
                || getTweetBody().trim().length() > 20) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        String body = getTweetDate() + " | " + getTweetBody() ;
        return body.toUpperCase();
    }
}
