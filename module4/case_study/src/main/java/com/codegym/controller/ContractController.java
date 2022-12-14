package com.codegym.controller;

import com.codegym.dto.ContractDetailDto;
import com.codegym.dto.ContractDto;
import com.codegym.dto.IContractDto;
import com.codegym.model.contract.Contract;
import com.codegym.model.contract.ContractDetail;
import com.codegym.service.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/contracts")
public class ContractController {
    @Autowired
    private IContractService contractService;

    @Autowired
    private IContractDetailService contractDetailService;

    @Autowired
    private ICustomerService customerService;

    @Autowired
    private IFacilityService facilityService;

    @Autowired
    private IEmployeeService employeeService;


    @GetMapping("")
    public ModelAndView showContracts(@PageableDefault(value = 3) Pageable pageable) {
        Page<IContractDto> contractPage = contractService.showListContract(pageable);
        ModelAndView modelAndView = new ModelAndView("contract/list");
        modelAndView.addObject("contractList", contractPage);
        modelAndView.addObject("attachFacilityList", contractService.findAllAttachFacility());
        modelAndView.addObject("contractDetailList", contractDetailService.findAll());
        modelAndView.addObject("facilityList", facilityService.findAll());
        modelAndView.addObject("employeeList", employeeService.findAll());
        modelAndView.addObject("customerList", customerService.findAll());
        modelAndView.addObject("contractDto", new ContractDto());
        modelAndView.addObject("contractDetailDto", new ContractDetailDto());
        return modelAndView;
    }

    @GetMapping("/add")
    public String getBackList() {
        return "redirect:/contracts";

    }

    @PostMapping("/add")
    public String saveContract(Model model, @ModelAttribute @Validated ContractDto contractDto, BindingResult bindingResult,
                               @PageableDefault(value = 3) Pageable pageable, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("contractList", contractService.showListContract(pageable));
            model.addAttribute("attachFacilityList", contractService.findAllAttachFacility());
            model.addAttribute("contractDetailList", contractDetailService.findAll());
            model.addAttribute("facilityList", facilityService.findAll());
            model.addAttribute("employeeList", employeeService.findAll());
            model.addAttribute("customerList", customerService.findAll());
            model.addAttribute("contractDetailDto", new ContractDetailDto());
            return "contract/list";

        }
        Contract contract = new Contract();
        BeanUtils.copyProperties(contractDto, contract);
        contractService.save(contract);
        redirectAttributes.addFlashAttribute("message", "create new contract successfully");
        return "redirect:/contracts";
    }


    @GetMapping("/add-contract-detail")
    public String returnList() {
        return "redirect:/contracts";
    }

    @PostMapping("/add-contract-detail")
    public String saveContractDetail(Model model, @ModelAttribute @Validated ContractDetailDto contractDetailDto,
                                     BindingResult bindingResult, @PageableDefault(value = 3) Pageable pageable,
                                     RedirectAttributes redirectAttributes) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("contractList", contractService.showListContract(pageable));
            model.addAttribute("attachFacilityList", contractService.findAllAttachFacility());
            model.addAttribute("contractDetailList", contractDetailService.findAll());
            model.addAttribute("facilityList", facilityService.findAll());
            model.addAttribute("employeeList", employeeService.findAll());
            model.addAttribute("customerList", customerService.findAll());
            model.addAttribute("contractDetailDto", contractDetailDto);
            model.addAttribute("contractDto", new ContractDto());
            return "contract/list";

        }
        ContractDetail contractDetail = new ContractDetail();
        BeanUtils.copyProperties(contractDetailDto, contractDetail);
        contractDetailService.save(contractDetail);
        redirectAttributes.addFlashAttribute("message", "craete new contract detail successfully");
        return "redirect:/contracts";

    }


}
