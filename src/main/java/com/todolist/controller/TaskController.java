package com.todolist.controller;


import com.todolist.domain.Task;
import com.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TaskController {


    @Autowired
    TaskService taskService;



    @RequestMapping("/create")
    public String newPost(Model model) {
        model.addAttribute("formtask", new Task());
        return "/create";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String postSave(Task task) {
        Task save = taskService.save(task);
        return "redirect:/";
    }


    @RequestMapping(value = "/task/delete/{id}")
    public String delete(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "redirect:/";

    }


}
