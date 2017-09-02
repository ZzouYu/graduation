package org.he.graduationdesignmanagement.action;
import java.io.File;   
import java.text.DateFormat;   
import java.text.SimpleDateFormat;   
import java.util.Date;   
import java.util.Random;   
  
import javax.servlet.ServletContext;   
  
import org.apache.commons.io.FileUtils;   
import org.apache.struts2.util.ServletContextAware;   
  
import com.opensymphony.xwork2.ActionSupport;   
  
public class Fileupload extends ActionSupport implements ServletContextAware {   
       
    private static final long serialVersionUID = -5016873153441103539L;   
       
    private File doc;   
    private String fileName;   
    private String contentType;   
       
    private ServletContext context;   
           
    public void setDoc(File file) {   
        this.doc = file;   
    }   
       
    public void setDocFileName(String fileName) {   
        this.fileName = fileName;   
    }   
       
    public void setDocContentType(String contentType) {   
        this.contentType = contentType;   
    }   
       
    public void setServletContext(ServletContext context) {   
        this.context = context;   
    }   
       
    public String execute() throws Exception {   
        String targetDirectory = context.getRealPath("/upload");   
        String targetFileName = generateFileName(fileName);   
        File target = new File(targetDirectory, targetFileName);   
           
        FileUtils.copyFile(doc, target);   
           
        return SUCCESS;   
    }   
       
    private String generateFileName(String fileName) {   
        DateFormat format = new SimpleDateFormat("yyMMddHHmmss");   
        String formatDate = format.format(new Date());   
           
        int random = new Random().nextInt(10000);   
           
        int position = fileName.lastIndexOf(".");   
        String extension = fileName.substring(position);   
           
        return formatDate + random + extension;   
    }      
}  
