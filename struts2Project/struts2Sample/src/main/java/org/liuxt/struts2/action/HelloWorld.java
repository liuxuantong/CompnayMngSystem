package org.liuxt.struts2.action;

import org.liuxt.struts2.model.MessageStore;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorld extends ActionSupport {
	 
    private static final long serialVersionUID = 1L;
 
    private MessageStore messageStore;
     
    public String execute() throws Exception {
        messageStore = new MessageStore() ;
        return SUCCESS;
    }
 
    public MessageStore getMessageStore() {
        return messageStore;
    }
 
    public void setMessageStore(MessageStore messageStore) {
        this.messageStore = messageStore;
    }
 
}