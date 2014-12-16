package org.geeksaint.deadmock;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/me")
public class MyController {

    @RequestMapping(value="/name",method= RequestMethod.GET)
    public ModelAndView show(@RequestParam("number") String number){
        ModelAndView  modelAndView = new ModelAndView();
        modelAndView.setViewName("myview");
        modelAndView.addObject("response", "");
        return modelAndView;
    }
}

//    public void update(@ModelAttribute("account") SpecialAccount account) {
//public void show(HttpServletRequest request, Map<String, Object> model) throws Exception {
//    model.put("account", accountRepository.findAccount(number));
//    model being something that's returned
//'
//RequestParam(value="number", required=false) String number
//    @RequestParam("id") Long id
//    @RequestParam("balance") double balance
//    @RequestParam double amount
