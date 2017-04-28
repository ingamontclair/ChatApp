package edu.montclair.mobilecomputing.m_alrajab.week11_firebase_chatapp.model;

/**
 * Created by m_alrajab on 4/3/17.
 */

public class ChatMessageItem {

    private String msgBody;
    private String senderName;
    private String uri;
    private String timeStamp;

    public ChatMessageItem(){

    }


    // this is today design
    public ChatMessageItem(String msgBody, String senderName, String time, String u) {
        this.msgBody = msgBody;
        this.senderName = senderName;
        this.timeStamp = time;
        this.uri = u;
    }


    public String getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(String msgBody) {
        this.msgBody = msgBody;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getPhotoUrl() {
        return uri;
    }
}
