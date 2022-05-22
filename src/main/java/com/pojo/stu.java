package com.pojo;

public class stu {
    private String Uname;
    private String CardNum;

    public String getUname() {
        return Uname;
    }

    public void setUname(String uname) {
        Uname = uname;
    }

    public String getCardNum() {
        return CardNum;
    }

    public void setCardNum(String cardNum) {
        CardNum = cardNum;
    }

    public stu(String uname, String cardNum) {
        Uname = uname;
        CardNum = cardNum;
    }

    public stu() {
    }

    @Override
    public String toString() {
        return "stu{" +
                "Uname='" + Uname + '\'' +
                ", CardNum='" + CardNum + '\'' +
                '}';
    }
}
