package web.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import java.io.File;

/**
 * Created by john on 2016/10/17.
 */
public class UploadMoreAction extends ActionSupport {

    //表单上提供的字段
    private File[] photo;

    //struts2在文件上传时,提供的属性
    private String[] photoFileName;//上传的文件名.--->上传字段名称+FileName  注意大小写
    private String[] photoContentType;//上传文件的MIME类型.---->上传字段名称+文件的MIME类型

    public String uploadMore() {
        //创建文件存放目录
        ServletContext application = ServletActionContext.getServletContext();
        String realPath = application.getRealPath("/WEB-INF/moreFiles");

        File file = new File(realPath);
        if (!file.exists()) {
            file.mkdir();
        }

        //对文件数组进行遍历并将其存放到 目录下
        for (int i = 0; i < photo.length; i++) {
            File file1 = photo[i];
            file1.renameTo(new File(file, photoFileName[i]));
        }

        return null;
    }


    public File[] getPhoto() {
        return photo;
    }

    public void setPhoto(File[] photo) {
        this.photo = photo;
    }

    public String[] getPhotoFileName() {
        return photoFileName;
    }

    public void setPhotoFileName(String[] photoFileName) {
        this.photoFileName = photoFileName;
    }

    public String[] getPhotoContentType() {
        return photoContentType;
    }

    public void setPhotoContentType(String[] photoContentType) {
        this.photoContentType = photoContentType;
    }
}
