package board.model;

public class BoardVo {
	private	String	title;
	private	String	content;
	private	String	reg_id;
	private	String	reg_dt;
	
	public BoardVo(String title, String content, String reg_id, String reg_dt) {
		this(title, content, reg_id);
		this.reg_dt	=	reg_dt;
	}
	public BoardVo(String title, String content, String reg_id) {
		this.title	=	title;
		this.content	=	content;
		this.reg_id	=	reg_id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getReg_id() {
		return reg_id;
	}
	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}
	public String getReg_dt() {
		return reg_dt;
	}
	public void setReg_dt(String reg_dt) {
		this.reg_dt = reg_dt;
	}
	
	@Override
	public String toString() {
		return "BoardVo [title=" + title + ", content=" + content + ", reg_id=" + reg_id + ", reg_dt=" + reg_dt + "]";
	}
}