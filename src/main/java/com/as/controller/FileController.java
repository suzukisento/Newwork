package com.as.controller;

import com.as.utils.StringUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/file")
public class FileController {

    @RequestMapping("/upload")
    public String upLoad(@RequestParam("myFile")MultipartFile file, Model model){
//        System.out.println(file.getOriginalFilename());
        if(file.isEmpty())
            throw new RuntimeException("未选择文件");
// 获取原始文件名
        String fileName = file.getOriginalFilename();
        System.out.println("获取到前台传来的文件名是：" + fileName);
// 获取文件的后缀名
        String suffixName = StringUtil.getSuffixName(fileName);
        System.out.println("获取到文件的后缀名是：" + suffixName);
// 指定文件上传路径
        String filePath = "D://tmp//";
// 使用随机字符序列作为文件名称
        String newFileName = StringUtil.randomFileName();
// 拼接文件保存后的绝对路径
        String fullFileName = filePath + newFileName + suffixName;
        System.out.println("文件将保存在：" + fullFileName);
// 开始创建File对象，对后续的上传工作做准备
        File dest = new File(fullFileName);
// 检测是否存在父级目录
        if(!dest.getParentFile().exists())
            dest.getParentFile().mkdirs();
// 文件上传
        try {
            file.transferTo(dest);
            model.addAttribute("fileName", "/tmp/" + newFileName +
                    suffixName);
            System.out.println("文件上传成功...");
            return "file/succ";
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件上传失败： -> " + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }
}
