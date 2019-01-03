package com.baeldung.thrift;

import com.baeldung.thrift.impl.CrossPlatformResource;
import com.baeldung.thrift.impl.CrossPlatformService;
import com.baeldung.thrift.impl.InvalidOperationException;
import org.apache.thrift.TException;

import java.util.Collections;
import java.util.List;

public class CrossPlatformServiceImpl implements CrossPlatformService.Iface {

    @Override
    public CrossPlatformResource get(int id)
            throws InvalidOperationException, TException {
        return new CrossPlatformResource();
    }

    @Override
    public void save(CrossPlatformResource resource)
            throws InvalidOperationException, TException {
        //saveResource();
    }

    @Override
    public List<CrossPlatformResource> getList()
            throws InvalidOperationException, TException {
        return Collections.emptyList();
    }

    @Override
    public boolean ping() throws InvalidOperationException, TException {
        return true;
    }
}
