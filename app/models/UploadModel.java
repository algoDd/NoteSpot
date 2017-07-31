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
	@Column(name="filebase64")
	String filebase64;
	@Column(name="filetype")
	String filetype;
	@Column(name="filesize")
	String filesize;
	@Column(name="filename")
	String filename;
	

	public UploadModel(String filebase64,String filetype,String filesize,String filename)
	{
		this.filebase64=filebase64;
		this.filetype=filetype;
		this.filesize=filesize;
		this.filename=filename;
		
	}
	public static Finder<String,UploadModel>find=new Finder<>(String.class,UploadModel.class);
	
}
