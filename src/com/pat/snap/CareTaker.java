package com.pat.snap;

import java.util.ArrayList;
import java.util.List;

/**
 * 管理历史，负责恢复
 * @author Administrator
 *
 */
public class CareTaker {
	private List<Memento> mementoList = new ArrayList<Memento>();

	   public void add(Memento state){
	      mementoList.add(state);
	   }

	   public Memento get(int index){
	      return mementoList.get(index);
	   }

}
