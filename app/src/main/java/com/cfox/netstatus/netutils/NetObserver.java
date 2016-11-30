package com.cfox.netstatus.netutils;

import java.util.ArrayList;
import java.util.List;

/**
 * <br/>************************************************
 * <br/>PROJECT_NAME : NetStatus
 * <br/>PACKAGE_NAME : com.cfox.netstatus.netutils
 * <br/>AUTHOR : CFOX
 * <br/>MSG :
 * <br/>************************************************
 */

public class NetObserver {
    private static List<NetStatusReceiver> sNetStatusReceivers = new ArrayList<>();

    public static void register(NetStatusReceiver netStatusReceiver){
        sNetStatusReceivers.add(netStatusReceiver);
    }

    public static List<NetStatusReceiver> getNetStatusReceivers(){
        return sNetStatusReceivers;
    }
}
