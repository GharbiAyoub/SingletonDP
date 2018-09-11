package com.app.singleton;

public class SingletonClass {
	private static SingletonClass _instance;
	
	private int id;
	private String value;
	private String code;
	public SingletonClass(){
		
	}
	
	public static SingletonClass getInstance(){
		if(_instance==null){
			_instance = new SingletonClass();
		}
		return _instance;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		//return code;
		return ""+this.hashCode();
	}

	public void setCode(String code) {
		this.code = code;
	}

	
	public String toString(String code) {
		setCode(code);
		return "SingletonClass [id=" + id + ", value=" + value + ", HashCode=" + code + "]";
	}
	
}
