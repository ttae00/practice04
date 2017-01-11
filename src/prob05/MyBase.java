package prob05;

public class MyBase extends Base {

	@Override
	public void service(String state) {
		// TODO Auto-generated method stub
		//super.service(state);
		
		if(state.equals("낮")){
			System.out.println(state + "에는 열심히 일하자!");
		}else if(state.equals("오후")){
			System.out.println(state + "도  낮과 마찬가지로 일해야합니다");
		}else if(state.equals("밤")){
			night();
		}else{
			super.service(state);
		}
	}
	
	
}
