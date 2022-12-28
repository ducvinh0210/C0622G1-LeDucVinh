package com.codegym.controller;

import com.codegym.dto.FacilityDto;
import com.codegym.model.facility.Facility;
import com.codegym.model.facility.FacilityType;
import com.codegym.model.facility.RentType;
import com.codegym.service.IFacilityService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/facilities")
public class FacilityController {
    @Autowired
    private IFacilityService facilityService;

    @ModelAttribute("facilityTypeList")
    List<FacilityType> getFacilityType() {
        return facilityService.findAllFacilityType();
    }

    @ModelAttribute("rentTypeList")
    List<RentType> getRentType() {
        return facilityService.findAllRentType();

    }

    @GetMapping("")
    public ModelAndView showFacilities(@RequestParam(value = "nameSearch",defaultValue = "")String nameSearch,
                                       @RequestParam(value = "facilityType",defaultValue = "") String facilityType,
                                      @PageableDefault(value = 3) Pageable pageable){
    Page<Facility> facilities= facilityService.findAllByNameAndType(nameSearch,facilityType,pageable);
        ModelAndView modelAndView= new ModelAndView("facility/list");
        modelAndView.addObject("facilities",facilities);
        modelAndView.addObject("nameSearch",nameSearch);
        modelAndView.addObject("facilityType",facilityType);
        return modelAndView;
    }


    @GetMapping("/create")
    public ModelAndView showFormCreate() {
        ModelAndView modelAndView = new ModelAndView("facility/create");
        modelAndView.addObject("facilityDto", new FacilityDto());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView acceptCreateFacility(@ModelAttribute @Validated FacilityDto facilityDto, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("/facility/create");
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("facility/create");
            modelAndView.addObject("facilityTypeId", facilityDto.getFacilityType().getId());
            modelAndView.addObject("facilityDto", facilityDto);
            modelAndView.addObject("message", "Add new facility successfully");
            Facility facility = new Facility();
            BeanUtils.copyProperties(facilityDto, facility);
            facilityService.save(facility);
            return modelAndView;
        }
    }


    @GetMapping("/delete")
    public String deleteFacility(@RequestParam(value = "idDelete") int id, RedirectAttributes redirectAttributes) {
        facilityService.remove(id);
        redirectAttributes.addFlashAttribute("message", "Delete facility successfully");
        return "redirect:/facilities";
    }

    @GetMapping("/edit/{id}/{facilityType}")
    public ModelAndView editFacility(@PathVariable(value = "id") int id,
                                     @PathVariable(value = "facilityType") int facilityType){
        Optional<Facility> optionalFacility= facilityService.findById(id);
        ModelAndView modelAndView= new ModelAndView("/facility/edit");
        if (!optionalFacility.isPresent()){
            modelAndView.addObject("message","Facility not found");
            return modelAndView;
        }
        FacilityDto facilityDto= new FacilityDto();
        BeanUtils.copyProperties(optionalFacility.get(),facilityDto);
        modelAndView.addObject("facilityDto",facilityDto);
        return modelAndView;


    }
    @PostMapping("/edit")
    public ModelAndView edit(@ModelAttribute @Validated FacilityDto facilityDto, BindingResult bindingResult){
        new FacilityDto().validate(facilityDto, bindingResult);
        if(bindingResult.hasFieldErrors()){
            ModelAndView modelAndView= new ModelAndView("facility/edit");
            return modelAndView;
        }else {
            ModelAndView modelAndView= new ModelAndView("facility/edit");
            modelAndView.addObject("facilityDTO",facilityDto) ;
            modelAndView.addObject("message","edit facility successfully");

            Facility facility= new Facility();
            BeanUtils.copyProperties(facilityDto,facility);
            facilityService.save(facility);
            return modelAndView;
        }

    }


}
