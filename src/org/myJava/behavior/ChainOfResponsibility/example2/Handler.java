package org.myJava.behavior.ChainOfResponsibility.example2;

import lombok.Data;

@Data
public abstract class Handler {

	/**
	 * 持有下一个处理请求的对象
	 */
	protected Handler successor = null;

	/**
	 * 处理聚餐费用的申请
	 * @param user    申请人
	 * @param fee    申请的钱数
	 * @return        成功或失败的具体通知
	 */
	public abstract String handleFeeRequest(String user, double fee);
}
