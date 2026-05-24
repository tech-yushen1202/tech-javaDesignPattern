package org.myJava.creation.Singleton.example3;

/**
 * 双重检查加锁实现方案
 * 备注：由于volatile关键字可能会屏蔽掉虚拟机中一些必要的代码优化，所以运行效率并不是很高。
 * 因此一般建议，没有特别的需要，不要使用。
 * 也就是说，虽然可以使用“双重检查加锁”机制来实现线程安全的单例，但并不建议大量采用，可以根据情况来选用。
 */
public class TargetSingletonClass {

    private volatile static TargetSingletonClass instance = null;

    private TargetSingletonClass() {
    }

    public static TargetSingletonClass getInstance() {
        // 检查实例是否存在
        if (instance == null) {
            // 同步块，线程安全的创建实例
            synchronized (TargetSingletonClass.class) {
                // 再次检查实例是否存在，如果不存在才真正的创建实例
                if (instance == null) {
                    instance = new TargetSingletonClass();
                }
            }
        }
        return instance;
    }
}