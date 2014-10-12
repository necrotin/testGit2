package kr.or.ddit.vo;

import java.io.Serializable;
import java.util.List;

public class BoardVO implements Serializable {
	/**
	 * 
	 */
	// 같은 위치에 있는 같은 클래스 명을 구분하기 위함
	private static final long serialVersionUID = -3619149992498587273L; 
	
	private Integer bo_no;
	private String bo_title;
	private String bo_writer;
	private String bo_passwd;
	private String bo_email;
	private String bo_ip;
	private String bo_content;
	private Integer bo_hit;
	private String bo_date;
	private Integer bo_group;
	private Integer bo_seq;
	private Integer bo_depth;
	private int[] delPdsNos; 
	
	public int[] getDelPdsNos() {
		return delPdsNos;
	}
	public void setDelPdsNos(int[] delPdsNos) {
		this.delPdsNos = delPdsNos;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Integer getBo_no() {
		return bo_no;
	}
	public void setBo_no(Integer bo_no) {
		this.bo_no = bo_no;
	}
	public String getBo_title() {
		return bo_title;
	}
	public void setBo_title(String bo_title) {
		this.bo_title = bo_title;
	}
	public String getBo_writer() {
		return bo_writer;
	}
	public void setBo_writer(String bo_writer) {
		this.bo_writer = bo_writer;
	}
	public String getBo_passwd() {
		return bo_passwd;
	}
	public void setBo_passwd(String bo_passwd) {
		this.bo_passwd = bo_passwd;
	}
	public String getBo_email() {
		return bo_email;
	}
	public void setBo_email(String bo_email) {
		this.bo_email = bo_email;
	}
	public String getBo_ip() {
		return bo_ip;
	}
	public void setBo_ip(String bo_ip) {
		this.bo_ip = bo_ip;
	}
	public String getBo_content() {
		return bo_content;
	}
	public void setBo_content(String bo_content) {
		this.bo_content = bo_content;
	}
	public Integer getBo_hit() {
		return bo_hit;
	}
	public void setBo_hit(Integer bo_hit) {
		this.bo_hit = bo_hit;
	}
	public String getBo_date() {
		return bo_date;
	}
	public void setBo_date(String bo_date) {
		this.bo_date = bo_date;
	}
	public Integer getBo_group() {
		return bo_group;
	}
	public void setBo_group(Integer bo_group) {
		this.bo_group = bo_group;
	}
	public Integer getBo_seq() {
		return bo_seq;
	}
	public void setBo_seq(Integer bo_seq) {
		this.bo_seq = bo_seq;
	}
	public Integer getBo_depth() {
		return bo_depth;
	}
	public void setBo_depth(Integer bo_depth) {
		this.bo_depth = bo_depth;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bo_no == null) ? 0 : bo_no.hashCode());
		result = prime * result
				+ ((bo_writer == null) ? 0 : bo_writer.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BoardVO other = (BoardVO) obj;
		if (bo_no == null) {
			if (other.bo_no != null)
				return false;
		} else if (!bo_no.equals(other.bo_no))
			return false;
		if (bo_writer == null) {
			if (other.bo_writer != null)
				return false;
		} else if (!bo_writer.equals(other.bo_writer))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BoardVO [bo_no=" + bo_no + ", bo_title=" + bo_title
				+ ", bo_writer=" + bo_writer + ", bo_passwd=" + bo_passwd
				+ ", bo_email=" + bo_email + ", bo_ip=" + bo_ip
				+ ", bo_content=" + bo_content + ", bo_hit=" + bo_hit
				+ ", bo_date=" + bo_date + ", bo_group=" + bo_group
				+ ", bo_seq=" + bo_seq + ", bo_depth=" + bo_depth + "]";
	}
	
	
}
