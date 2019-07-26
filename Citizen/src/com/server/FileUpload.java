package com.server;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileItemIterator; 
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils; 

public class FileUpload extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		doPost(req,res);
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException
	{
				   //Set the root directory where you want to store the uploaded files
				   String rootDirectory = "e://images//";
				   // Check that we have a file upload request
				   boolean isMultipart = ServletFileUpload.isMultipartContent(req);
				   
				   if (isMultipart) 
				   {
				    // Create a factory for disk-based file items
				    FileItemFactory factory = new DiskFileItemFactory();
				    // Create a new file upload handler
				    ServletFileUpload upload = new ServletFileUpload(factory);
				   
				    // Process the uploaded items
				   
				    try {
				      // Parse the request
				      List items = upload.parseRequest(req);
				      // Process the uploaded items
				      Iterator iter = items.iterator();
				      while (iter.hasNext()) 
				      {
				       FileItem item = (FileItem) iter.next();
				     
				       if (item.isFormField()) 
				       {
				        String fieldName = item.getFieldName();
				        String fileName = item.getName();
				        String contentType = item.getContentType();
				        boolean isInMemory = item.isInMemory();
				        long sizeInBytes = item.getSize();
				       } 
				       else 
				       {
				        String fileName = item.getName();
				        if (fileName != null && !fileName.equals("")) 
				        {
				         fileName = FilenameUtils.getName(fileName);
				         File uploadedFile = new File(rootDirectory + fileName);
				       
				       
				         try {
				            item.write(uploadedFile);
				            //here set the root directory path
				            File newfile=new File("C://users//prashant//eclipse-workspace//Citizen//war//image//"+uploadedFile.getName());
				            uploadedFile.renameTo(newfile);
				            res.getWriter().write(newfile.getName());
				          
				          } 
				         catch (Exception e) 
				         {
				           e.printStackTrace();
				           System.out.print(e.getMessage());
				         }
				        }
				       }
				      }
				     } 
				    catch (FileUploadException e) 
				    {
				     e.printStackTrace();
				     System.out.print(e.getMessage());
				    }
				   }
		
	}
}
		/*ServletFileUpload upload = new ServletFileUpload(new DiskFileItemFactory());
		try {
			 // Parse the request
	         List items = upload.parseRequest(req); 

	      // Process the uploaded items
	         Iterator iter = items.iterator();

	      while (iter.hasNext()) {
	         FileItem item = (FileItem) iter.next();
	      
	         //handling a normal form-field
	         if(item.isFormField()) {
	            System.out.println("Got a form field");
	            String name = item.getFieldName();
	            String value = item.getString();
	            System.out.print("Name:"+name+",Value:"+value);				
	         
	         } else { 
	            
	            //handling file loads
	            System.out.println("Not form field");
	            String fieldName = item.getFieldName();
	            String fileName = item.getName();
	            if (fileName != null) {
	               fileName = FilenameUtils.getName(fileName);
	            }
	            
	            String contentType = item.getContentType();
	            boolean isInMemory = item.isInMemory();
	            long sizeInBytes = item.getSize();
	            System.out.print("Field Name:"+fieldName +",File Name:"+fileName);
	            System.out.print("Content Type:"+contentType
	               +",Is In Memory:"+isInMemory+",Size:"+sizeInBytes);			 
	            
	            byte[] data = item.get();
	            fileName = getServletContext()
	               .getRealPath( "/uploadedFiles/" + fileName);
	            System.out.print("File name:" +fileName);			
	            FileOutputStream fileOutSt = new FileOutputStream(fileName);
	            fileOutSt.write(data);
	            fileOutSt.close();
	            System.out.print("File Uploaded Successfully!");
	         }	
	      }
	   } catch(Exception e){
	      System.out.print("File Uploading Failed!" + e.getMessage());
	   }  
		
	}
}
*/
   /* public void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
        ServletFileUpload upload = new ServletFileUpload();

        try{
            FileItemIterator iter = upload.getItemIterator(request);

            while (iter.hasNext()) {
                FileItemStream item = iter.next();

                String name = item.getFieldName();
                InputStream stream = item.openStream();


                // Process the input stream
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                int len;
                byte[] buffer = new byte[8192];
                while ((len = stream.read(buffer, 0, buffer.length)) != -1) {
                    out.write(buffer, 0, len);
                }

                int maxFileSize = 10*(1024*1024); //10 megs max 
                if (out.size() > maxFileSize) { 
                    throw new RuntimeException("File is > than " + maxFileSize);
                }
            }
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }

    }
}

*/




