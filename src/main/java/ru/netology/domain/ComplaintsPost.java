package ru.netology.domain;

public class ComplaintsPost {
    private int idComplaint;
    private int idAuthor;
    private int idReasonComplaint;

    public int getIdComplaint() {
        return idComplaint;
    }

    public void setIdComplaint(int idComplaint) {
        this.idComplaint = idComplaint;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public int getIdReasonComplaint() {
        return idReasonComplaint;
    }

    public void setIdReasonComplaint(int idReasonComplaint) {
        this.idReasonComplaint = idReasonComplaint;
    }
}
