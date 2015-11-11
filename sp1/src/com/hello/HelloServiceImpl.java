package com.hello;

import java.util.Calendar;

public class HelloServiceImpl implements HelloService {//로직을 처리하는 영역이 서비스이다.


	@Override
	public String getMessage() {
		String msg;
		
		int h=Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		
		if(h>=6&&h<9){
			msg="좋은 아침 입니다.";
		} else if(h>=13&& h<14){
			msg="점심시간";
		} else if(h>=18&&h<19){
			msg="저녁시간";
		} else {
			msg="안녕...";
		}
		
		return msg;
	}
}
