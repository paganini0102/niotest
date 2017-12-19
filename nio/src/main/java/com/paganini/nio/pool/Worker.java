package com.paganini.nio.pool;

import java.nio.channels.SocketChannel;

/**
 * <p>worker线程</p>
 * @author paganini
 * @version $Id: Worker.java, v 0.1 2017年12月19日 下午2:30:53 qiuzhongtian Exp $
 */
public interface Worker {
    /**
     * 加入一个新的客户端会话
     * @param channel
     */
     void registerNewChannelTask(SocketChannel channel);
}
