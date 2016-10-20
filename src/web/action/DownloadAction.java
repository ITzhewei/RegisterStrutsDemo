package web.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.FileInputStream;

/**
 * Created by john on 2016/10/17.
 * 文件下载
 */
public class DownloadAction extends ActionSupport {

    FileInputStream inputStream;

    //创建一个 文件的 名字
    private String filename;

    public String download() throws Exception {

        filename = "照片.jpg";

        //1.找到文件的存储路径
        String realPath = ServletActionContext.getServletContext().getRealPath("/WEB-INF/files/5.jpg");
        //2.把文件读到一个InputStream中
        inputStream = new FileInputStream(realPath);
        //3.返回一个成功
        return SUCCESS;
        //4.剩下的内容由Stream的结果类型为我们做

    }

    public FileInputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(FileInputStream inputStream) {
        this.inputStream = inputStream;
    }
}
