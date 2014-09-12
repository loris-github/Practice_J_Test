package com.test.util;

import java.util.*;

interface Animal {
	void speak ();
	String toString();
}

class HungryEvent {
	public Animal source = null;
	public long time = System.currentTimeMillis();
	
	public HungryEvent (long time,Animal a){
		this.source =a;
		this.time= time;
	}
	
}

interface HugryEventListener{
	void ActionToHungry(HungryEvent e);
}

class Cat implements Animal{
	private String name = null;
	private boolean HungryState = false;
	public Map<Integer,HugryEventListener> CatHugryEventListener = new HashMap<Integer,HugryEventListener>();
	
	public void addHugryEventListener(HugryEventListener hel){
		CatHugryEventListener.put(new Integer((int) System.currentTimeMillis()),hel);
		hel.ActionToHungry(new HungryEvent(System.currentTimeMillis(),this));
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("喵喵");		
	}
	
	public String toString (){
		return this.getName();
	}
	
	public boolean isHungry(){
		return HungryState;
	}
	
}

class Host implements Animal,HugryEventListener{
	
	private String name = null; 
	
	public void speak(){
		System.out.println("我的猫，来呀");
	}
	
	public void feed(Animal a){
		System.out.println(name+"给"+a+"喂食");
	}
	
	public String toString(){
		return name;
	}
	
	public void ActionToHungry(HungryEvent e){
		if (e.time>100){
			if (e.source instanceof Cat ){		
				System.out.println(e.time+"说： "+((Cat) e.source).getName()+"来，老鼠，新鲜的!");
			}
			else
				System.out.println("包子，热的！");
		}
		else
			System.out.println("表装饿！");
	}
	
}

public class TestCollection {

	public static void main(String[] args) {
		Host theOne = new Host();
		Collection<Animal> c = new ArrayList<Animal>();
		
		for(int i = 0;i<10;i++){
			Cat mm = new Cat();
			mm.setName("喵星人 "+i+" 号");
			c.add(mm);	
		}

		for(Iterator<Animal> it = c.iterator();it.hasNext();){
			Cat thePet = (Cat)it.next();
			thePet.addHugryEventListener(theOne);
			try {
				
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
