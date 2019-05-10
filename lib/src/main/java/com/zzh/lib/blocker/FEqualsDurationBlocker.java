package com.zzh.lib.blocker;

/**
 * 可以根据时间间隔和对象equals()是否相等来拦截事件
 */
public class FEqualsDurationBlocker implements FIEqualsBlocker, FIDurationBlocker
{
    private FIEqualsBlocker mEqualsBlocker = new FEqualsBlocker();
    private FIDurationBlocker mDurationBlocker = new FDurationBlocker();

    public FEqualsDurationBlocker()
    {
        super();
        setAutoSaveLastLegalObject(false);
        setAutoSaveLastLegalTime(false);
    }

    @Override
    public void setMaxEqualsCount(int maxEqualsCount)
    {
        mEqualsBlocker.setMaxEqualsCount(maxEqualsCount);
    }

    @Override
    public void setAutoSaveLastLegalObject(boolean autoSaveLastLegalObject)
    {
        mEqualsBlocker.setAutoSaveLastLegalObject(autoSaveLastLegalObject);
    }

    @Override
    public void saveLastLegalObject(Object lastLegalObject)
    {
        mEqualsBlocker.saveLastLegalObject(lastLegalObject);
    }

    @Override
    public boolean blockEquals(Object object)
    {
        return mEqualsBlocker.blockEquals(object);
    }

    @Override
    public void setBlockDuration(long blockDuration)
    {
        mDurationBlocker.setBlockDuration(blockDuration);
    }

    @Override
    public long getBlockDuration()
    {
        return mDurationBlocker.getBlockDuration();
    }

    @Override
    public void saveLastLegalTime()
    {
        mDurationBlocker.saveLastLegalTime();
    }

    @Override
    public long getLastLegalTime()
    {
        return mDurationBlocker.getLastLegalTime();
    }

    @Override
    public void setAutoSaveLastLegalTime(boolean autoSaveLastLegalTime)
    {
        mDurationBlocker.setAutoSaveLastLegalTime(autoSaveLastLegalTime);
    }

    @Override
    public boolean isInBlockDuration(long blockDuration)
    {
        return mDurationBlocker.isInBlockDuration(blockDuration);
    }

    @Override
    public boolean block()
    {
        return mDurationBlocker.block();
    }

    @Override
    public boolean block(long blockDuration)
    {
        return mDurationBlocker.block(blockDuration);
    }
}
