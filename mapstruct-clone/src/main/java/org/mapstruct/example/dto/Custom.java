package org.mapstruct.example.dto;

import com.alibaba.cco.api.Constants;
import com.alibaba.cco.api.Indexable;
import com.alibaba.cco.api.Keyable;
import com.alibaba.cco.api.Titleable;

public enum Custom implements Indexable, Titleable, Keyable<String> {

    /**
     * 未知
     */
    UNKNOWN(Constants.UNKNOWN, Constants.UNKNOWN_NAME, "未知"),
    /**
     * 聊天消息：用户发送的聊天内容基本协议
     */
    CHAT_MESSAGE(0, "CHAT_MESSAGE", "聊天消息：用户发送的聊天内容基本协议"),
    /**
     * 系统消息：系统发送的需要展示在聊天记录中的消息，比如系统提示消息
     */
    SYSTEM_MESSAGE(1, "SYSTEM_MESSAGE", "系统消息：系统发送的需要展示在聊天记录中的消息，比如系统提示消息"),
    /**
     * 事件消息：系统指令或者通知消息，不存储聊天记录
     */
    EVENT_MESSAGE(2, "EVENT_MESSAGE", "事件消息：系统指令或者通知消息，不存储聊天记录");

    private final int code;
    private final String name;

    private final String key;

    Custom(int index, String key, String name) {
        this.code = index;
        this.key = key;
        this.name = name;
    }

    @Override
    public int getIndex() {
        return code;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String getTitle() {
        return null;
    }
}
