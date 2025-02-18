package study13;

//(게시판 = 제목, 암호, 글쓴이, 내용 ...) 화면 -> 자바 -> DB 저장
public class BoardVO {
	private String title;		//제목
	private String pwd;			//암호
	private String writer;		//글쓴이
	private String content;		//게시글 내용
	private int hits;			//조회수
	private String rdate;		//날짜
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	
	
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	
	
	
	
	
	
	
}
