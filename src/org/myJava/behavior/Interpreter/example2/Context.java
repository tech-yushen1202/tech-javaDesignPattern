package org.myJava.behavior.Interpreter.example2;

import java.util.HashMap;
import java.util.Map;
import org.myJava.behavior.Interpreter.example2.Variable;

//上下文（环境）角色，使用HashMap来存储变量对应的数值
public class Context {

	private Map<Variable, Integer> valueMap = new HashMap<Variable, Integer>();

	public void addValue(Variable x, int y) {
		Integer yi = new Integer(y);
		valueMap.put(x, yi);
	}

	public int lookupValue(Variable x) {
		int i = ((Integer) valueMap.get(x)).intValue();
		return i;
	}

}
