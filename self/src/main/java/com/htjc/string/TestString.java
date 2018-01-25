package com.htjc.string;

import java.nio.Buffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by sunglee on 2018/1/10.
 */
public class TestString {

	/**
	 * String StringBUffer StringBuilder的区别
	 * String类是被final修饰的，不可被继承，实现细节不能被改变，变量都存储在一个char数组中  private final char value[];
	 * StringBuffer也是被final修饰的，不可被继承，它的变量存储在char value[]中，是可变的，里面的大部分方法都做了同步锁，可以说是线程安全的。
	 * StringBuilder与StringBuffer都继承自AbstractStringBuilder类，Stringbulider并没有加同步锁，属于线程不安全。
	 */
	public final String uuid = "123456";
	StringBuffer buffer = new StringBuffer(uuid);
	StringBuilder builder = new StringBuilder(uuid);


	List<String> list = new ArrayList<String>();
	List<String> linkedList = new LinkedList<String>();



}
