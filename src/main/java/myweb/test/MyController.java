package myweb.test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
 
@Controller
public class MyController {
 
    @Autowired
    HomeMapper homeMapper;

    @GetMapping("/{name}.html")
    public String page(@PathVariable String name, Model model) {
        List<TestVO> dataList = homeMapper.selectUser();
        //String userId = homeMapper.selectId();

        model.addAttribute("dataList", dataList);
        model.addAttribute("pageName", name);
        return "page";
    }

    @GetMapping("/")
    public String page2( Model model) {
        model.addAttribute("pageName", "main");
        return "page";
    }
 
}