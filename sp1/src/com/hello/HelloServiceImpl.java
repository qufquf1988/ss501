package com.hello;

import java.util.Calendar;

public class HelloServiceImpl implements HelloService {//������ ó���ϴ� ������ �����̴�.


	@Override
	public String getMessage() {
		String msg;
		
		int h=Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		
		if(h>=6&&h<9){
			msg="���� ��ħ �Դϴ�.";
		} else if(h>=13&& h<14){
			msg="���ɽð�";
		} else if(h>=18&&h<19){
			msg="����ð�";
		} else {
			msg="�ȳ�...";
		}
		
		return msg;
	}
}
