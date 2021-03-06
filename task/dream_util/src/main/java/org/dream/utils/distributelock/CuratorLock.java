package org.dream.utils.distributelock;


import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;

/**
 * @author Boyce
 * 2016年6月29日 上午10:25:05 
 */
public class CuratorLock implements DistributeLock{
	InterProcessMutex lock;
	public CuratorLock(CuratorFramework client,String monitor) {
		lock=new InterProcessMutex(client, monitor);
	}
	
	
	@Override
	public void lock() {
		try {
			lock.acquire();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void unlock() {
		try {
			lock.release();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
