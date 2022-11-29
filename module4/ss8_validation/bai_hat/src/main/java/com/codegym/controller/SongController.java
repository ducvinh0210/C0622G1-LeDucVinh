package com.codegym.controller;

import com.codegym.dto.SongDto;
import com.codegym.model.Song;
import com.codegym.service.ISongService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/songs")
public class SongController {
    @Autowired
    ISongService songService;

    @GetMapping("")
    public String showList(Model model) {
        List<Song> songs = songService.findAll();
        model.addAttribute("songs", songs);
        return "/song/list";
    }

    @GetMapping("/create")
    public String showCreateSong(Model model){
        model.addAttribute("songDto",new SongDto());
        return "/song/create";

    }
    @PostMapping("/create")
    public String createForm(@Validated @ModelAttribute SongDto songDto, BindingResult bindingResult, Model model){
        new SongDto().validate(songDto,bindingResult);
        if (bindingResult.hasFieldErrors()){
            return "/song/create";
        }else{
            Song song= new Song();
            BeanUtils.copyProperties(songDto,song);
            songService.save(song);
            model.addAttribute("mess"," create song new successfully");
            return "/song/create";
        }
    }
    


}
