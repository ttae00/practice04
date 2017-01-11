package prob02;

public class Book {
	
	private int bookNo;
	private String title;
	private String author;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	int stateCode;
	
	public Book(int bookNo, String title, String author) {
		// TODO Auto-generated constructor stub
		stateCode=1;
		this.bookNo= bookNo;
		this.title= title;
		this.author= author;
	}

	public void rent() {
		// TODO Auto-generated method stub
		if(stateCode==1){
			stateCode=0;
			System.out.println(title +"이(가) 대여 됐습니다.");
		}else{
			System.out.println("이미 대여중입니다");
		}
		
		
	}
	
	public void print(){
		
		String state="재고있음";
		if(stateCode==1){
			state="재고 있음";
		}else if(stateCode==0){
			state="대여중";
		}else{
			
		}
		System.out.println("책 제목:"+ title
				+ ", 작가:" + author
				+ ", 대여 유무:"
				+ state
				);
	}

	public int getBookNo() {
		// TODO Auto-generated method stub
		return bookNo;
	}

}
