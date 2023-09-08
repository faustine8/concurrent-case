package org.example;

import org.example.blockqueue.second.*;
import org.junit.Test;


public class ChainTest {

    @Test
    public void testChain(){
        //构建责任链
        SaveProcessor saveProcessors=new SaveProcessor();
        PrintProcessor printProcessor=new PrintProcessor(saveProcessors);
        IRequestProcessor requestProcessor=new ValidProcessor(printProcessor);
        Request request=new Request();
        request.setName("Mic");
        requestProcessor.processRequest(request);
    }
}
