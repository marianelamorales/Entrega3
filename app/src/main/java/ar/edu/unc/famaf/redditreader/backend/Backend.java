package ar.edu.unc.famaf.redditreader.backend;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import ar.edu.unc.famaf.redditreader.model.PostModel;

public class Backend {
    private static Backend ourInstance = new Backend();

    public static Backend getInstance() {
        return ourInstance;
    }

    private Backend() {
    }

    public List<PostModel> getTopPosts() {
        List<PostModel> mLstPostModel = new ArrayList<>();

        Calendar calendar = Calendar.getInstance();

        PostModel p1 = new PostModel();
        p1.setmAuthor(" slave_of_slytherin");
        p1.setmTitle("It is true");
        p1.setmImage("https://i.redditmedia.com/xEVDt5Ew2K8EUwSwwl25aruzBhidC1s82OMdqgTrvI8.jpg?w=480&s=9bad4ef516f7fa5e84cc96a74e10f870");
        p1.setmNumComments(151);
        calendar.set(Calendar.YEAR, 2016);
        calendar.set(Calendar.MONTH, 10);
        calendar.set(Calendar.DATE, 10);
        p1.setmDate(calendar.getTime());


        PostModel p2 = new PostModel();
        p2.setmAuthor( "Beejay16");
        p2.setmTitle("Will you please throw the ball for me?");
        p2.setmImage("https://i.redditmedia.com/TDBCTxTwYjA4rn_n_8TWG4FCIs4qvKZULB5o196MJoY.jpg?w=576&s=85a18c01c037fc74af7f3f95ad078f16");
        p2.setmNumComments(0);
        calendar.set(Calendar.YEAR, 2016);
        calendar.set(Calendar.MONTH, 10);
        calendar.set(Calendar.DATE, 10);
        p2.setmDate(calendar.getTime());

        PostModel p3 = new PostModel();
        p3.setmAuthor("bengaldude545");
        p3.setmTitle("Bird thinks guy is a tree");
        p3.setmImage("https://a.thumbs.redditmedia.com/0e0cKrikx0u2EeCT6Di9LgLXrE2WVICdJpAw1Tj4Ka8.jpg");
        p3.setmNumComments(1187);
        calendar.set(Calendar.YEAR, 2016);
        calendar.set(Calendar.MONTH, 10);
        calendar.set(Calendar.DATE, 9);
        p3.setmDate(calendar.getTime());

        PostModel p4 = new PostModel();
        p4.setmAuthor("lendavis71");
        p4.setmTitle("Our dachshund acts more like someone's dad every day");
        p4.setmImage("https://a.thumbs.redditmedia.com/hYweVwsHP8unH65UJgusQL0JCmbnhXfkVtJj33d7tT4.jpg");
        p4.setmNumComments(201);
        calendar.set(Calendar.YEAR, 2016);
        calendar.set(Calendar.MONTH, 10);
        calendar.set(Calendar.DATE, 10);
        p2.setmDate(calendar.getTime());

        PostModel p5 = new PostModel();
        p5.setmAuthor("ecky--ptang-zooboing");
        p5.setmTitle("Helmcken Falls is pretty neat");
        p5.setmImage("https://b.thumbs.redditmedia.com/oxr66bnGdSa4WDr4wwQO6x9MLKFFIfsWjYRi5pNtT8I.jpg");
        p5.setmNumComments(285);
        calendar.set(Calendar.YEAR, 2016);
        calendar.set(Calendar.MONTH, 10);
        calendar.set(Calendar.DATE, 10);
        p5.setmDate(calendar.getTime());

        mLstPostModel.add(p1);
        mLstPostModel.add(p2);
        mLstPostModel.add(p3);
        mLstPostModel.add(p4);
        mLstPostModel.add(p5);

        return mLstPostModel;
    }
}
