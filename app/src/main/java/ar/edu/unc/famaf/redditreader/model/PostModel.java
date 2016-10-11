package ar.edu.unc.famaf.redditreader.model;


import java.util.Date;

public class PostModel {
    private String mTitle;
    private String mAuthor;
    private Date mDate;
    private int mNumComments;
    private String mImage;

    public PostModel() {
    }

    public PostModel(String mTitle, String mAuthor, Date mDate, int mNumComments, String mImage) {
        this.mTitle = mTitle;
        this.mAuthor = mAuthor;
        this.mDate = mDate;
        this.mNumComments = mNumComments;
        this.mImage = mImage;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public String getmAuthor() {
        return mAuthor;
    }

    public void setmAuthor(String mAuthor) {
        this.mAuthor = mAuthor;
    }

    public int getmNumComments() {
        return mNumComments;
    }

    public void setmNumComments(int mNumComments) {
        this.mNumComments = mNumComments;
    }

    public String getmImage() {
        return mImage;
    }

    public void setmImage(String mImage) {
        this.mImage = mImage;
    }
}
