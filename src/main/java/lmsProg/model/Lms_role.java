package lmsProg.model;

public enum Lms_role {

    STUDENT ("student"),
    TEACHER ("teacher");


    private String value;

    private Lms_role(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
