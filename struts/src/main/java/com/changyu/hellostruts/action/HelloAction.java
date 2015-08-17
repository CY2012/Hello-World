package com.changyu.hellostruts.action;

import com.changyu.hellostruts.pojo.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
 
    private MessageStore messageStore;
     
    public String execute() throws Exception {
         
        messageStore = new MessageStore() ;
        messageStore.setMessage("为什么不是UTF-8");
        return SUCCESS;
    }
 
    public MessageStore getMessageStore() {
        return messageStore;
    }
 
    public void setMessageStore(MessageStore messageStore) {
        this.messageStore = messageStore;
    }
}
