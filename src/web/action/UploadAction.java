package web.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import java.io.File;

/**
 * Created by john on 2016/10/17.
 */
public class UploadAction extends ActionSupport {

    //表单上提供的字段
    private String username;
    private File photo;

    //struts2在文件上传时,提供的属性
    private String photoFileName;//上传的文件名.--->上传字段名称+FileName  注意大小写
    private String photoContentType;//上传文件的MIME类型.---->上传字段名称+文件的MIME类型


    public String upload() {
        System.out.println(photoFileName);
        //1.首先得到ServletContext
        ServletContext application = ServletActionContext.getServletContext();
        //2.得到真实路径
        String realPath = application.getRealPath("/WEB-INF/files");
        //3.创建该目录下的文件夹
        File file = new File(realPath);
        //4.判断该路径下是否存在该文件夹
        if (!file.exists()) {
            file.mkdir();//创建该文件夹
        }
        //5.已经存在了该文件夹,并将该文件存入到这个文件夹中,即吧photo文件存到服务器上
        //保存方式:
        // 1.拷贝:把photo的文件复制到指定目录下,并且临时文件还存在

        // 2.剪切:将photo文件剪切到自定目录下,并将其重命名,临时文件此时不存在了
        photo.renameTo(new File(file, photoFileName));


        return null;
    }




    public String getUsername() {
        return username;
    }

    public String getPhotoFileName() {
        return photoFileName;
    }

    public void setPhotoFileName(String photoFileName) {
        this.photoFileName = photoFileName;
    }

    public String getPhotoContentType() {
        return photoContentType;
    }

    public void setPhotoContentType(String photoContentType) {
        this.photoContentType = photoContentType;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }
}
