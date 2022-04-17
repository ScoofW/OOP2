package ru.netology.domain;

public class CommentsPost {
    private int idComments;
    private int idAuthorComments;
    private String textComments;

    public int getIdComments() {
        return idComments;
    }

    public void setIdComments(int idComments) {
        this.idComments = idComments;
    }

    public int getIdAuthorComments() {
        return idAuthorComments;
    }

    public void setIdAuthorComments(int idAuthorComments) {
        this.idAuthorComments = idAuthorComments;
    }

    public String getTextComments() {
        return textComments;
    }

    public void setTextComments(String textComments) {
        this.textComments = textComments;
    }
}
