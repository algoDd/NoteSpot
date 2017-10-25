package models;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Id;
import play.db.ebean.Model;


@Entity
@Table(name="notespot.upload")

public class UploadModel extends Model{
	@Id
	int id;
	
	@Column(name="filetype")
	String filetype;
	@Column(name="filesize")
	String filesize;
	@Column(name="filename")
	String filename;
	@Column(name="filebase64")
	String filebase64;

	public int getId() {
		return id;
	}
	public static Finder<String, UploadModel> getFind() {
		return find;
	}
	public String getFilebase64() {
		return filebase64;
	}
	public void setFilebase64(String filebase64) {
		this.filebase64 = filebase64;
	}
	public String getFiletype() {
		return filetype;
	}
	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}
	public String getFilesize() {
		return filesize;
	}
	public void setFilesize(String filesize) {
		this.filesize = filesize;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public UploadModel(String filetype,String filesize,String filename,String filebase64)
	{
		this.filebase64=filebase64;
		this.filetype=filetype;
		this.filesize=filesize;
		this.filename=filename;
		
	}
	public static Finder<String,UploadModel>find=new Finder<>(String.class,UploadModel.class);
	
}
