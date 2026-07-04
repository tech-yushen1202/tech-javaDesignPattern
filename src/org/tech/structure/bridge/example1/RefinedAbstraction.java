package org.tech.structure.bridge.example1;

public class RefinedAbstraction extends Abstraction {

	public void operation() {
		// 业务代码
		impl.operationImpl(); // 调用实现类的方法
		// 业务代码
	}
}